package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗商业化订单上传接口入参的明细
 *
 * @author auto create
 * @since 1.0, 2026-04-14 17:19:02
 */
public class MedicalCommercialOrderUploadAmountDetail extends AlipayObject {

	private static final long serialVersionUID = 3497831161838961658L;

	/**
	 * 金额，精确到小数点后2位，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
