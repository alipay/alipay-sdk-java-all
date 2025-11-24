package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.waybill.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:17:33
 */
public class AlipayCommerceTransportEtcenterpriseWaybillUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5737545147155712223L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 运单记录号
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

}
