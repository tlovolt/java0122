package java0122;

import java.io.Serializable;

public class Unit implements Serializable{
	private static final long serialVersionUID = 1L;

	private int num;
	private String name;
	private int offence;
	private int deffence;
	private int level;
	
	//매개변수가 없는 생성자 - 기본 데이터가 제공되지 않을 때 사용
	public Unit() {
		super();
	}

	//모든 속성을 매개변수로 받아서 생성해주는 생성자
	//기본 데이터가 제공될 때 사용 - 테스트 할 때 좋음
	public Unit(int num, String name, int offence, int deffence, int level) {
		super();
		this.num = num;
		this.name = name;
		this.offence = offence;
		this.deffence = deffence;
		this.level = level;
	}

	//접근자 메소드
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
		//레벨이 변경될 때 offence 값이 자동으로 다시 계산됨
		this.level = level;
		offence = offence + level * 10;
	}

	//모든 속성의 값을 하나의 문자열로 만들어서 리턴해주는 메소드
	//출력하는 메소드에 인스턴스 이름을 대입하면 이 메소드가 호출됩니다.
	//모든 객체 지향언어는 이 방식을 이용해서 출력합니다.
	//메소드 이름이 다를 뿐입니다.
	@Override
	public String toString() {
		return "Unit [num=" + num + ", name=" + name + ", offence=" + offence + ", deffence=" + deffence + ", level="
				+ level + "]";
	}	
}





