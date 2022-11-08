package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小部件商品审核通过结果
 *
 * @author auto create
 * @since 1.0, 2022-11-03 19:50:01
 */
public class WidgetGoodsAuditPassResult extends AlipayObject {

	private static final long serialVersionUID = 1443891925547962587L;

	/**
	 * 支付宝商品内部唯一标识
	 */
	@ApiField("alipay_goods_id")
	private String alipayGoodsId;

	/**
	 * 商品外部唯一标识
	 */
	@ApiField("goods_id")
	private String goodsId;

	public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}
	public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
