package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.perform.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 15:16:53
 */
public class AlipayEbppIndustryPerformOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7767261928468552482L;

	/** 
	 * 账单金额(订单原价，金额分)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 销账状态
	 */
	@ApiField("chargeoff_status")
	private String chargeoffStatus;

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
	 * 机构code
	 */
	@ApiField("inst_code")
	private String instCode;

	/** 
	 * 主机构code
	 */
	@ApiField("inst_group")
	private String instGroup;

	/** 
	 * 外部商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 外部唯一订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 实际支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 结算状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setChargeoffStatus(String chargeoffStatus) {
		this.chargeoffStatus = chargeoffStatus;
	}
	public String getChargeoffStatus( ) {
		return this.chargeoffStatus;
	}

	public void setGmtChargeoffFinish(Date gmtChargeoffFinish) {
		this.gmtChargeoffFinish = gmtChargeoffFinish;
	}
	public Date getGmtChargeoffFinish( ) {
		return this.gmtChargeoffFinish;
	}

	public void setGmtChargeoffStart(Date gmtChargeoffStart) {
		this.gmtChargeoffStart = gmtChargeoffStart;
	}
	public Date getGmtChargeoffStart( ) {
		return this.gmtChargeoffStart;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public Date getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setGmtSettle(Date gmtSettle) {
		this.gmtSettle = gmtSettle;
	}
	public Date getGmtSettle( ) {
		return this.gmtSettle;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getInstCode( ) {
		return this.instCode;
	}

	public void setInstGroup(String instGroup) {
		this.instGroup = instGroup;
	}
	public String getInstGroup( ) {
		return this.instGroup;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}
	public String getOutNo( ) {
		return this.outNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}
	public String getSettleStatus( ) {
		return this.settleStatus;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
