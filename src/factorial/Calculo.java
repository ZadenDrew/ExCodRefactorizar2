package factorial;

/**
 *
 * @author acabezaslopez
 */
public class Calculo {

    private int j, f, i;

    public Calculo() {
    }

    /** Método que calcula el factorial de j,f,i
     *
     * @return f int
     */
    public int calFact() {
        j = 8;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }

        return f;
    }

}
