package sem2.hw;

public class Cat {
    private Integer maxRun = 300;
    private Integer maxJump = 5;
    private String name = null;

    public Cat(){}

    public Cat(Integer maxRun, Integer maxJump, String name) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    public Integer getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(Integer maxRun) {
        this.maxRun = maxRun;
    }

    public Integer getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(Integer maxJump) {
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean run(Racetrack obstacle){
        if (obstacle.getLength() > maxRun){
            System.out.println("Кот по имени " + this.name + " не смог пробежать дистанцию " + obstacle.getLength());
            return false;
        } else {
            System.out.println("Кот по имени " + this.name + " успешно пробежал дистанцию " + obstacle.getLength());
            return true;
        }
    }

    public boolean jump(Wall obstacle){
        if (obstacle.getHeight() > maxJump){
            System.out.println("Кот по имени " + this.name + " не смог перепрыгнуть стену высоты " + obstacle.getHeight());
            return false;
        } else {
            System.out.println("Кот по имени " + this.name + " успешно перепрыгнул стену высоты " + obstacle.getHeight());
            return true;
        }
    }
}
