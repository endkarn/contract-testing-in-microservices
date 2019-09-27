public class DemoContract {
}

class Caller {
    void process() {
        Callee callee = new Callee();
        callee.doSomeThing();
    }

    void process2(){
        Callee callee = new Callee();
        callee.doSomeThing("karnawat");
    }
}

interface CalleeInterface {
    void doSomeThing();
    void doSomeThing(String name);
}

class Callee {
    void doSomeThing(){

    }

    void doSomeThing(String name){

    }
}

