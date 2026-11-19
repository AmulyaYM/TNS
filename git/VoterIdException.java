package exceptionhandling.creatingexception.voterId;

public class VoterIdException extends Exception {

    String msg;

    public VoterIdException() {

    }

    public VoterIdException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
