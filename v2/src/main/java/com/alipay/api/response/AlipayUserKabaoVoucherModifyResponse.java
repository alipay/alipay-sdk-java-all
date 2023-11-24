package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.kabao.voucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 16:01:53
 */
public class AlipayUserKabaoVoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4275874991456767732L;

	/** 
	 * 卡包优惠券实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/** 
	 * 外部优惠券实例唯一号
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
