package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品重力蓝位置
 *
 * @author auto create
 * @since 1.0, 2022-01-17 16:37:18
 */
public class GoodsPos extends AlipayObject {

	private static final long serialVersionUID = 3847146951438791499L;

	/**
	 * 商品Id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品重力位置信息
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
