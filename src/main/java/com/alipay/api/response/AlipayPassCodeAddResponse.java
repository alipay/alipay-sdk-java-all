package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.code.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPassCodeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6522644864156128854L;

	/** 
	 * 成功时返回业务参数
	 */
	@ApiListField("biz_result")
	@ApiField("string")
	private List<String> bizResult;

	/** 
	 * 返回码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否发码成功的标识。
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizResult(List<String> bizResult) {
		this.bizResult = bizResult;
	}
	public List<String> getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
