package java0122;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BufferInputOutput {

	public static void main(String[] args) {
		try(PrintStream ps = new PrintStream(new FileOutputStream("./buf.dat"));
				BufferedInputStream bis = 
						new BufferedInputStream(
								new FileInputStream("./buf.dat"));
		){
			//����ϱ�
			ps.println("Hello Buffered Stream");
			ps.flush();
			
			//�б�
			//���� ������ ũ�� ��������
			int len = bis.available();
			//���� �����͸� ������ �迭 ����
			byte [] b = new byte[len];
			//������ �б�
			bis.read(b);
			//���� �����͸� ���ڿ��� ��ȯ�ؼ� ���
			System.out.println(new String(b));
			
		}catch(Exception e) {
			System.out.println("����:" + e.getMessage());
		}

	}

}






