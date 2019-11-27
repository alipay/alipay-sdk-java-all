package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.witness.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEduKtWitnessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874342844284735161L;

	/** 
	 * 参数编码字符集。业务平台使用的编码 格式，如 utf-8、gbk、gb2312 等
	 */
	@ApiField("charset")
	private String charset;

	/** 
	 * 返回错误码参见附录
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 返回错误原因参见附录
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 成功标识。表示接口调用是否成功，并 不表明业务处理结果。
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 1000
	 */
	@ApiField("memo")
	private String memo;

	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getCharset( ) {
		return this.charset;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

}
