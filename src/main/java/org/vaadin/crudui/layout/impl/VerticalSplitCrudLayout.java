package org.vaadin.crudui.layout.impl;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout.Orientation;

/**
 * @author Alejandro Duarte.
 */
public class VerticalSplitCrudLayout extends AbstractTwoComponentsCrudLayout {

    public VerticalSplitCrudLayout() {
        secondComponentHeaderLayout.setMargin(true);
    }

    @Override
    protected SplitLayout getMainLayout() {
        SplitLayout mainLayout = new SplitLayout(firstComponent, secondComponent);
        mainLayout.setOrientation(Orientation.VERTICAL);
        mainLayout.setSizeFull();
        return mainLayout;
    }

    @Override
    protected void addToolbarLayout(Div toolbarLayout) {
        firstComponentHeaderLayout.add(toolbarLayout);
    }

    @Override
    public void addToolbarComponent(Component component) {
        if (!firstComponentHeaderLayout.isVisible()) {
            firstComponentHeaderLayout.setVisible(true);
            firstComponent.getElement().insertChild(firstComponent.getComponentCount() - 1, firstComponentHeaderLayout.getElement());
        }

        toolbarLayout.setVisible(true);
        toolbarLayout.add(component);
    }

}
