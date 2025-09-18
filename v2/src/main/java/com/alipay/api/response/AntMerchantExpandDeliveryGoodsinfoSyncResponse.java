package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.delivery.goodsinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-29 20:52:00
 */
public class AntMerchantExpandDeliveryGoodsinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6399298223388329377L;

	/** 
	 * 配送指令id，参考已有获取配送指令接口。
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
	 * 调用结果
	 */
	@ApiField("success")
	private String success;

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

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
