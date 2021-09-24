package program4;

import java.util.Scanner;

public class Solution {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Document docs[]=new Document[4];
		for(int i=0;i<docs.length;i++)
		{
			int id=sc.nextInt();sc.nextLine();
			String title=sc.nextLine();
			String folderName=sc.nextLine();
			int pages=sc.nextInt();sc.nextLine();
			docs[i]=new Document(id,title,folderName,pages);
		}
		Document result=combineDoc(docs);
		System.out.println(result.getId());
		System.out.println(result.getTitle());
		System.out.println(result.getFolderName());
		System.out.println(result.getPages());		

	}
	public static Document combineDoc(Document[] docs)
	{
		int id;
		String title="";
		String folderName="";
		int pages=0,i;
		for(i=0;i<docs.length;i++)
		{
			if(i==docs.length-1)
			{
				title=title+docs[i].getTitle();
				folderName+=docs[i].getFolderName();
			}
			else
			{
			title=title+docs[i].getTitle()+'#';
			folderName+=docs[i].getFolderName()+'@';
			}
			pages+=docs[i].getPages();
		}
		id=++i;
		Document doc=new Document(id,title,folderName,pages);
		return doc;
	}

}
