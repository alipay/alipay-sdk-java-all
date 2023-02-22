package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营计划-报名参与者
 *
 * @author auto create
 * @since 1.0, 2022-12-30 11:34:31
 */
public class BsEnrollParticipant extends AlipayObject {

	private static final long serialVersionUID = 3674655796156541588L;

	/**
	 * 调用方自定义的外部商户编号，可以为空
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 参与类型，支持PARTERN_ID 、LOGON_ID等
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
