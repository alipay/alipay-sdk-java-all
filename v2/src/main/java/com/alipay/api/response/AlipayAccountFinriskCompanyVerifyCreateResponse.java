package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.company.verify.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:33
 */
public class AlipayAccountFinriskCompanyVerifyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1587381142774549238L;

	/** 
	 * 二代结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 三代结果码
	 */
	@ApiField("result_code_third")
	private String resultCodeThird;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否业务处理成功。 true：处理成功；false：处理失败。 默认：false
	 */
	@ApiField("success")
	private String success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultCodeThird(String resultCodeThird) {
		this.resultCodeThird = resultCodeThird;
	}
	public String getResultCodeThird( ) {
		return this.resultCodeThird;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
