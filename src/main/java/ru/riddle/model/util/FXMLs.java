package ru.riddle.model.util;

public enum FXMLs {
    MENU_SCREEN("/view/MenuScreenFXML.fxml"),
    SETTINGS_SCREEN("/view/SettingsScreenFXML.fxml"),
    AUTHORS_SCREEN("/view/AuthorsScreenFXML.fxml"),

    MENU_FORMULAS_SCREEN("/view/MenuFormulasScreenFXML.fxml"),

    THEORY_FIRST("/view/theory/TheoryFirstFXML.fxml", "First"),
    THEORY_SECOND("/view/theory/TheorySecondFXML.fxml", "Second"),
    THEORY_THIRD("/view/theory/TheoryThirdFXML.fxml", "Third"),
    THEORY_EXAMPLES_MENU("/view/theory/TheoryExamplesMenu.fxml", "ExamplesMenu"),

    THEORY_FIRST_EXAMPLE_1("/view/theory/examples/firstExample/TheoryFirstExample1.fxml", "FirstExample1"),
    THEORY_FIRST_EXAMPLE_2("/view/theory/examples/firstExample/TheoryFirstExample2.fxml", "FirstExample2"),
    THEORY_FIRST_EXAMPLE_3("/view/theory/examples/firstExample/TheoryFirstExample3.fxml", "FirstExample3"),
    THEORY_FIRST_EXAMPLE_4("/view/theory/examples/firstExample/TheoryFirstExample4.fxml", "FirstExample4"),

    THEORY_SECOND_EXAMPLE_1("/resources/view/theory/examples/secondTask/TheorySecondExample1.fxml", "SecondExample1"),
    THEORY_SECOND_EXAMPLE_2("/resources/view/theory/examples/secondTask/TheorySecondExample2.fxml", "SecondExample2"),
    THEORY_SECOND_EXAMPLE_3("/resources/view/theory/examples/secondTask/TheorySecondExample3.fxml", "SecondExample3"),
    THEORY_SECOND_EXAMPLE_4("/resources/view/theory/examples/secondTask/TheorySecondExample4.fxml", "SecondExample4"),
    ;

    private final String path;
    private String id;

    FXMLs(String path) {
        this.path = path;
    }

    FXMLs(String path, String id) {
        this.path = path;
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public String getId() {
        return id;
    }
}
