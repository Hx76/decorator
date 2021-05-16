package decorator;

import shap.Shap;

public abstract class ShapDecorator implements Shap{
    protected Shap shap;

    public ShapDecorator(Shap shap) {
        this.shap = shap;
    }

    @Override
    public void draw() {
        shap.draw();
    }
}
