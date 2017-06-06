package algorithm;

public class LinkList {
	public Link first;
	public void insert(long value){
		Link link = new Link(value);
		if (first == null) {
			first = link;
		} else {
			link.setNext(first);  
			first = link;
		}
	}
	public void displayAll(){
		Link current = first;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	//���ҽڵ�
	public Link find(long key){
		Link current = first;
		while (current.getData() != key) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		return current;
	}
	//��ָ��λ����ӽڵ�,��������
	public void insert(long value,int pos){
		if(pos == 0){
			insert(value);
		}
		Link current = first;
		for (int i = 0; i < pos-1; i++) {
			current = current.getNext();
		}
		Link link = new Link(value);
		link.setNext(current.getNext());
		current.setNext(link);
	}
	//ɾ��ָ���ڵ�
	public void delete(long key){
		Link current = first;
		Link ago = first;
		while(current.getData() != key){
			if (current.getNext() == null) {
				return;
			} else{
				ago = current;
				current = current.getNext();
			}
		}
		if (current == first) {
			first = first.getNext();
		} else{
			Link mid = current.getNext();
			ago.setNext(mid);
		}
	}
}
