package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品明细信息。
 *
 * @author auto create
 * @since 1.0, 2022-05-18 10:03:13
 */
public class GoodsDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4115185516393332426L;

	/**
	 * 商品编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单价。单位 元

精确到小数点后2位。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
