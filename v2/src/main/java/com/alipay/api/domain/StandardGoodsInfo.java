package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager统一的商品模型
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:54
 */
public class StandardGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 6173447294747666122L;

	/**
	 * 商品分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品数量，无具体度量单位
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 单位金额
	 */
	@ApiField("unit_amount")
	private MultiCurrencyMoneyDTO unitAmount;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public MultiCurrencyMoneyDTO getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(MultiCurrencyMoneyDTO unitAmount) {
		this.unitAmount = unitAmount;
	}

}
