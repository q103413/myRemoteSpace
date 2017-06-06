package cases;

import java.util.*;

public class BasicCases {
//	���ӳ����� 
	//nΪ����
	public int peachMonkey(int n){
		if (n==10) {
			return 1;
		}
		return (peachMonkey(n+1)+1)*2;
//	    for(int i=2; i<=n; i++) {     //ǰ����
//	      lastdayNum = (lastdayNum+1) * 2;  
//	    }   
//	    return lastdayNum; 
	}
//	Josephus Problem
	public int josephusProblem1(int total,int count){
		//��ʼ������
		List<Integer> start = new ArrayList<Integer>();
		for (int i = 1; i <=total; i++) {
			start.add(i);	
		}
		//�ӵ�k����ʼ����
		int k=0;
		while (start.size()>0) {
			k = k+count;
			//��m�˵�����λ��
			k = k % (start.size())-1;
			//�ж��Ƿ񵽶�β
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
	//�ַ���������String.valueOf(x)
	public String reverseString(String s){
		String ress="";
		for (int i = s.length()-1; i >=0; i--) {
			char a = s.charAt(i);
			ress += String.valueOf(a);//charת��Ϊstring����
		}
		return ress;
	}
}
//Լɪ������仯
class josephusProblem {
	static final int nums = 41;//�ܹ�������
	static final int killMan=3;//����3��ɱ
	public static void main(String[] args) {
		jufehus(2);
	}
	public static void jufehus(int alive){
		int[] man = new int[nums];//δ��ɱ�Ķ����Ϊ0
		int pos = -1;//����Ǳ�
		int i =0;
		int count = 1;//ɱ���ڼ�����¼ֵ

       while (count <= nums) {
             do {
                 pos = (pos + 1) % nums;// ѭ�����
                if (man[pos] == 0)
                     i++;
                if (i == killMan) {
                    i = 0; // ����
                    break;// �ҵ��˱�ɱ��λ�ã�����ѭ�������б��
                }
             } while (true);
            man[pos] = count;
            count++;
        }
		//��ʾ����ɱ��λ��
		alive = count -alive;
		for (int j = 0; j < man.length; j++) {
			if (man[j] >= alive)
				System.out.println("����ɱ��λ����->"+(j+1));
		}
	}
}