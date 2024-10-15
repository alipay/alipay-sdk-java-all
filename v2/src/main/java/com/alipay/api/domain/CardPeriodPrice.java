package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯价格
 *
 * @author auto create
 * @since 1.0, 2024-09-24 14:01:16
 */
public class CardPeriodPrice extends AlipayObject {

	private static final long serialVersionUID = 5549241315353366742L;

	/**
	 * 原价，单位分。
字段值需要大于或等于sale_price。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 期数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 售价，单位分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

}
