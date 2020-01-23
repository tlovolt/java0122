package java0122;

import java.io.RandomAccessFile;

public class RandomFileMain {

	public static void main(String[] args) {
		try(
				//���� �а� ���� ��ü ����
				RandomAccessFile f = new RandomAccessFile("./random.txt", "rw");
				){
			
			//����� ���� ����
			String msg = "Hello Random Access File";
			//���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ���
			f.write(msg.getBytes());
			
			//������ �б�
			//���� �����͸� ���� ��ġ�� �̵�
			f.seek(0);
			//5�� �б�
			byte [] b = new byte[5];
			f.read(b);
			//����Ʈ �迭�� ���ڿ��� ��ȯ�ؼ� ���
			System.out.println(new String(b));
			
			//���� �����͸� ������ġ�� �ٽ� �Űܼ� �ٽ� �о� ��
			f.seek(0);
			//5�� �б�
			b = new byte[5];
			f.read(b);
			//����Ʈ �迭�� ���ڿ��� ��ȯ�ؼ� ���
			System.out.println(new String(b));
			
		}catch(Exception e) {
			System.out.println("����:" + e.getMessage());
		}

	}

}
