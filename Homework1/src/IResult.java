/**
 * Created by Saahil on 10/29/2015.
 */
public interface IResult
{
    /**
     *  funcion isValid returns true if the score is valid
     * @return
     */
    boolean isValid();

    /**
     * returns true if the first team in the result wins
     * @return
     */
    boolean winnerT1();
}
