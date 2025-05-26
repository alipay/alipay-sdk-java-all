package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大模型围栏代答内容
 *
 * @author auto create
 * @since 1.0, 2023-08-29 09:42:58
 */
public class GuardrailsBiz extends AlipayObject {

	private static final long serialVersionUID = 8389897463687691841L;

	/**
	 * 护栏业务编码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 护栏业务文案
	 */
	@ApiField("business_msg")
	private String businessMsg;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getBusinessMsg() {
		return this.businessMsg;
	}
	public void setBusinessMsg(String businessMsg) {
		this.businessMsg = businessMsg;
	}

}
