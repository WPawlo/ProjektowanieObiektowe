class Storage<T> {
    private T item;

    public void store(T item){
        this.item = item;
    }
    public T retrive(){
        return item;
    }
}
