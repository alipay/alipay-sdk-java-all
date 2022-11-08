package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单同步时订单交易信息的数据，包括交易单号、交易金额、收款人、付款人信息、交易类型等。
 *
 * @author auto create
 * @since 1.0, 2022-03-02 14:33:56
 */
public class VenueOrderTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 2457631386787221668L;

	/**
	 * 金额(单位：元)，保留两位小数。支付时为订单金额、退款时为交易退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 操作描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 交易记录号，须保证单笔订单内唯一，不重复。
	 */
	@ApiField("id")
	private String id;

	/**
	 * 该交易操作发起的时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 交易所属pid，一般为发起交易的应用配置的pid。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付宝退款交易的请求号，标识一次退款请求，对应发起退款时的out_request_no。交易类型为退款时必传。
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 支付宝交易单号，本条记录对应的交易信息。如果是支付行为，则直接为交易单号；如果是基于原支付交易单原路返还退款，则为原支付交易单号；
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易类型，包括'pay'-支付、'refund'-退款
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 用户在支付宝的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
