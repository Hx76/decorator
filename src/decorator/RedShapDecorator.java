package decorator;

import shap.Shap;

public class RedShapDecorator extends ShapDecorator {

    @Override
    public void draw() {
        shap.draw();
        setBorder(shap);
    }

    public RedShapDecorator(Shap shap) {
        super(shap);
    }

    public void setBorder(Shap shap){
        System.out.println("border: red");
    }
}
