package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境结算扩展字段
 *
 * @author auto create
 * @since 1.0, 2021-07-30 13:45:30
 */
public class OverseasExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8316553581454778869L;

	/**
	 * 商品明细列表
	 */
	@ApiField("goods_detail")
	private String goodsDetail;

	public String getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

}
