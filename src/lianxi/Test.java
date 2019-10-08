package lianxi;

import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				for(int k=1;k<5;k++){
					if(i!=j&&i!=k&&j!=k){
						b=i*100+j*10+k;
						System.out.println(b);
					}
				}
			}
		}
		
}
}