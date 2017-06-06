import static java.lang.System.*;
//import static java.lang.Math.random;

public class Demo {
	public static void main(String[] args) {
	    SataHdd sh1=new SeagateHdd(); //初始化希捷硬盘
	    SataHdd sh2=new SamsungHdd(); //初始化三星硬
//		out.println("產生一個隨機數："+ random() );
		
		// SuperClass superObj = new SuperClass();
		// SonClass sonObj = new SonClass();
		//
		// // superObj 不是 SonClass 类的实例
		// if(superObj instanceof SonClass){
		// SonClass sonObj1 = (SonClass)superObj;
		// }else{
		// System.out.println("①不能转换");
		// }
		// superObj = sonObj;
		// // superObj 是 SonClass 类的实例
		// if(superObj instanceof SonClass){
		// SonClass sonObj2 = (SonClass)superObj;
		// }else{
		// System.out.println("②不能转换");
		// }
	}
}
//串行硬盘接口
interface SataHdd{
  //连接线的数量
  public static final int CONNECT_LINE=4;
  //写数据
  public void writeData(String data);
  //读数据
  public String readData();
}

//维修硬盘接口
interface fixHdd{
 // 维修地址
 String address = "北京市海淀区";
 // 开始维修
 boolean doFix();
}
//希捷硬盘
class SeagateHdd implements SataHdd, fixHdd{
  //希捷硬盘读取数据
  public String readData(){
      return "数据";
  }
  //希捷硬盘写入数据
  public void writeData(String data) {
      out.println("写入成功");
  }
  // 维修希捷硬盘
  public boolean doFix(){
      return true;
  }
}
//三星硬盘
class SamsungHdd implements SataHdd{
  //三星硬盘读取数据
  public String readData(){
      return "数据";
  }
  //三星硬盘写入数据
  public void writeData(String data){
      out.println("写入成功");
  }
}
//某劣质硬盘，不能写数据
abstract class XXHdd implements SataHdd{
  //硬盘读取数据
  public String readData() {
      return "数据";
  }
}
// class SuperClass{ }
// class SonClass extends SuperClass{ }