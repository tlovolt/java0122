package java0122;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteInputOutput {

	public static void main(String[] args) {
		//try() 안에서 만든 자원은 close를 호출하지 않아도 됩니다.
		try(
				//파일에 기록하기 위한 인스턴스 생성
				//파일 경로만 설정하면 기록할 때 마다 새로 기록
				//두번째 매개변수로 true를 설정하면 존재하는 경우 이어쓰기를 합니다.
				FileOutputStream fos = new FileOutputStream("./file.dat", true);
				//파일에서 읽어오기 위한 인스턴스 생성
				FileInputStream fis = new FileInputStream("./file.dat");
		){
			//기록할 내용 만들기
			String msg = "안녕하세요 반갑습니다.";
			//문자열을 바이트 배열로 만들기
			byte [] b = msg.getBytes();
			//기록
			fos.write(b);
			fos.flush();
			
			/*
			//한번에 읽기
			//읽을 데이터 개수를 가져오기
			int len = fis.available();
			//읽은 데이터를 저장할 배열을 생성
			b = new byte[len];
			//데이터 읽기
			fis.read(b);
			//바이트 배열을 문자열로 변환
			String data = new String(b);
			System.out.println(data);
			*/
			
			//용량이 큰 경우 한번에 읽으면 메모리 부족으로 예외가 생기거나 시간이 오래 걸릴 수 있습니다.
			//나누어서 읽는 것이 효율적
			
			//저장할 배열을 생성 - 크기는 8의 배수로 생성하는 것이 일반적
			byte [] split = new byte[8];
			while(true) {
				//split 크기만큼 읽고 읽은 개수를 리턴
				int r = fis.read(split);
				//r이 0보다 작거나 같으면 읽은게 없음
				if(r <= 0) {
					break;
				}
				//읽은 데이터가 있으면 처리
				//문자를 바이트로 읽어서 변환하지는 않음
				//데이터를 사용할 때 배열을 바로 사용하면 안되고 0부터 읽은 개수만큼만 사용해야 합니다.
				//전체를 사용하는 경우 읽은 개수가 부족하면 이상한 결과를 만듭니다.
				String str = new String(split, 0, r);
				System.out.println(str);
			}
			
		}catch(Exception e) {
			System.out.println("예외내용:" + e.getMessage());
		}

	}

}




