package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单退款接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:22:08
 */
public class AlipayDaoweiOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8792768214929163899L;

	/**
	 * 退款操作备注信息，用于详述退款单原因（使用该接口，必须要详细说明退款的原因），必填，长度不超过2000字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部商户的退款id，用于控制退款操作的幂等，不同退款请求保证不同，最大长度不超过64字符
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款金额，单位是元，商户可以全额退款也可以部分，退款金额不大于订单实际支付金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单退款的详细信息：可能包含多个服务订单的退款，内部包含每一个服务的订单号和单个的退款金额
	 */
	@ApiListField("refund_details")
	@ApiField("order_refund_info")
	private List<OrderRefundInfo> refundDetails;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<OrderRefundInfo> getRefundDetails() {
		return this.refundDetails;
	}
	public void setRefundDetails(List<OrderRefundInfo> refundDetails) {
		this.refundDetails = refundDetails;
	}

}
