package gr.upatras.junit.first;
public class MyClass {

 public String subtract(int x, int y) {
	 if ( (x - y)>0) {
		 return "POSITIVE";
	 }
	 else {
		if ( (x - y)<0) {
		 return "NEGATIVE";
		}
		else return "ZERO";
 	}
 }
}
