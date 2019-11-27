package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ceshi
 *
 * @author auto create
 * @since 1.0, 2018-10-24 14:30:48
 */
public class AntProdpaasProductGoodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3754327736294245973L;

	/**
	 * 商品列表信息
	 */
	@ApiField("goods_detail")
	private GoodsDetail goodsDetail;

	public GoodsDetail getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

}
