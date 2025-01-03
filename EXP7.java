class player{
    String name;
    int age;
    player(String n,int a){
        name = n;
        age = a;
    }
    void show(){
        System.out.println("\n");
        System.out.println("Player name :"+name);
        System.out.println("Age :"+age);
    }
}

class cricket_player extends player{
    String type;
    cricket_player(String n,String t,int a){
        super(n,a);
        type = t;
    }
    public void show(){
        super.show();
        System.out.println("Player type:"+type);
    }
}

class football_player extends player {
    String type;

    football_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("Player type:" + type);
    }
}

class hockey_player extends player{
    String type;
    hockey_player(String n,String t,int a){
        super(n,a);
        type = t;
    }
    public void show(){
        super.show();
        System.out.println("Player type:"+type);
    }
}

public class EXP7 {
    public static void main(String[] args){
        cricket_player c = new cricket_player("Ameer","cricket",25);
        football_player f = new football_player("Arun","football",25);
        hockey_player h = new hockey_player("Ram","hockey",25);
        c.show();
        f.show();
        h.show();
    }
}
