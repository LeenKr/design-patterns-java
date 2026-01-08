public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {

        UIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsUIFactory();
        } else {
            factory = new MacUIFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
