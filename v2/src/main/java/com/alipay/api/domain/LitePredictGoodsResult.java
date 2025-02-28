package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lite交易预测top商品结果
 *
 * @author auto create
 * @since 1.0, 2024-03-28 10:00:18
 */
public class LitePredictGoodsResult extends AlipayObject {

	private static final long serialVersionUID = 7597431695178515929L;

	/**
	 * 可信度
	 */
	@ApiField("conf")
	private String conf;

	/**
	 * 商品算法id
	 */
	@ApiField("goods_id")
	private String goodsId;

	public String getConf() {
		return this.conf;
	}
	public void setConf(String conf) {
		this.conf = conf;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
