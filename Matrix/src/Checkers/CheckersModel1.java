import components.matrix.SimpleMatrix;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Model class.
 *
 * @author Put your name here
 */
public final class CheckersModel1 implements CheckersModel {

    /**
     * Model variables.
     */
    private final NaturalNumber top, bottom;

    /**
     * No argument constructor.
     */
    public CheckersModel1() {
        this.top = new NaturalNumber2();
        this.bottom = new NaturalNumber2();
    }

    @Override
    public NaturalNumber top() {

        // TODO: fill in body

        /*
         * This line added just to make the program compilable. Should be
         * replaced with appropriate return statement.
         */
        return null;
    }

    @Override
    public NaturalNumber bottom() {

        // TODO: fill in body

        /*
         * This line added just to make the program compilable. Should be
         * replaced with appropriate return statement.
         */
        return null;
    }

    @Override
    public SimpleMatrix<Piece> board() {
        // TODO Auto-generated method stub
        return null;
    }

}