package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.paymentinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-13 15:12:07
 */
public class AlipayCommerceTransportParkingPaymentinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6388732824186148834L;

	/** 
	 * 具体错误码
参数异常：INVALID_PARAMETER
没有权限操作：NO_PERMISSION_ERROR
请求受理结果未知：BIZ_UNKNOWN
请求受理失败：BIZ_FAIL
系统繁忙：SYSTEM_ERROR
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 具体错误原因
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

}
