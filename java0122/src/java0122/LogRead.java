package java0122;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LogRead {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("./log.txt"));){
			
			//������ ������ �ٴ����� �б�
			
			
			//Ʈ������ �հ踦 ������ ����
			int total = 0;
			//������ IP �ּҸ� �ߺ����� ���
			HashSet<String> set = new HashSet<String>();
			//������ IP �� Ʈ���� �հ�
			//Map���� ���� Key�� ����ϸ� null�� ����
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(line);
				//������ �������� ����
				String [] ar = line.split(" ");
				
				//ip�� ������ �����Ͱ� �ִ��� Ȯ��
				Integer traffic = map.get(ar[0]);
				//���� �����͸� traffic �� 0
				if(traffic == null) {
					traffic = 0;
				}
				try {
					traffic = traffic + Integer.parseInt(ar[ar.length-1]);
				}catch(Exception e) {}
				//map �� ���� :  ������ key ������ �ϸ� ������Ʈ
				map.put(ar[0], traffic);
				
				
				//���� ������ ������ ���
				//System.out.println(ar[ar.length-1]);
				
				//Set�� ù��° �׸��� ���� - �ߺ��� �����ʹ� �������� ����
				set.add(ar[0]);
				
				//���� ������ �����͸� ������ ��ȯ�ؼ� total�� �߰�
				//���ܰ� �߻��ؼ� �ߴܵǸ� try ~ catch�� ���θ� ���ܰ� �߻��ص� ��� �����մϴ�.
				try {
					total = total + Integer.parseInt(ar[ar.length-1]);
				}catch(Exception e) {}
			}
			
			System.out.println("Ʈ���� �հ�:" + total);
			System.out.println("====================");
			//Set ���
			for(String ip : set) {
				System.out.println(ip);
			}
			System.out.println("====================");
			
			//Map �� Key �� Value�� ���� ����ϱ�
			Set<String> keys = map.keySet();
			for(String key : keys) {
				System.out.println(key + ":" + map.get(key));
			}
			
		}catch(Exception e) {
			System.out.println("����:" + e.getMessage());
		}

	}

}






