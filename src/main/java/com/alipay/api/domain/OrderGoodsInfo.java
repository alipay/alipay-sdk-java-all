package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品对象
 *
 * @author auto create
 * @since 1.0, 2022-11-01 13:33:23
 */
public class OrderGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 8459157319116824612L;

	/**
	 * 商品描述
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 光华服务编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品图标
	 */
	@ApiField("goods_pic")
	private String goodsPic;

	/**
	 * 单位描述
	 */
	@ApiField("goods_specs")
	private String goodsSpecs;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品单价
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

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

	public String getGoodsPic() {
		return this.goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public String getGoodsSpecs() {
		return this.goodsSpecs;
	}
	public void setGoodsSpecs(String goodsSpecs) {
		this.goodsSpecs = goodsSpecs;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
