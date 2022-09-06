package HW3;

abstract class Bird {
    public String feathers;
    public Boolean layEggs;

    public String toString(){
        return "Bird feathers - " +  "'" + this.feathers + "'" +  " Can bird lay eggs? - " + "'" + this.layEggs + "'";
    }

    abstract void fly();
}
