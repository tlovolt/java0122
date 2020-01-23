package java0122;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SerializableMain {
	public static void main(String [] args) {
		Unit unit = new Unit(1, "��ũ", 10, 10, 0);
		System.out.println(unit);
		unit.setLevel(1);
		System.out.println(unit);
		System.out.println("==================================");
		
		//byte �� char(String)�� �ƴ� �����͸� �а� �� ���� ObjectOutputStream,
		//ObjectInputStream �� �̿�
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(
					new FileOutputStream("./star.dat"));
				
			ObjectInputStream ois = 
				new ObjectInputStream(
					new FileInputStream("./star.dat"));){
			//������ ��� : unit �� Ŭ������ Unit �� Serializable �������̽��� �������� �ʾҴٸ�
			//ClassCastException�� �߻� - �� ��ȯ�� �ȵȴٰ� ���� �߻�
			/*
			oos.writeObject(unit);
			
			Unit unit1 = new Unit(2, "����", 5, 5, 0);
			oos.writeObject(unit1);
			
			//������ �о����
			Unit unit2 = (Unit)ois.readObject();
			System.out.println(unit2);
			Unit unit3 = (Unit)ois.readObject();
			System.out.println(unit3);
			*/
			
			Unit unit1 = new Unit(2, "����", 5, 5, 0);
			ArrayList<Unit> list = new ArrayList<Unit>();
			list.add(unit);
			list.add(unit1);
			oos.writeObject(list);
			
			//List�� ������ ������ �о����
			ArrayList<Unit> read = (ArrayList<Unit>)ois.readObject();
			for(Unit u : read) {
				System.out.println(u);
			}
			
		}catch(Exception e) {
			System.out.println("����:" + e.getMessage());
		}
	}
}








