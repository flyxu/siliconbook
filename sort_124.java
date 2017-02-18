package silicon;

import javax.xml.parsers.DocumentBuilder;

public class sort_124 {
	public double sqrt(double a){
		if(a==0||a==1)
			return 0;
		double precision=1.0e-7,start=0,end=0;
		if(a<1) end=1;
		while(end-start>precision){
			double mid=(start+end)/2;
			if(mid==a/mid){
				return mid;
			}
			else if(mid>a/mid) end=mid;
			else start=mid;
		}
		return (start+end)/2;
	}
	//扩展
	public double sqrt2(double d){
		if(d==0.0) return 0;
		double root=d/2;
		double tolerance=1.0e-7;
		do{
			root=(root+d/root)/2;
		}while(Math.abs(root*root-d)>tolerance);
		return root;		
	}
	
}
