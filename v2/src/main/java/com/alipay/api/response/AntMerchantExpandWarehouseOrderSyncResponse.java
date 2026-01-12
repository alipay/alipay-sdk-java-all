package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.warehouse.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:34:19
 */
public class AntMerchantExpandWarehouseOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3274319183431687171L;

	/** 
	 * 配送指令id
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
	 * 是否成功
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
