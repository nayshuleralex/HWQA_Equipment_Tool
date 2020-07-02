package il.co.radware.hwqa_equipment_tool.exceptions;

import java.sql.SQLException;

import il.co.radware.hwqa_equipment_tool.enums.ErrorTypes;

public class ApplicationException extends SQLException {

	/**
	 * WHAT THE FUCK IS THIS???
	 */
	private static final long serialVersionUID = 1L;
	private ErrorTypes errorType;

	public ApplicationException(Exception e, ErrorTypes errorType, String message) {
		super(message, e);
		this.errorType = errorType;
	}

	public ApplicationException(ErrorTypes errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public ErrorTypes getErrorType() {
		return errorType;
	}

}
