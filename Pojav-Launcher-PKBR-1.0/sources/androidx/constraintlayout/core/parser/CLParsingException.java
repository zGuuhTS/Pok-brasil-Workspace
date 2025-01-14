package androidx.constraintlayout.core.parser;

import androidx.core.p005os.EnvironmentCompat;

public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String reason, CLElement element) {
        this.mReason = reason;
        if (element != null) {
            this.mElementClass = element.getStrClass();
            this.mLineNumber = element.getLine();
            return;
        }
        this.mElementClass = EnvironmentCompat.MEDIA_UNKNOWN;
        this.mLineNumber = 0;
    }

    public String reason() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
