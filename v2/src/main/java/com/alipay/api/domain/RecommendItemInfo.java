package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户端询价返回的商品信息
 *
 * @author auto create
 * @since 1.0, 2025-03-13 11:11:09
 */
public class RecommendItemInfo extends AlipayObject {

	private static final long serialVersionUID = 8197615466294383361L;

	/**
	 * 单元：元。
话费面值，比如50/100/200
用户要对自己的手机号进行充值的金额。
	 */
	@ApiField("face")
	private String face;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品价格，50.00表示当前面额的价格为50元，但商品价格和面额不一定等价，也就是50的面额价格不一定是50.00元。
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
