package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款商品明细信息
 *
 * @author auto create
 * @since 1.0, 2021-09-27 16:09:33
 */
public class RefundGoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 4395355813319875196L;

	/**
	 * 商品编号。
对应支付时传入的goods_id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 该商品的退款总金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
