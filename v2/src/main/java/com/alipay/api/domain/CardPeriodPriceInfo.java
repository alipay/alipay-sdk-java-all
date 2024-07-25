package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡阶梯价格信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardPeriodPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 1483561651823541184L;

	/**
	 * 单次原价
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 期数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 单次售卖价格
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
