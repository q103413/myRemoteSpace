package algorithm;

public class Node {
	//�ؼ���
	private int keyData;
	//��������
	private int otherData;
	//���ӽڵ�
	private Node leftNode;
	//���ӽڵ�
	private Node rightNode;
	//����ڵ�
	public Node(int key,int data){
		this.keyData = key;
		this.keyData = data;
	}
	//��ȡ���ӽڵ�
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
		System.out.println("�ؼ���"+keyData+"��������"+otherData);;
	}
}
