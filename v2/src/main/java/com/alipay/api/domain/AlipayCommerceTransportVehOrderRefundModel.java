package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主订单退款
 *
 * @author auto create
 * @since 1.0, 2022-11-16 15:03:14
 */
public class AlipayCommerceTransportVehOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6514253748379898923L;

	/**
	 * 车主系统订单号，商户订单同步到车主系统时，会在获取到此订单号。请注意，该订单号属于车主系统业务订单号。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 应用维度用户ID，唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单类型，使用时务必联系业务或解决方案。
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部请求唯一号，代表一次退款申请，请求唯一且幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 描述一个订单的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 订单退款子订单列表
	 */
	@ApiListField("sub_order_refund_list")
	@ApiField("sub_order_refund_request")
	private List<SubOrderRefundRequest> subOrderRefundList;

	/**
	 * 支付宝收单系统交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public List<SubOrderRefundRequest> getSubOrderRefundList() {
		return this.subOrderRefundList;
	}
	public void setSubOrderRefundList(List<SubOrderRefundRequest> subOrderRefundList) {
		this.subOrderRefundList = subOrderRefundList;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
