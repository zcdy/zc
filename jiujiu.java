class jiujiu 
{
	public static void main(String[] args) 
	{
		for (int x=1;x<=9 ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");//这里用“\t”而不是空格，是为了排列美观
			}
			System.out.println();//换行
		}
	}
}
