package sample;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.*;
import javafx.scene.shape.Line;

public class MapView extends Region {

  private double lastX;
  private double lastY;

  private Line line;

  public MapView () {
    // Create black background
    setBackground(
      new Background(
        new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

    setTranslateX(0.5);

    // Create line
    line = new Line(960/2, 0, 960/2, 540);
    line.setStroke(Color.GREY);
    getChildren().add(line);

    //canvas.widthProperty().addListener(evt -> draw());
    //canvas.heightProperty().addListener(evt -> draw());
//    setOnMouseClicked(e -> System.out.println("Hello world!"));
    setOnMouseClicked(this::handleMouseClicked);
    setOnMousePressed(this::handleMousePressed);
    setOnMouseDragged(this::handleMouseDragged);
  }

  private void handleMouseClicked (MouseEvent event) {
    System.out.println("Button clicked!");
  }

  private void handleMousePressed (MouseEvent event) {
    System.out.println("Button pressed!");
    lastX = event.getX();
    lastY = event.getY();
  }

  private void handleMouseDragged (MouseEvent event) {
    System.out.println("Mouse dragged!");
    var x = event.getX();
    var y = event.getY();
    var deltaX = x - lastX;
    var deltaY = y - lastY;
    lastX = x;
    lastY = y;
    System.out.println(deltaX);
  }

  void draw() {
    // double width = canvas.getWidth();
    // double height = canvas.getHeight();

    // var gc = canvas.getGraphicsContext2D();
    // gc.clearRect(0, 0, width, height);

    // gc.setStroke(Color.RED);
    // gc.strokeLine(0, 0, width, height);
    // gc.strokeLine(0, height, width, 0);
  }

  @Override
  protected void layoutChildren () {
    // super.layoutChildren();
    // // Position and size canvas, accounting for border and padding
    // final var x = snappedLeftInset();
    // final var y = snappedTopInset();
    // final var w = snapSizeX(getWidth()) - x - snappedRightInset();
    // final var h = snapSizeY(getHeight()) - y - snappedBottomInset();
    // canvas.setLayoutX(x);
    // canvas.setLayoutY(y);
    // canvas.setWidth(w);
    // canvas.setHeight(h);
  }
}
