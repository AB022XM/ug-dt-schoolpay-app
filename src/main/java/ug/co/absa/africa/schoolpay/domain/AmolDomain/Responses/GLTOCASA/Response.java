package ug.co.absa.africa.schoolpay.domain.AmolDomain.Responses.GLTOCASA;

public class Response {

    private String code;
    private Data data;
    private String message;
    private Object sourceInfo;
    private String status;

    public Response() {}

    public Response(String code, Data data, String message, Object sourceInfo, String status) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.sourceInfo = sourceInfo;

        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(Object sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return (
            "Response{" +
            "code='" +
            code +
            '\'' +
            ", data=" +
            data.toString() +
            ", message='" +
            message +
            '\'' +
            ", sourceInfo=" +
            sourceInfo +
            ", status='" +
            status +
            '\'' +
            '}'
        );
    }
}
