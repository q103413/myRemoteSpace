package algorithm;

public class Node {
	//关键字
	private int keyData;
	//其他数据
	private int otherData;
	//左子节点
	private Node leftNode;
	//右子节点
	private Node rightNode;
	//创造节点
	public Node(int key,int data){
		this.keyData = key;
		this.keyData = data;
	}
	//获取左子节点
	public Node getLeftNode(){
		return leftNode;
	}
	public void setLeftNode(Node leftNode){
		this.leftNode = leftNode;
	}
	public Node getRightNode(){
		return rightNode;
	}
	public void setRightNode(Node rightNode){
		this.rightNode = rightNode;
	}
	public int getOtherdata(){
		return otherData;
	}
	public void setOtherData(int otherData){
		this.otherData = otherData;
	}
	public void display(){
		System.out.println("关键字"+keyData+"其它数据"+otherData);;
	}
}
