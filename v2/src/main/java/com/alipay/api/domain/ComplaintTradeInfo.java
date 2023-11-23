package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投诉涉及交易信息
 *
 * @author auto create
 * @since 1.0, 2023-06-06 14:16:37
 */
public class ComplaintTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 5724264473414885697L;

	/**
	 * 交易单金额（单位：人民币元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 投诉主表id
	 */
	@ApiField("complaint_record_id")
	private String complaintRecordId;

	/**
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/**
	 * 交易时间
	 */
	@ApiField("gmt_trade")
	private Date gmtTrade;

	/**
	 * 交易信息表主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商家订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 交易投诉状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易投诉状态描述
	 */
	@ApiField("status_description")
	private String statusDescription;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getComplaintRecordId() {
		return this.complaintRecordId;
	}
	public void setComplaintRecordId(String complaintRecordId) {
		this.complaintRecordId = complaintRecordId;
	}

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public Date getGmtTrade() {
		return this.gmtTrade;
	}
	public void setGmtTrade(Date gmtTrade) {
		this.gmtTrade = gmtTrade;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
