import java.util.Random;
import java.util.Scanner;
class Quiz {
	Scanner input = new Scanner(System.in);
	Random r = new Random();
	String  name, password;
	double score=0, nScore=0;
	int questionCounter=0, questionCounter1=0, questionCounter2=0, questionCounter3=0, questionCounter4=0, questionCounter5=0 ;
	String[] ans = new String[5];
	void Question(){
		System.out.println("\n-----------------------------");
		System.out.println("\tQUIZ START");
		System.out.println("-----------------------------");
		do{
		int randomNum=r.nextInt(1,6);
		switch(randomNum){
		case 1: {
		if(questionCounter1==0){
		System.out.println("Q Who is the first PM of Pakistan ? ");
		System.out.println("a. Liaqat Ali Khan ");
		System.out.println("b. Allama Iqbal ");
		System.out.println("c. Quaid Azam ");
		System.out.println("d. Iskandar Ali Mirza ");
		this.ans[0]=input.nextLine();
		questionCounter1++;
		if (this.ans[0].equalsIgnoreCase("A")){
		this.score+=1;	
		}
		}
		else{break;}
		break;
		}
		case 2:{
		if(questionCounter2==0){
		System.out.println("Q Who is the national poet of Pakistan ? ");
		System.out.println("a. Mahmood Shaam ");
		System.out.println("b. Mohsin Naqvi ");
		System.out.println("c. Munir Niazi ");
		System.out.println("d. Allama Iqbal");
		this.ans[1]=input.nextLine();
		questionCounter2++;
		if (this.ans[1].equalsIgnoreCase("D")){
		this.score+=1;
		}}break;
		}
		case 3:{
		if(questionCounter3==0){
		System.out.println("Q Who invented Computer ?");
		System.out.println("a. Ernest Rutherford  ");
		System.out.println("b. Isaac Newton");
		System.out.println("c. Charles Babbage");
		System.out.println("d. Franz Boas");
		this.ans[2]=input.nextLine();
		questionCounter3++;
		if (this.ans[2].equalsIgnoreCase("C")){
		this.score+=1;
		}
		}break;}	
		case 4:{
		if(questionCounter4==0){
		System.out.println("Q The step by step procedure for solving a problem ? ");
		System.out.println("a. Programming");
		System.out.println("b. Algorithm ");
		System.out.println("c. Planing ");
		System.out.println("d. Flowchart");
		this.ans[3]=input.nextLine();
		questionCounter4++;
		if (this.ans[3].equalsIgnoreCase("B")){
		this.score+=1;
		}}break;
		}
		case 5:{
		if(questionCounter5==0){
		System.out.println("Q Which of the following is the first calculating device ? ");
		System.out.println("a. Abacus");
		System.out.println("b. Caculator ");
		System.out.println("c. Computer ");
		System.out.println("d. Electronic calculating machine");
		this.ans[4]=input.nextLine();
		questionCounter5++;
		if (this.ans[4].equalsIgnoreCase("A")){
		this.score+=1;
		}}break;
		}
		}
		}while(questionCounter1<1 || questionCounter2<1 || questionCounter3<1 || questionCounter4<1 || questionCounter5<1);
		}
		void Result(){
			System.out.println("-------------------");
			System.out.println("\tRESULT");
			System.out.println("-------------------");
			for (int i=0; i<5; i++){
			if(i==0){
			if (this.ans[0].equalsIgnoreCase("A")){
			System.out.println(this.ans[i]+"  is RIGHT answer "); 
			}
			else {
			System.out.println(this.ans[i]+"  is WRONG answer "); 
			if(this.score==0){
			this.score=0;
			}
			else if (this.score>=0.5){
			this.score-=0.5;
			//this.nScore+=0.5;
			}
			}	}
			else if(i==1){
			if (this.ans[1].equalsIgnoreCase("D")){
			System.out.println(this.ans[i]+"  is RIGHT answer ");
			}
			else {
			System.out.println(this.ans[i]+" is WRONG answer "); 
			if(this.score==0){
			this.score=0;
			}	
			else if (this.score>=0.5){
			this.score-=0.5;
			//this.nScore+=0.5;
			}	}	}
			else if(i==2){
			if (this.ans[2].equalsIgnoreCase("C")){
			System.out.println(this.ans[i]+"  is RIGHT answer "); 
			}
			else {
			System.out.println(this.ans[i]+"  is WRONG answer "); 
			if(this.score==0){
			this.score=0;}
			else if (this.score>=0.5){
			this.score-=0.5;
			//this.nScore+=0.5;
			}	}	}
			else if(i==3){
			if (this.ans[3].equalsIgnoreCase("B")){
			System.out.println(this.ans[i]+"  is RIGHT answer ");
			}
			else {
			System.out.println(this.ans[i]+" is WRONG answer "); 
			if(this.score==0){
			this.score=0;
			}	
			else if (this.score>=0.5){
			this.score-=0.5;
			//this.nScore+=0.5;
			}	}	}
			else if(i==4){
			if (this.ans[4].equalsIgnoreCase("A")){
			System.out.println(this.ans[i]+"  is RIGHT answer "); 
			}
			else {
			System.out.println(this.ans[i]+"  is WRONG answer "); 
			if(this.score==0){
			this.score=0;}
			else if (this.score>=0.5){
			this.score-=0.5;
			//this.nScore+=0.5;
			}	}	}
			}
			System.out.println("-------------------------------");
			System.out.println("Your Score is : "+this.score+"/5");
			if(this.nScore>0 && this.score>0){
			System.out.println("NOTE : "+this.nScore + " negative marks subtracted from Your Score");}
			System.out.println("-------------------------------");}
	void Key(){
		System.out.println("----------------------------");
		System.out.println("\t\tKEY");
		System.out.println("----------------------------");
		System.out.println("Q.1 First PM of Pakistan is					(a.Liaqat Ali Khan)");
		System.out.println("Q.2 National poet of Pakistan is				(d. Allama Iqbal)");
		System.out.println("Q.3 Computer is invented by					(c. Charles Babbage)");
		System.out.println("Q.4 The step by step procedure for solving a proble is		(b. Algorithm)");
		System.out.println("Q.5 First calculating device is 		 		(a. Abacus   )");
		}
	void Information(){
		System.out.println("CREATE ACCOUNT");
		System.out.println("________________________");
		System.out.println ("Enter name ");
		this.name=input.nextLine();
		System.out.println ("Enter Password to login");
		this.password=input.nextLine();
		System.out.println("________________________");
		try {
    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
		catch (Exception ex) {
    		ex.printStackTrace();
		}
		System.out.println("******************************");
		System.out.println ("Successfully! Account created");
		System.out.println("******************************");
		Question();
		try {
    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
		catch (Exception ex) {
    		ex.printStackTrace();
		}
		Result();		
		System.out.println("\nDo you want to know the RIGHT answers ?");
		System.out.println("Press 'Y' for YES and 'N' for NO");
		char ch = input.next().charAt(0);
		if(ch=='y'|| ch=='Y'){
			Key();	}}
	void Display(){
		try {
    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
		catch (Exception ex) {
    		ex.printStackTrace();
		}
		System.out.println("===================");
		System.out.println("Name : "+this.name);
		System.out.println("Score : "+this.score);
		System.out.println("===================");
		}}
class onlineQuiz{
	public static void main(String args[]){
	int numOfstu=0, size=5, opt;
	Quiz[] Q=new Quiz[size];
	for(int i=0; i<size; i++){
		Q[i]=new Quiz();}
	Scanner input = new Scanner(System.in);
	
	try {
    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
		catch (Exception ex) {
    		ex.printStackTrace();
		}
	do{	
		
		System.out.println("-----------------------");
		System.out.println("\tONLINE QUIZ ");
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("Press 1 for Quiz: ");
		System.out.println("Press 2 for Search: ");
		System.out.println("Press 3 for Topper: ");
		System.out.println("Press 4 for Lower: ");
		System.out.println("Press 0 for Exit: ");
		System.out.println("------------------------");
		opt=input.nextInt();
		if(opt>4){
			System.out.println("\n-----------------------------");
			System.out.println("\tINVALID ");
			System.out.println("\tTRY AGAIN ");
			System.out.println("-----------------------------");
			}
		switch(opt){
		case 1:
		{
		try {
    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
		catch (Exception ex) {
    		ex.printStackTrace();
		}
		System.out.println("-----------------------------------");
		System.out.println("Do you want to attempt QUIZ ");
		System.out.println("Press 'Y' for YES and Press 'N' for NO");
		System.out.println("-----------------------------------");
		input.nextLine();
		String ans=input.nextLine();
		if(ans.equals("y") || ans.equals("Y")){
			do{
				try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			Q[numOfstu].Information();
			numOfstu++;
			System.out.println("\n\n.....................................");
			System.out.println("Another Student want to attempt Quiz");
			System.out.println(".....................................");
			System.out.println("\nPress 'Y' for YES and 'N' for NO ");
			ans=input.nextLine();		
			}while(ans.equals("Y") || ans.equals("y") );
			}
			break;
		}
		case 2:
		{
			int passwordMatch=0;
			if(numOfstu>0)
			{
				try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			System.out.println("-------------------------");
			System.out.println("Enter password to search");
			System.out.println("-------------------------");
			input.nextLine();
			String pass = input.nextLine();
			for(int i=0; i<size; i++){
			if(pass.equals(Q[i].password)){
				Q[i].Display();
				passwordMatch++;
				}
			}	
			if(passwordMatch==0){
				try {
    			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
			catch (Exception ex) {
    			ex.printStackTrace();
			}
			System.out.println("______________________");
			System.out.println("Incorrect Password ");
			System.out.println("Enter valid password");
			System.out.println("______________________");
			}
				}
			else if(numOfstu==0) {
				try {
    			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
			catch (Exception ex) {
    			ex.printStackTrace();
			}
			System.out.println("\nSORRY! still no any student attempt the quiz");
			System.out.println("____________________________________________");
			}
			break;
			}
		case 3:
		{
			int topScore=0;
			if(numOfstu>0){
			for(int i=0; i<size; i++){
			if((int)Q[i].score>topScore){
				topScore=(int)Q[i].score;
			}}}
			if(numOfstu>0){
			try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			for(int i=0; i<numOfstu; i++){
			if((int)Q[i].score==topScore){
			System.out.println("==========================");
			System.out.println("TOPPER : "+Q[i].name);
			System.out.println("SCORE : "+Q[i].score);
			System.out.println("==========================");}
			}}
			else{
				try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			System.out.println("--------------------------------------");
			System.out.println("Still no any student attempt the quiz:");
			System.out.println("--------------------------------------");
			}
			break;	
			}
		case 4:
		{
			int lowScore=5;
			if(numOfstu>0){
			for(int i=0; i<numOfstu; i++){
			if((int)Q[i].score<lowScore){
				lowScore=(int)Q[i].score;
			}}}
			if(numOfstu>0){
			try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			for(int i=0; i<numOfstu; i++){
			if((int)Q[i].score==lowScore){
			System.out.println("==========================");
			System.out.println("LOWER : "+Q[i].name);
			System.out.println("SCORE : "+Q[i].score);
			System.out.println("==========================");}
			}}
			/*else if (lowScore==0){
			if(numOfstu>0){
			try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			for(int i=0; i<size; i++){
			if((int)Q[i].score==lowScore){
			System.out.println("==========================");
			System.out.println("LOWER : "+Q[i].name);
			System.out.println("SCORE : "+Q[i].score);
			System.out.println("==========================");}
			}}}*/
			else{
				try {
    				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} 
				catch (Exception ex) {
    				ex.printStackTrace();
				}
			System.out.println("************************************");
			System.out.println("Still no any student attempt the quiz:");
			System.out.println("************************************");
			}
			break;	
			}
		}
	}while(opt>0);
	}
}