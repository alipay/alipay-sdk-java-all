package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单退款前商户确认退款结果
 *
 * @author auto create
 * @since 1.0, 2023-03-07 16:06:51
 */
public class AlipayMarketingActivityOrderRefundconfirmcommitModel extends AlipayObject {

	private static final long serialVersionUID = 4811567377579538334L;

	/**
	 * 买家的支付宝uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家的支付宝openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 购买商家兑换券的营销订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款前向商户确认退款结果活动列表明细
	 */
	@ApiListField("refund_confirm_commit_activity_info_list")
	@ApiField("refund_confirm_commit_activity_info")
	private List<RefundConfirmCommitActivityInfo> refundConfirmCommitActivityInfoList;

	/**
	 * 订单退款类型
	 */
	@ApiField("refund_type")
	private String refundType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<RefundConfirmCommitActivityInfo> getRefundConfirmCommitActivityInfoList() {
		return this.refundConfirmCommitActivityInfoList;
	}
	public void setRefundConfirmCommitActivityInfoList(List<RefundConfirmCommitActivityInfo> refundConfirmCommitActivityInfoList) {
		this.refundConfirmCommitActivityInfoList = refundConfirmCommitActivityInfoList;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
