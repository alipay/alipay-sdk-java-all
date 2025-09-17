package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于同步返回主单信息
 *
 * @author auto create
 * @since 1.0, 2024-12-25 14:01:57
 */
public class PerformBill extends AlipayObject {

	private static final long serialVersionUID = 7358713129889386939L;

	/**
	 * [{"name":"未分账","value":"I"},{"name":"分账中","value":"P"},{"name":"分账成功","value":"S"},{"name":"分账关闭","value":"C"}]
	 */
	@ApiField("alloc_status")
	private String allocStatus;

	/**
	 * 订单金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * [{"name":"未销账","value":"I"},{"name":"销账处理中","value":"P"},{"name":"已销账","value":"S"},{"name":"已关闭","value":"C"}]
	 */
	@ApiField("chargeoff_status")
	private String chargeoffStatus;

	/**
	 * 分账完成时间
	 */
	@ApiField("gmt_alloc")
	private Date gmtAlloc;

	/**
	 * 销账完结时间
	 */
	@ApiField("gmt_chargeoff_finish")
	private Date gmtChargeoffFinish;

	/**
	 * 销账发起时间
	 */
	@ApiField("gmt_chargeoff_start")
	private Date gmtChargeoffStart;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 支付时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/**
	 * 实时结算时间
	 */
	@ApiField("gmt_settle")
	private Date gmtSettle;

	/**
	 * 商户订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 实际支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * [{"name":"未结算","value":"I"},{"name":"结算中","value":"P"},{"name":"结算成功","value":"S"},{"name":"结算关闭","value":"C"}]
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * [{"name":"等待付款","value":"I"},{"name":"付款失败","value":"N"},{"name":"处理中","value":"P"},{"name":"单据关闭","value":"C"},{"name":"退款中","value":"T"},{"name":"全额退款","value":"F"},{"name":"成功","value":"S"},{"name":"部分退款","value":"H"}]
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAllocStatus() {
		return this.allocStatus;
	}
	public void setAllocStatus(String allocStatus) {
		this.allocStatus = allocStatus;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getChargeoffStatus() {
		return this.chargeoffStatus;
	}
	public void setChargeoffStatus(String chargeoffStatus) {
		this.chargeoffStatus = chargeoffStatus;
	}

	public Date getGmtAlloc() {
		return this.gmtAlloc;
	}
	public void setGmtAlloc(Date gmtAlloc) {
		this.gmtAlloc = gmtAlloc;
	}

	public Date getGmtChargeoffFinish() {
		return this.gmtChargeoffFinish;
	}
	public void setGmtChargeoffFinish(Date gmtChargeoffFinish) {
		this.gmtChargeoffFinish = gmtChargeoffFinish;
	}

	public Date getGmtChargeoffStart() {
		return this.gmtChargeoffStart;
	}
	public void setGmtChargeoffStart(Date gmtChargeoffStart) {
		this.gmtChargeoffStart = gmtChargeoffStart;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public Date getGmtSettle() {
		return this.gmtSettle;
	}
	public void setGmtSettle(Date gmtSettle) {
		this.gmtSettle = gmtSettle;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
