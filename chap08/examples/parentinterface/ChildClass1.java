package examples.parentinterface;

class ChildClass implements ChildInterface1 {
    ChildInterface1 ci1 = new ChildClass() {
        @Override
        public void method1(){}
        @Override
        public void method3(){}
    };
}