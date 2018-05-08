package com.alipay.api.internal.util.json;

public class JSONValidatingReader extends JSONReader {
    public static final Object INVALID = new Object();
    private JSONValidator validator;
    
    public JSONValidatingReader(JSONValidator validator) {
        this.validator = validator;
    }
    
    public JSONValidatingReader(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }
    
    public JSONValidatingReader() {
        this(new StdoutStreamErrorListener());
    }

    public Object read(String string) {
        if (!validator.validate(string)) return INVALID;
        return super.read(string);
    }
}
