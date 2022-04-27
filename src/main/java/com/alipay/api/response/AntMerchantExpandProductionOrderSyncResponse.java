package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.production.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-24 23:37:50
 */
public class AntMerchantExpandProductionOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825897767767631533L;

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
	 * 请求成功标志
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
