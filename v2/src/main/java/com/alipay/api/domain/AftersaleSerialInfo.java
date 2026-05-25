package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后凭证次序号信息
 *
 * @author auto create
 * @since 1.0, 2026-04-17 19:14:34
 */
public class AftersaleSerialInfo extends AlipayObject {

	private static final long serialVersionUID = 4296758391786195656L;

	/**
	 * 支付宝侧的凭证核销次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
