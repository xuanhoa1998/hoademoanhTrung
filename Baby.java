class Baby extends Tra {
    void eat() {
        System.out.println("trà sữa");
    }

    public static void main(String args[]) {
        anhtrung a1, a2, a3;
        a1 = new anhtrung();
        a2 = new Tra();
        a3 = new Baby();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}