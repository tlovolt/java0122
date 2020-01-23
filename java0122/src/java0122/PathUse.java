package java0122;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUse {

	public static void main(String[] args) {
		//src ���丮�� �ִ� 0.png ������ Path ��ü�� ����
		Path path = Paths.get("./src/0.png");
		//������ ���� ��θ� ����
		Path to = Paths.get("./src/zero.png");
		
		try {
			//path���� to�� ����
			Files.copy(path, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}




