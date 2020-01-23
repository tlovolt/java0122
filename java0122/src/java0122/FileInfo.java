package java0122;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		//���� ��θ� �̿��ؼ� ���� �ν��Ͻ� ����
		//File f = new File("C:\\Users\\admin\\Documents\\0.png");
		
		//��� ��θ� �̿��ؼ� ���� �ν��Ͻ� ���� : ������ ������Ʈ ���丮�� �����ϰ� ����
		File f = new File("./src/0.png");
		//������ ���� ���� Ȯ�� - ���� & Ŭ���̾�Ʈ ȯ�濡�� Ŭ���̾�Ʈ�� ���� ���翩�θ� Ȯ���ؼ� �ٿ�ε�
		boolean isExists = f.exists();
		System.out.println("���翩��:" + isExists);
		//������ ������ ���� �ð� Ȯ�� - ������Ʈ�� �� �� �ð��� ���� �ٸ��� �ٿ�ε�
		long modify = f.lastModified();
		System.out.println("������ �����ð�:" + modify);
		
		//�����ð��� �츮�� ����ϴ� �ð����� ����
		Date date = new Date(modify);
		System.out.println("������ �����ð�:" + date);
		
		//������ ũ�� Ȯ�� - ������Ʈ�� ���� ����� �� �ְ� �ٿ�ε� ���θ� �����ϴµ��� �̿�
		//������ ũ�⸦ �˷��༭ �ٿ�ε� ���θ� �Ǵ��ϵ��� �ϴ� ��찡 �ֽ��ϴ�.
		long size = f.length();
		System.out.println("����ũ��:" + size);
		

	}

}
