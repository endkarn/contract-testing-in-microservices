public class DemoNonContract {
}

class NCaller {
    void process() {
        NCallee callee = new NCallee();
        callee.doSomeThing("karnawat");
//        callee.doSomeThing("karnawat"); <----- break change
    }
}

class NCallee {
    void doSomeThing(String karnawat){

    }
}