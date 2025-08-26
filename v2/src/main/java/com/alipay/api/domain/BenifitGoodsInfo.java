package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用的权益商品信息
 *
 * @author auto create
 * @since 1.0, 2020-06-22 10:06:15
 */
public class BenifitGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 6364614758148523166L;

	/**
	 * 扩展信息，预留字段，非必录项
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * ISV对应的商品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * ISV对应的商品标题
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * ISV对应的商品类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

}
