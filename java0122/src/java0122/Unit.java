package java0122;

import java.io.Serializable;

public class Unit implements Serializable{
	private static final long serialVersionUID = 1L;

	private int num;
	private String name;
	private int offence;
	private int deffence;
	private int level;
	
	//�Ű������� ���� ������ - �⺻ �����Ͱ� �������� ���� �� ���
	public Unit() {
		super();
	}

	//��� �Ӽ��� �Ű������� �޾Ƽ� �������ִ� ������
	//�⺻ �����Ͱ� ������ �� ��� - �׽�Ʈ �� �� ����
	public Unit(int num, String name, int offence, int deffence, int level) {
		super();
		this.num = num;
		this.name = name;
		this.offence = offence;
		this.deffence = deffence;
		this.level = level;
	}

	//������ �޼ҵ�
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOffence() {
		return offence;
	}

	public void setOffence(int offence) {
		this.offence = offence;
	}

	public int getDeffence() {
		return deffence;
	}

	public void setDeffence(int deffence) {
		this.deffence = deffence;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		//������ ����� �� offence ���� �ڵ����� �ٽ� ����
		this.level = level;
		offence = offence + level * 10;
	}

	//��� �Ӽ��� ���� �ϳ��� ���ڿ��� ���� �������ִ� �޼ҵ�
	//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� �� �޼ҵ尡 ȣ��˴ϴ�.
	//��� ��ü ������� �� ����� �̿��ؼ� ����մϴ�.
	//�޼ҵ� �̸��� �ٸ� ���Դϴ�.
	@Override
	public String toString() {
		return "Unit [num=" + num + ", name=" + name + ", offence=" + offence + ", deffence=" + deffence + ", level="
				+ level + "]";
	}	
}





