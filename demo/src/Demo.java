import static java.lang.System.*;
//import static java.lang.Math.random;

public class Demo {
	public static void main(String[] args) {
	    SataHdd sh1=new SeagateHdd(); //��ʼ��ϣ��Ӳ��
	    SataHdd sh2=new SamsungHdd(); //��ʼ������Ӳ
//		out.println("�a��һ���S�C����"+ random() );
		
		// SuperClass superObj = new SuperClass();
		// SonClass sonObj = new SonClass();
		//
		// // superObj ���� SonClass ���ʵ��
		// if(superObj instanceof SonClass){
		// SonClass sonObj1 = (SonClass)superObj;
		// }else{
		// System.out.println("�ٲ���ת��");
		// }
		// superObj = sonObj;
		// // superObj �� SonClass ���ʵ��
		// if(superObj instanceof SonClass){
		// SonClass sonObj2 = (SonClass)superObj;
		// }else{
		// System.out.println("�ڲ���ת��");
		// }
	}
}
//����Ӳ�̽ӿ�
interface SataHdd{
  //�����ߵ�����
  public static final int CONNECT_LINE=4;
  //д����
  public void writeData(String data);
  //������
  public String readData();
}

//ά��Ӳ�̽ӿ�
interface fixHdd{
 // ά�޵�ַ
 String address = "�����к�����";
 // ��ʼά��
 boolean doFix();
}
//ϣ��Ӳ��
class SeagateHdd implements SataHdd, fixHdd{
  //ϣ��Ӳ�̶�ȡ����
  public String readData(){
      return "����";
  }
  //ϣ��Ӳ��д������
  public void writeData(String data) {
      out.println("д��ɹ�");
  }
  // ά��ϣ��Ӳ��
  public boolean doFix(){
      return true;
  }
}
//����Ӳ��
class SamsungHdd implements SataHdd{
  //����Ӳ�̶�ȡ����
  public String readData(){
      return "����";
  }
  //����Ӳ��д������
  public void writeData(String data){
      out.println("д��ɹ�");
  }
}
//ĳ����Ӳ�̣�����д����
abstract class XXHdd implements SataHdd{
  //Ӳ�̶�ȡ����
  public String readData() {
      return "����";
  }
}
// class SuperClass{ }
// class SonClass extends SuperClass{ }