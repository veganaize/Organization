class Identity implements Identifiable {

    String name;
    String id;
    
    public void name(String string) { name = string; }
    public void id(String string) { id = string; }

    public String nameAsString() {
        return name;
    }
    
    public String idAsString() {
        return id;
    }
}