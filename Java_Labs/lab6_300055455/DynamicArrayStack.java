public class DynamicArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell
    private static final int DEFAULT_INC = 25;   //Used to store default increment / decrement

    @SuppressWarnings( "unchecked" )

    // Constructor
    public DynamicArrayStack( int capacity ) {
        if(capacity < 25){
            this.elems = (E[]) new Object[DEFAULT_INC];

        }else{
            this.elems = (E[]) new Object[capacity];
        }
        
        top = 0;
    }

    // Gets current capacity of the array
    public int getCapacity() {
        return elems.length;
    }

    // Returns true if this DynamicArrayStack is empty
    public boolean isEmpty() {
        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    // Removes and returns the top element of this stack
    public E pop() {
        // Your code here.
        top = top-1;
        E saved;
        saved = elems[top];
        elems[top] = null;
        return saved;
    }

    private void ensureCapacity(){
        E[] tmpArray;


        tmpArray = (E[]) new Object[elems.length+DEFAULT_INC];
        for(int i = 0; i<elems.length;i++){
            tmpArray[i] = elems[i];
        }
        elems = tmpArray;

    }

    @SuppressWarnings( "unchecked" )

    // Puts the element onto the top of this stack.
    public void push( E element ) {
        // Your code here.

        if(elems[elems.length-DEFAULT_INC] == null){
            E[] tmpArray;
            tmpArray = (E[]) new Object[elems.length-DEFAULT_INC];
            for(int i = 0; i<tmpArray.length;i++){
                tmpArray[i] = elems[i];
            }
            elems = tmpArray;

        }

        if(elems.length == top){
            ensureCapacity();
        }
        elems[top] = element;
        top++;
    }

    @SuppressWarnings( "unchecked" )

    public void clear() {
        while(!this.isEmpty()){
            this.pop();
        }
    }

}