class SubclassDemo extends AccessModifiersDemo {
    protected void displayProtectedVar() {
        System.out.println(super.getProtectedVar(protectedVar));

    }

}
