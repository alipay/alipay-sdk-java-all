package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.production.change.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:21:06
 */
public class AntMerchantExpandProductionChangeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2892356434151623244L;

	/** 
	 * errorCode
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 项目单号（供应商维度）
	 */
	@ApiField("project_no")
	private String projectNo;

	/** 
	 * true
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectNo( ) {
		return this.projectNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
