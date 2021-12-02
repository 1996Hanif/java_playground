package core.arrays;

public class ArrayExamples {
    private int[] numIntArr = new int[5];
    private int[] initArr = {1,2,3};

    public ArrayExamples() {
        this.numIntArr[0] = 1;
    }
    public void Arrayassign (int index, int value){
        this.numIntArr[index] = value;
    }


    public boolean changeArrayOrder(int value_want_to_move, int where_placed){
        int value_initial_index = 5;
        if (value_initial_index == 5){
            return false;
        }
        else if (where_placed> numIntArr.length || where_placed < 0 )
            return false;


        int replaced = this.initArr[where_placed];

        for (int i = 0; i < 3; i++){
            if (value_want_to_move == initArr[i])
                value_initial_index = i;
        }



        this.initArr[where_placed] = value_want_to_move;
        this.initArr[value_initial_index] = replaced;

        return true;
    }

}
