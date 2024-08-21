package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.kabao.voucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:57:02
 */
public class AlipayUserKabaoVoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8273199138561671688L;

	/** 
	 * 补充业务错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

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
