package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.kabao.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 16:01:53
 */
public class AlipayUserKabaoVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5415395635791541216L;

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
