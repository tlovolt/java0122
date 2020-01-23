package java0122;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteInputOutput {

	public static void main(String[] args) {
		//try() �ȿ��� ���� �ڿ��� close�� ȣ������ �ʾƵ� �˴ϴ�.
		try(
				//���Ͽ� ����ϱ� ���� �ν��Ͻ� ����
				//���� ��θ� �����ϸ� ����� �� ���� ���� ���
				//�ι�° �Ű������� true�� �����ϸ� �����ϴ� ��� �̾�⸦ �մϴ�.
				FileOutputStream fos = new FileOutputStream("./file.dat", true);
				//���Ͽ��� �о���� ���� �ν��Ͻ� ����
				FileInputStream fis = new FileInputStream("./file.dat");
		){
			//����� ���� �����
			String msg = "�ȳ��ϼ��� �ݰ����ϴ�.";
			//���ڿ��� ����Ʈ �迭�� �����
			byte [] b = msg.getBytes();
			//���
			fos.write(b);
			fos.flush();
			
			/*
			//�ѹ��� �б�
			//���� ������ ������ ��������
			int len = fis.available();
			//���� �����͸� ������ �迭�� ����
			b = new byte[len];
			//������ �б�
			fis.read(b);
			//����Ʈ �迭�� ���ڿ��� ��ȯ
			String data = new String(b);
			System.out.println(data);
			*/
			
			//�뷮�� ū ��� �ѹ��� ������ �޸� �������� ���ܰ� ����ų� �ð��� ���� �ɸ� �� �ֽ��ϴ�.
			//����� �д� ���� ȿ����
			
			//������ �迭�� ���� - ũ��� 8�� ����� �����ϴ� ���� �Ϲ���
			byte [] split = new byte[8];
			while(true) {
				//split ũ�⸸ŭ �а� ���� ������ ����
				int r = fis.read(split);
				//r�� 0���� �۰ų� ������ ������ ����
				if(r <= 0) {
					break;
				}
				//���� �����Ͱ� ������ ó��
				//���ڸ� ����Ʈ�� �о ��ȯ������ ����
				//�����͸� ����� �� �迭�� �ٷ� ����ϸ� �ȵǰ� 0���� ���� ������ŭ�� ����ؾ� �մϴ�.
				//��ü�� ����ϴ� ��� ���� ������ �����ϸ� �̻��� ����� ����ϴ�.
				String str = new String(split, 0, r);
				System.out.println(str);
			}
			
		}catch(Exception e) {
			System.out.println("���ܳ���:" + e.getMessage());
		}

	}

}




