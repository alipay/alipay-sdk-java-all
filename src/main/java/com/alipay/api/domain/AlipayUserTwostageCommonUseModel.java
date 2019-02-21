package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用当面付二阶段接口
 *
 * @author auto create
 * @since 1.0, 2019-01-16 14:35:50
 */
public class AlipayUserTwostageCommonUseModel extends AlipayObject {

	private static final long serialVersionUID = 2559836659793831411L;

	/**
	 * 商户扫描用户的付款码值。
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 商家进行二阶段支付的PID信息。
	 */
	@ApiField("pay_pid")
	private String payPid;

	/**
	 * 业务场景唯一编号，用于标识这笔请求，每次调用请勿使用相同的sence_no，每笔请求的sence_no必须不一样，支付时传递的DYNAMIC_TOKEN_OUT_BIZ_NO必须与调用开放平台传递的sence_no保持一致。
	 */
	@ApiField("sence_no")
	private String senceNo;

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getPayPid() {
		return this.payPid;
	}
	public void setPayPid(String payPid) {
		this.payPid = payPid;
	}

	public String getSenceNo() {
		return this.senceNo;
	}
	public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

}
