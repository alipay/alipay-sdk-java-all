package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:22:28
 */
public class AlipayOpenSpOperationResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476493158449133367L;

	/** 
	 * 被代运营者为间连商户时有值，此时返回绑定的支付宝账号。
	 */
	@ApiField("bind_user_id")
	private String bindUserId;

	/** 
	 * 轮询结果。SUCCESS代表成功;PROCESS处理中
	 */
	@ApiField("handle_status")
	private String handleStatus;

	/** 
	 * 被代运营的商户号。
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	public void setBindUserId(String bindUserId) {
		this.bindUserId = bindUserId;
	}
	public String getBindUserId( ) {
		return this.bindUserId;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}
	public String getHandleStatus( ) {
		return this.handleStatus;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantNo( ) {
		return this.merchantNo;
	}

}
