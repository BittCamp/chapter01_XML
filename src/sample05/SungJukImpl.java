package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[실행결과]");
		System.out.println("이름 입력 :");
		this.name = scan.next();
		System.out.println("국어 입력 :");
		kor = scan.nextInt();
		System.out.println("영어 입력 :");
		eng = scan.nextInt();
		System.out.println("수학 입력 :");
		math = scan.nextInt();
	}
	
	@Override
	public void calc() {
		tot = (kor+eng+math);
		avg = (double)tot/3;
	}

	@Override
	public void display() {
		System.out.println("이름	국어	영어	수학	총점	평균");
		System.out.println(name+ "\t" + kor+ "\t" + eng+ "\t" + math 
				+ "\t" + tot + "\t" + String.format("%.2f", avg));
	}

}
