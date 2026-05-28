package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类商品优惠信息字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class ExaminationDiscount extends AlipayObject {

	private static final long serialVersionUID = 6223722524728545468L;

	/**
	 * 优惠金额，单位：元。币种：人民币
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

}
