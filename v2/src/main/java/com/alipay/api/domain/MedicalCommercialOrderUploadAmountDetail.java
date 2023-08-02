package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗商业化订单上传接口入参的明细
 *
 * @author auto create
 * @since 1.0, 2023-03-28 10:06:18
 */
public class MedicalCommercialOrderUploadAmountDetail extends AlipayObject {

	private static final long serialVersionUID = 3444415132158429775L;

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
