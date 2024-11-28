public class Stack {
    ArrayList<Integer> list = new ArrayList<>();
    Stack(){
    
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
    int getSize(){
        return list.size();
    }
    Object peek(){
        return list.get(getSize() - 1);
    }
    Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    void push(Object o){
        list.add(o);
    }

    public int search(Object o){
        return list.indexOf(o);
    }

}
