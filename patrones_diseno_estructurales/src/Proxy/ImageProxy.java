package Proxy;

public class ImageProxy implements Image {
    private RealImage image = null;
    private String imageName = "";

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void showImage() {
        if (this.image == null) {
            this.image = new RealImage(imageName);
        }
        this.image.showImage();
    }
}

