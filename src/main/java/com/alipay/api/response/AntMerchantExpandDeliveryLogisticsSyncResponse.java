package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.delivery.logistics.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-14 20:31:59
 */
public class AntMerchantExpandDeliveryLogisticsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5136791528554672618L;

	/** 
	 * 配送指令
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 业务处理结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}
	public String getAssignItemId( ) {
		return this.assignItemId;
	}

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
