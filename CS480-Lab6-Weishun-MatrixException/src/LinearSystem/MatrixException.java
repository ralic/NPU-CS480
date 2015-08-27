/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSystem;

/**
 *
 * @author raliclo
 */
public class MatrixException extends Throwable {

    private int errorCode;
    private String msg;

    public MatrixException() {
        this.errorCode = 0;
        this.msg = "No Error found";
    }

    public MatrixException(int a, String b) {
        this.errorCode = a;
        this.msg = b;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int a) {
        this.errorCode = a;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String b) {
        this.msg = b;
    }

    @Override
    public String toString() {
        return super.toString() + errorCode + msg;
        // return "\nerrorCode="+this.errorCode+"\nError msg="+this.msg
    }
}
