package javaStudy;

class IndexOf2 {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		
		/*
		 * String str1 = str.substring(4); System.out.println(str1);
		 */
		int s_idx = 0;	//������ġ
		int e_idx = 0;  //��������ġ
		while(true) {
			e_idx = str.indexOf(" ", s_idx + 1);
			if(e_idx == -1) break;
			String s1 = str.substring(s_idx, e_idx);
			System.out.println(s1);
			s_idx = e_idx;
		}
		
		//int idx1 = str.indexOf(" ");
		//String s1 = str.substring(0, idx1);
		
		//int idx2 = str.indexOf(" ", idx1);
		
		 int idx = 0; 
		 while(idx > -1) { 
			 idx = str.indexOf("��", idx + 1);
			 System.out.println(idx); 
		 }
		 
	}
}
