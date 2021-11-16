package inITSpace.overload;

public class FigurePainterOverloadMethodTest {
    public static void main(String[] args) {

        FigurePainterOverloadMethod myBox = new FigurePainterOverloadMethod();
        myBox.figureFive(5);
        myBox.figureFive(5, "&");
        myBox.figureFive(5, '$');
        myBox.figureFive(10);

    }
}