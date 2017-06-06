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
	//查找节点
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
	//在指定位置添加节点,方法重载
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
	//删除指定节点
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
