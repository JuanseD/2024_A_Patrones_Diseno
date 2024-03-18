package Proxy;

public class Document {
    private String docName;
    private String text;
    private ImageProxy imageProxy;

    public Document(String docName) {
        this.setDocName(docName);
        this.loadContent();
        this.show();
    }

    public String getDocName() {
        return this.docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void loadContent() {
        this.text = "Document text";
        this.imageProxy = new ImageProxy("image.jpg");
        System.out.println("Document loaded into memory");
    }

    public void show() {
        System.out.println("Displaying the content...\n");
    }

    public void scroll() {
        System.out.println("The user has scrolled...");
        imageProxy.showImage();
    }
}
