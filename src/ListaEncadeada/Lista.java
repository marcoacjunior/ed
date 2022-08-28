package ListaEncadeada;

public class Lista {
	
    private No no;


    public void insert(int data){
        no = insert(no, data);
    }


    private No insert(No no, int data){
        if(no == null){
            return new No(data);
        } else {
            if(no.data > data){
                No newNo = new No(data);
                newNo.next = no;
                return newNo;
            } else {
                no.next = insert(no.next, data);
            }
        }
        return no;
    }

    public boolean search(int data){
        return search(no, data);
    }


    private boolean search(No no, int data){
        if(no == null){
            return false;
        } else {
            if(no.data == data){
                return true;
            } else {
                return search(no.next, data);
            }
        }
    }


    public void remove(int data){
        no = remove(no, data);
    }

    private No remove(No no, int data){
        if(no == null){
            return null;
        } else {
            if(no.data == data){
                return no.next;
            } else {
                no.next = remove(no.next, data);
            }
        }
        return no;
    }


    public void show(){
        show(no);
    }


    private void show(No no){
        if(no != null){
            System.out.println(no.data);
            show(no.next);
        }
    }


	public void size() {
		// TODO Auto-generated method stub
		
	}

}
