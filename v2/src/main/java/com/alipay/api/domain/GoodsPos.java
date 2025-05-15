package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品重力蓝位置
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:22:55
 */
public class GoodsPos extends AlipayObject {

	private static final long serialVersionUID = 3352512375177443955L;

	/**
	 * 商品Id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品重力位置信息，厘米
	 */
	@ApiField("pos")
	private Long pos;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Long getPos() {
		return this.pos;
	}
	public void setPos(Long pos) {
		this.pos = pos;
	}

}
