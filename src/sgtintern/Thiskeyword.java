package sgtintern;

public class Thiskeyword {
			  int c,d;
        public Thiskeyword(int c,int d) {
			    this.c = c;
			    this.d = d;
			    System.out.println(c+" "+d);
			  }
        public Thiskeyword(int c) {
		    this.c = c;
		    System.out.println(c);
		    }
        
			  public static void main(String[] args) {
			    
			    new Thiskeyword(10);
			    new Thiskeyword(10,20);
			    
			  }
			  }

	 
 
