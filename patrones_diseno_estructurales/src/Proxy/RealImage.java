package Proxy;

public class RealImage implements Image {
    private String name;

    public RealImage(String name) {
        this.name = name;
    }

    @Override
    public void showImage() {
        System.out.println("Showing image: [" + name + "]");
    }
}