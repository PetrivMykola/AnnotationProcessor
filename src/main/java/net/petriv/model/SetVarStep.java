package net.petriv.model;


import net.petriv.annotation.StepAttribute;
import net.petriv.annotation.UI;
import net.petriv.annotation.UIComponent;

@net.petriv.annotation.Step(type = "set-var",
        ui = @UI(name = "Set variable", id = "Id of the step", help = "Step Help", info = "Step info", author = "Petriv Mykola",
                category = "General", displayname = "Set var", company = "Mantra Pvt. Ltd.", thumbnail = "/png", icon = "/.ico"))
public class SetVarStep extends Step {


    @StepAttribute(ui = @UIComponent(fieldType = FieldType.TEXT, category = "Category", name = "name", type = "text", required = true,
            label = "Enter Name of the Variable", title = "Variable Name", id = "var_name"))
    private String name;


    @StepAttribute(ui = @UIComponent(fieldType = FieldType.TEXT, category = "Category", name = "value", type = "text", required = true, label = "Value",
            title = "Enter Value", id = "value"))
    private String value = "xxx";

    @StepAttribute(ui = @UIComponent(fieldType = FieldType.SELECT, category = "Category", name = "value_type", type = "text", required = true,
            label = "Select Template", title = "Variable Name", id = "value", options = " {\"Handlebar\": \"hb\",\"Free Marker Template\": \"ftl\"},"))
    private String value_type;

}
