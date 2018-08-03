package cardgame;

public class CardGame {
	private int i,j;
	
	public void setTableNumbers() {
		
		String [][] a= new String[13][5];
		
		for(i=0; i<1;i++) {
			for(j=1; j<5;j++) {
				System.out.print("   ");
				System.out.print("  "+j);
			}
			}
		System.out.println("   ");
		for(i=0; i<1;i++) {
			for(j=1; j<5;j++) {
				System.out.println("   ");
				System.out.print(j);
				a[i][j]= "    *";
				System.out.print(a[i][j]);
				System.out.print(i+"  "+j);	
				i++;
				a[i][j]= "     *";
				System.out.print(a[i][j]);
				System.out.print(i+"  "+j);	
				i++;
				a[i][j]= "     *";
				System.out.print(a[i][j]);
				System.out.print(i+"  "+j);	
				i++;
				a[i][j]= "     *";
				System.out.print(a[i][j]);
				System.out.print(i+"  "+j);	
				
			}
	}
			
	}
	
	public String getIj() {
		return(i+""+j);
	}
}

	
	






