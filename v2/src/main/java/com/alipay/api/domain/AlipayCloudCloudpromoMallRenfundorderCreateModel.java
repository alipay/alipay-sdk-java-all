package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单创建
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:34:07
 */
public class AlipayCloudCloudpromoMallRenfundorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4611558599115989243L;

	/**
	 * 退款类型，不传值则默认选择仅退款
	 */
	@ApiField("biz_claim_type")
	private String bizClaimType;

	/**
	 * 发货状态，不传默认选择未发货状态
	 */
	@ApiField("goods_status")
	private String goodsStatus;

	/**
	 * 分销子订单id，小程序云分销子订单唯一键值
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	/**
	 * 退款原因ID，作为退款原因映射，通过渲染售后单获取
	 */
	@ApiField("reason_text_id")
	private String reasonTextId;

	/**
	 * 退货数量。单位：个
	 */
	@ApiField("refund_count")
	private Long refundCount;

	/**
	 * 退款金额（单位：分）
	 */
	@ApiField("refund_fee")
	private Long refundFee;

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

	public String getReasonTextId() {
		return this.reasonTextId;
	}
	public void setReasonTextId(String reasonTextId) {
		this.reasonTextId = reasonTextId;
	}

	public Long getRefundCount() {
		return this.refundCount;
	}
	public void setRefundCount(Long refundCount) {
		this.refundCount = refundCount;
	}

	public Long getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(Long refundFee) {
		this.refundFee = refundFee;
	}

}
