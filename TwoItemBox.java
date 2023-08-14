/**
 * This class defines a TwoItemBox for the Project0 used in "Part 1: Make a box that can hold any network node".
 * Professor Maha Shamseddine.
 *
 * @param <A> a generic value for the first item in the box.
 * @param <B> a generic value for the second item in the box.
 */
public class TwoItemBox<A, B> {
    /**
     * This is the variable holding the value of A.
     */
    private A boxA;

    /**
     * This is the variable holding the value of B.
     */
    private B boxB;

    /**
     * This constructor initializes a TwoItemBox object with two generic values A and B.
     * It sets boxA and boxB as the values of a and b respectively.
     *
     * @param a the first generic value to be stored in the box.
     * @param b the second generic value to be stored in the box.
     */
    public TwoItemBox(A a, B b) {
        this.boxA = a;
        this.boxB = b;
    }

    /**
     * Sets the first item in the box.
     *
     * @return boxA the item to set
     */
    public A getItem1() {
        return boxA;
    }

    /**
     * Sets the second item in the box.
     *
     * @return boxB the item to set
     */
    public B getItem2() {
        return boxB;
    }
}
