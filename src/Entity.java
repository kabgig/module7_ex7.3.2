public abstract class Entity {
    String name;
    private boolean destroyed = false;
    private int hp = 15;


    public Entity(String name) {
        this.name = name;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            setDestroyed(true);
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
