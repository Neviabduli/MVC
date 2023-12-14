package Taschenrechner;


public class controller {

    protected controller(model model, view view) {

        // register ourselves to listen for button clicks

        view.btnPlus.setOnAction((event) -> {

            model.incrementValue();

            String newText = Integer.toString(model.getValue());

            view.lblNumber.setText(newText);

        });

    }

}