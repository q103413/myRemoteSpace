package cases;

import java.util.*;

public class BasicCases {
//	猴子吃桃子 
	//n为天数
	public int peachMonkey(int n){
		if (n==10) {
			return 1;
		}
		return (peachMonkey(n+1)+1)*2;
//	    for(int i=2; i<=n; i++) {     //前九天
//	      lastdayNum = (lastdayNum+1) * 2;  
//	    }   
//	    return lastdayNum; 
	}
//	Josephus Problem
	public int josephusProblem1(int total,int count){
		//初始化人数
		List<Integer> start = new ArrayList<Integer>();
		for (int i = 1; i <=total; i++) {
			start.add(i);	
		}
		//从第k个开始计数
		int k=0;
		while (start.size()>0) {
			k = k+count;
			//第m人的索引位置
			k = k % (start.size())-1;
			//判断是否到对尾
			if (k<0) {
				System.out.println(start.get(start.size()-1));
				start.remove(start.size()-1);
				k=0;
			}else{
				System.out.println(start.get(k)); 
				start.remove(k);
			}
		}
		return 0;
	}
	public int josephusProblem2(int total,int count){
		List<Integer> all = new LinkedList<Integer>();
		for (int i = 1; i <= total; i++) {
			all.add(i);
		}
		int i=0;
		int s = all.size();
		for(int n=1;n<total;n++){
			i=(i+count-1)%all.size();
			all.remove(i);
		}
		System.out.println(all.get(0));
		return all.get(0);
	}
	//字符串成逆序String.valueOf(x)
	public String reverseString(String s){
		String ress="";
		for (int i = s.length()-1; i >=0; i--) {
			char a = s.charAt(i);
			ress += String.valueOf(a);//char转换为string类型
		}
		return ress;
	}
}
//约瑟夫问题变化
class josephusProblem {
	static final int nums = 41;//总共多少人
	static final int killMan=3;//数到3则被杀
	public static void main(String[] args) {
		jufehus(2);
	}
	public static void jufehus(int alive){
		int[] man = new int[nums];//未被杀的都标记为0
		int pos = -1;//数组角标
		int i =0;
		int count = 1;//杀到第几个记录值

       while (count <= nums) {
             do {
                 pos = (pos + 1) % nums;// 循环标记
                if (man[pos] == 0)
                     i++;
                if (i == killMan) {
                    i = 0; // 重置
                    break;// 找到了被杀的位置，跳出循环，进行标记
                }
             } while (true);
            man[pos] = count;
            count++;
        }
		//显示不被杀的位置
		alive = count -alive;
		for (int j = 0; j < man.length; j++) {
			if (man[j] >= alive)
				System.out.println("不被杀的位置是->"+(j+1));
		}
	}
}