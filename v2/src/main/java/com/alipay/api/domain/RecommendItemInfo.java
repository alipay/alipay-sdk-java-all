package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户端询价返回的商品信息
 *
 * @author auto create
 * @since 1.0, 2024-06-13 09:55:55
 */
public class RecommendItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6882534529254727831L;

	/**
	 * 用户要对自己的手机号进行充值的面额
	 */
	@ApiField("face")
	private String face;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 当前面额的价格为50元
	 */
	@ApiField("price")
	private String price;

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
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

}
