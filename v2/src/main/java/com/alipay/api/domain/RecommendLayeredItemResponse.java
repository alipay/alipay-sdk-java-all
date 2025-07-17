package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分成商品信息
 *
 * @author auto create
 * @since 1.0, 2025-03-13 11:11:09
 */
public class RecommendLayeredItemResponse extends AlipayObject {

	private static final long serialVersionUID = 6555284612124851781L;

	/**
	 * 商品分层标签，传递分层分层信息。
比如：full-price-delivery代表原价供货，3小时内到账，否则自动退款。
101-delivery 代表溢价1%供货，半小时到账。
	 */
	@ApiField("discount_phone_perform_level_tag")
	private String discountPhonePerformLevelTag;

	/**
	 * 单元：元。
话费面值。
用户要对自己的手机号进行充值的面额，比如50，100，200。
	 */
	@ApiField("face")
	private String face;

	/**
	 * 支付宝侧商品ID，下单时需要把该字段传入。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 单位：元
表示当前商品的价值，会带有小数点后两位。
商品价格，50.00表示当前面额的价格为50元，但商品价格和面额不一定等价，也就是50的面额价格不一定是50.00元。
	 */
	@ApiField("price")
	private String price;

	public String getDiscountPhonePerformLevelTag() {
		return this.discountPhonePerformLevelTag;
	}
	public void setDiscountPhonePerformLevelTag(String discountPhonePerformLevelTag) {
		this.discountPhonePerformLevelTag = discountPhonePerformLevelTag;
	}

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
