class base {
    public void print() {
        System.out.println("In base print");
    }
}

class drd  extends base {
     public void display(){
        System.out.println("In drd display");
    }
}

class Main {
    public static void main(String[] args){
        drd a = new drd();
        base b = new base();
       
        a.print();
        a.display();
    }
   
}




