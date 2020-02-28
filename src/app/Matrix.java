package app;

import java.util.Arrays;

/**
 * 
 * @custom.class_name Matrix
 * 
 * @custom.author Daniel C. Landon Jr.
 * @custom.instructor Dr. Bob Walsh
 * @custom.course CSCI 202 - Introduction to Software Systems
 * @custom.date_started 02.05.2020
 * @custom.date_due 02.06.2020
 * 
 * @custom.class_notes This class generates a matrix using a constructor with
 *                     arguments. It has various methods that can be called to
 *                     manipulate the matrix
 * 
 * @custom.pre_condition none
 * 
 * @custom.post_condition none
 * 
 * @custom.javadoc_tags In order to use @custom.tag_name in javadocs you must
 *                      include the following in the command line to generate
 *                      the docs. This part must be after you have indicated
 *                      what files to process;
 * 
 *                      ' -tag custom.tag_name:a:"tag_name" '
 * 
 *                      The first part identifies the tag in the code, the
 *                      second part in quotes indentifies what will be printed
 *                      in the javadocs when they are generated. If you do not
 *                      include this in the command to generate the docs you
 *                      will get an error/warning.
 * 
 */

public class Matrix {

    // class variables
    private int _row = 0; // rows
    private int _col = 0; // columns
    private int[][] _data; // Keanu

    /**
     * 
     * @custom.method_name Matrix constructor
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes Constructor that creates the initial matrix
     * 
     * @custom.pre_condition create instance of object and supply starting values to create a matrix. 
     * 
     * @custom.post_condition matrix is created
     * 
     * @param _row the number of rows to create
     * @param _col the number of columns to create
     */
    public Matrix(int _row, int _col) {
        // set internal variables
        this._row = _row;
        this._col = _col;

        //initialize the matrix
        this._data = new int[this._row][this._col]; // keanu lives

        // loop _loopRow
        for(int _loopRow = 0; _loopRow < this._row; _loopRow++){
            
            // loop _loopCol
            for(int _loopCol = 0; _loopCol < this._col; _loopCol++){

                // populate the matrix
                this._data[_loopRow][_loopCol] = (int)(Math.random() * 4 + 1);

            } // end for _loopCol

        } // end for _loopRow

    } // end Matrix constructor

    /**
     * 
     * @custom.method_name toString
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes Returns a string that contains the matrice.
     * 
     * @custom.pre_condition matrix must be created
     * 
     * @custom.post_condition string containing the matrix is returned
     * 
     * @return the matrix in string format
     */
    public String toString(){

        // varaibles
        String _ans = "";

        // loop row
        for(int _loopRow = 0; _loopRow < this._row; _loopRow++){
            
            // loop col
            for(int _loopCol = 0; _loopCol < this._col; _loopCol++){

                // create return for matrix
                _ans+= _data[_loopRow][_loopCol] + "\t";

            } // end for _loopCol

            // create final output
            _ans+= "\n";

        } // end for _loopRow

        return _ans;

    } // end toString

    /**
     * 
     * @custom.method_name matrixAdd
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes Takes two matricies and adds them together
     * 
     * @custom.pre_condition two matrix must be supplied
     * 
     * @custom.post_condition return a matrix containing the results of adding two supplied matrix together.
     * 
     * @param _matrix matrix to add to _data matrix
     * @return matrix with added values otherwise echos back supplied matrix from args
     */
    public Matrix matrixAdd(Matrix _matrix) {

        // loop the row
        for(int _rowLoop = 0; _rowLoop < this._row; _rowLoop++) {

            // loop column
            for(int _colLoop = 0; _colLoop < this._col; _colLoop++) {

                // do the math
                this._data[_rowLoop][_colLoop] = this._data[_rowLoop][_colLoop] + _matrix._data[_rowLoop][_colLoop];

            } // end _colLoop

        } // end _rowLoop

        // if we get here there is a problem so echo _matrixArgs
        return _matrix;
    } // end matrixAdd

    /**
     * 
     * @custom.method_name matrixScalarMultiply
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes multiples this._data by supplied number
     * 
     * @custom.pre_condition this._data must exist
     * 
     * @custom.post_condition new matrix containg the multipled values
     * 
     * @param _numberToMultiply number to multiply against this._data
     */
    public void matrixScalarMultiply(int _numberToMultiply) { 

        for(int _rowLoop = 0; _rowLoop < this._row; _rowLoop++){

            for(int _colLoop = 0; _colLoop < this._col; _colLoop++) {

                // multiply contents of matrix element by multiplier
                this._data[_rowLoop][_colLoop] = this._data[_rowLoop][_colLoop] * _numberToMultiply;

            } // end _columnLoop

        } // end _rowLoop
    
    } // end matrixScalarMultiply

    /**
     * 
     * @custom.method_name matrixEquals
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes takes a supplied matrix and compares it to this._data
     * 
     * @custom.pre_condition this._data must exist
     * 
     * @custom.post_condition successfull comparison
     * 
     * @param _matrix matrix to compare to this._data
     * @return true if the match false otherwise
     */
    public boolean matrixEquals(Matrix _matrix) {

        boolean _testCondition =  Arrays.equals(this._data, _matrix._data) ?  true : false;
        
        return _testCondition; // we get here there was a problem

    } // end matrixEquals

    /**
     * 
     * @custom.method_name matrixCopy
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes none
     * 
     * @custom.pre_condition matrix must be supplied to copy to additionally the default data matrix must also exist
     * 
     * @custom.post_condition return a copy of existing matrix
     * 
     * @param _matrix the matrix that we will copy too
     */
    public void matrixCopy(Matrix _matrix) {
        
        // this works, i can conceptualize it but I cannot explain it.
        // i need to work on this one
        this._data = Arrays.stream(_matrix._data)
            .map((int[] row) -> row.clone())
            .toArray((int length) -> new int[length][]);

    } // end matrixCopy

    /**
     * 
     * @custom.method_name matrixMultiply
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes takes two matrices and multiplies them together
     * 
     * @custom.pre_condition two matrix must be supplied
     * 
     * @custom.post_condition return a matrix containing the results of multiplying two supplied matrix together.
     * 
     * @param _m2 matrix to multiply against this._data
     * @return matrix containing multipled matrix, if problem will echo back supplied matrix from args
     */
    public Matrix matrixMultiply(Matrix _m2) {

        try {
            
            // check to see if this._col = _m2._row
            if(this._col != _m2._row){
            
                System.out.println("Matrix Size Incorrect!");
    
                throw new RuntimeException();
            
            } // end if

            // create new matrix to contain new values
            Matrix _m3 = new Matrix(this._row, _m2._col);
    
            // loop row
            for(int _loopRow = 0; _loopRow < this._data.length; _loopRow++){
    
                // loop col
                for(int _loopCol = 0; _loopCol < this._data.length; _loopCol++) {

                    // new matrix contains daat so set to zero
                    _m3._data[_loopRow][_loopCol] = 0;

                    // loop k
                    for(int _x = 0; _x < _m2._data.length; _x++) {
    
                        // do the math and update matrix
                        _m3._data[_loopRow][_loopCol] += this._data[_loopRow][_x] * _m2._data[_x][_loopCol];
    
                    } // end for _x
    
                } // end for _loopCol
    
            } // end for _loopRow
    
            return _m3;

        } // end try 

        catch (Exception e) {
            System.out.println("WOOT BAM! ... Sumo Ninja Strikes");
        } // end catch

        // if we get here the arrays were not multiplied so echo arg array
        return _m2;

    } // end mulltiplyMatrix
    
} // end Matrix