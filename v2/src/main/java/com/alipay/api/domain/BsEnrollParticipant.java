package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营计划-报名参与者
 *
 * @author auto create
 * @since 1.0, 2023-03-14 11:36:08
 */
public class BsEnrollParticipant extends AlipayObject {

	private static final long serialVersionUID = 5817766394224157292L;

	/**
	 * 调用方自定义的外部商户编号，可以为空
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 报名操作返回的失败原因，入参无须填写！
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 参与类型，支持PARTNER_ID 、LOGON_ID等
	 */
	@ApiField("type")
	private String type;

	/**
	 * 类型对应值,传参也不他
	 */
	@ApiField("value")
	private String value;

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
