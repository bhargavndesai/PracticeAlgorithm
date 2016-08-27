public class AnagranDetect {
	public Boolean isAnangram(String source,String target)
	{
		if(source.length()!=target.length())
			return false;
		char src[]=source.toCharArray();
		int temp[]=new int[256];
		char trg[]=target.toCharArray();
		for(char c:src)
		{
			temp[c]++;
		}
		for(int i=0;i<target.length();i++)
		{
			int letter=(int)target.charAt(i);
			if(--temp[letter]<0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		AnagranDetect ana= new AnagranDetect();
		System.out.println(ana.isAnangram("godi", "doga"));

	}

}
