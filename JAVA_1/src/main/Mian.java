package main;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {

				System.out.println(" === 천하무적 신짱 === ");
				
				CrayonShinchan Shinchan = new CrayonShinchan();
				CrayonShinchan mom = new CrayonShinchan();
				CrayonShinchan dad = new CrayonShinchan();
				
				//캐릭터들 상태
				Shinchan.name = "신짱구";
				Shinchan.hp = 100;
				Shinchan.atk = 15;
				mom.name = "봉미선";
				mom.hp = 200;
				mom.atk = 30;
				dad.name = "신형만";
				dad.hp = 220;
				dad.atk = 25;
				
				//유저 출력 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("\n !! 캐릭터를 선택하세요 !! \n");
		        System.out.print(" 1.신짱구");
		        System.out.print("  2.봉미선");
		        System.out.print("   3.신형만");
		        
		        int num = sc.nextInt();
		        CrayonShinchan user = null;
		        CrayonShinchan enemy = null;
		        
		        switch (num) {
	            case 1: 
	            	user = Shinchan; 
	            	enemy = mom; break;
	            case 2: 
	            	user = mom; 
	            	enemy = dad; break;
	            case 3: 
	            	user = dad; 
	            	enemy = Shinchan; break;
		        }//switch end
		        
		        System.out.println("\n--- 캐릭터 상태 ---");
		        user.printInfo();
		        enemy.printInfo();
		        
		        //battle
		        System.out.println("\n--------전투 시작----------");
		        
		        while(user.hp >0 && enemy.hp > 0) {
		        System.out.println( user.name + "의 공격 & ");
		        System.out.println( enemy.name + "의 무시무시한 반격 \n");
		        user.hp -= enemy.atk;
		        enemy.hp -= user.atk;
		      
		        
		        //결과 값 정보 확인
		        System.out.println("--------RESULT----------" );
		        user.printInfo();
		        enemy.printInfo();
		        }//while End
		        
		        System.out.println("--------상황 종료----------" );
		        System.out.println("        도망 가는 중~ " );
		        
		        
		        
		        


				
				
				
		
		
	}//Main
	}//class