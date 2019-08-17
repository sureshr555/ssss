package example1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sample {

	public static void main(String[] args) {
		
	
	int a[]={10,22,121,11,1,24,13};
	
	int temp=a[0];
	
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
	
	
	
if(temp<a[i])
{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	
}

}
	
}

System.out.println(temp);}}
