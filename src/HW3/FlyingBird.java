package HW3;

public class FlyingBird extends Bird{

    FlyingBird(){}

    FlyingBird(String feathers, Boolean layEggs){
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(Boolean layEggs) {
        this.layEggs = layEggs;
    }


    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
