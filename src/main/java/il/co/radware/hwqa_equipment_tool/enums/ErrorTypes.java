package il.co.radware.hwqa_equipment_tool.enums;

public enum ErrorTypes {
    GENERAL_ERROR("General error", true, 600),
    HACKING_ATTEMPT("Hacking Attempt", true, 601),
    REDUNDANT_DATA("Redundant data", false, 602),
    EMPTY_DATA("Provided data is empty", false, 603),
    EMPTY_TABLE("Table is empty", false, 604),
    CREATE_FAILED("Failed to create data", false, 610),
    GET_FAILED("Failed to get data", false, 611),
    UPDATE_FAILED("Failed to update data", false, 612),
    DELETE_FAILED("Failed to delete data", false, 611),
    LOGIN_FAILED("Login FAILED", false, 620);

    private String errorMessage;
    private boolean isCritical;
    private int internalErrorCode;

    ErrorTypes(String internalMessage, boolean isShowStackTrace, int internalErrorCode) {
        this.errorMessage = internalMessage;
        this.isCritical = isShowStackTrace;
        this.internalErrorCode = internalErrorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public int getInternalErrorCode() {
        return internalErrorCode;
    }

}
