package java0122;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class CharacterStream {

	public static void main(String[] args) {
		try(
				//���Ͽ� ���� ������ ����ϱ� ���� ��Ʈ��
				PrintWriter pw = new PrintWriter("./data.txt");
				BufferedReader br = new BufferedReader(
						new FileReader("./data.txt"));
				){
			
			pw.println("�ȳ��ϼ��� �ݰ����ϴ�.");
			pw.println("���� �𷹸� �����Դϴ�.");
			
			//������ ���� �б�
			while(true) {
				//�� �� �б�
				String line = br.readLine();
				//�� �о����� ����
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
			
		}catch(Exception e) {
			System.out.println("����:" + e.getMessage());
		}

	}

}
