package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class PromoItemExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8541526484563397627L;

	/**
	 * 商品补贴金额（单位 元）：淘宝、1688 针对单品的支付宝渠道补贴金额
	 */
	@ApiField("out_single_subsidy")
	private String outSingleSubsidy;

	public String getOutSingleSubsidy() {
		return this.outSingleSubsidy;
	}
	public void setOutSingleSubsidy(String outSingleSubsidy) {
		this.outSingleSubsidy = outSingleSubsidy;
	}

}
