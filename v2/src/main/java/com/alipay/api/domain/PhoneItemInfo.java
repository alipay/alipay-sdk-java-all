package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:24:45
 */
public class PhoneItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1322991389171495434L;

	/**
	 * 话费面额，这里单位是元。
	 */
	@ApiField("face")
	private String face;

	/**
	 * 商品最终价格，这里单位是元。
	 */
	@ApiField("final_price")
	private String finalPrice;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品价格，这里单位是元。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 话费商品来源，比如direct 代表直连
	 */
	@ApiField("source")
	private String source;

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getFinalPrice() {
		return this.finalPrice;
	}
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
