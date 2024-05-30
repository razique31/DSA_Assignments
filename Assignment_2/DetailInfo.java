interface DetailInfo {
    void display();
    int count();
}
class Person2 implements DetailInfo{
     String name;
    private static int maxCount = 0;
    Person2 (String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("Name: "+name);
    }
    @Override
    public int count(){
        maxCount = Math.max(maxCount, name.length());
        return name.length();
    }
    public static int getMaxCount() {
        return maxCount;
    }
    public static void main(String[] args){
        Person2 person1 = new Person2("Travis Scott");
        Person2 person2 = new Person2("Aaryan Shah");

        person1.display();
        System.out.println("Number of characters: "+person1.count());

        person2.display();
        System.out.println("Number of characters: "+person2.count());

        System.out.println("Maximum character count: "+Person2.getMaxCount());
    }
}
