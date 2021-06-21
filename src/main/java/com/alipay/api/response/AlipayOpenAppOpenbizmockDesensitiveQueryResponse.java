package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openbizmock.desensitive.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-22 16:52:32
 */
public class AlipayOpenAppOpenbizmockDesensitiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6718181491777246631L;

	/** 
	 * 1
	 */
	@ApiField("test_field_converter")
	private String testFieldConverter;

	/** 
	 * 1
	 */
	@ApiListField("test_fields_converter")
	@ApiField("string")
	private List<String> testFieldsConverter;

	public void setTestFieldConverter(String testFieldConverter) {
		this.testFieldConverter = testFieldConverter;
	}
	public String getTestFieldConverter( ) {
		return this.testFieldConverter;
	}

	public void setTestFieldsConverter(List<String> testFieldsConverter) {
		this.testFieldsConverter = testFieldsConverter;
	}
	public List<String> getTestFieldsConverter( ) {
		return this.testFieldsConverter;
	}

}
