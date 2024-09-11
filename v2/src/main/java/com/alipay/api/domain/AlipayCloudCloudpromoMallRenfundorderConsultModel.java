package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单渲染
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:08
 */
public class AlipayCloudCloudpromoMallRenfundorderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1481691391733937369L;

	/**
	 * 退款类型
	 */
	@ApiField("biz_claim_type")
	private String bizClaimType;

	/**
	 * 4: 未发货, 1: 未收到货, 2: 已收到货
	 */
	@ApiField("goods_status")
	private String goodsStatus;

	/**
	 * 子分销订单ID
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	public String getBizClaimType() {
		return this.bizClaimType;
	}
	public void setBizClaimType(String bizClaimType) {
		this.bizClaimType = bizClaimType;
	}

	public String getGoodsStatus() {
		return this.goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public String getOrderLineId() {
		return this.orderLineId;
	}
	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}

}
