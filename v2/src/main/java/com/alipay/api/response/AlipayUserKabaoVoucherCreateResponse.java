package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.kabao.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-25 11:36:55
 */
public class AlipayUserKabaoVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3125352861396472238L;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 支付宝卡包优惠券的实例唯一id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/** 
	 * 外部优惠券实例唯一id
	 */
	@ApiField("out_instance_id")
	private String outInstanceId;

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getInstanceId( ) {
		return this.instanceId;
	}

	public void setOutInstanceId(String outInstanceId) {
		this.outInstanceId = outInstanceId;
	}
	public String getOutInstanceId( ) {
		return this.outInstanceId;
	}

}
