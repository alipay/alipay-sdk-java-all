package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品的Sku信息
 *
 * @author auto create
 * @since 1.0, 2019-04-24 11:12:50
 */
public class SkuInfo extends AlipayObject {

	private static final long serialVersionUID = 8722152224532771867L;

	/**
	 * 支付宝会员渠道销售的，以分为单位表示的价格，示例中是125.00元
	 */
	@ApiField("price_cent")
	private Long priceCent;

	/**
	 * 商品的划线价，以分为单位，12500表示125元
	 */
	@ApiField("reserve_price")
	private Long reservePrice;

	/**
	 * 商品的skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getPriceCent() {
		return this.priceCent;
	}
	public void setPriceCent(Long priceCent) {
		this.priceCent = priceCent;
	}

	public Long getReservePrice() {
		return this.reservePrice;
	}
	public void setReservePrice(Long reservePrice) {
		this.reservePrice = reservePrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
