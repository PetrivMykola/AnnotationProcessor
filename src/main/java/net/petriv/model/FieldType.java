package net.petriv.model;

public enum FieldType {

    DATE_PICKER("datePicker"), GRID("grid"), DYNAMIC_SELECT("dynamicselect"), TEXT("text"), SELECT("select"), HIDDEN("hidden"), TEXT_AREA(
            "textarea"), PASSWORD("password"), BUTTON("button"), LINK("link"), INPUT("input"), LABEL("label");

    private String returnValue;

    FieldType(String text)
    {
        this.returnValue = text;
    }

    public String getReturnValue()
    {
        return this.returnValue;
    }
}

