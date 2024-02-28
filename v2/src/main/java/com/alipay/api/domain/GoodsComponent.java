package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标品的货品组成模型
 *
 * @author auto create
 * @since 1.0, 2018-09-17 10:34:17
 */
public class GoodsComponent extends AlipayObject {

	private static final long serialVersionUID = 3676197989964645518L;

	/**
	 * 货品code
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 组成数量
	 */
	@ApiField("quantity")
	private String quantity;

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
