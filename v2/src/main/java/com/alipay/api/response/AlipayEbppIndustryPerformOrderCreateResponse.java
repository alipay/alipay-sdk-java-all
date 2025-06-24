package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.perform.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-25 17:07:11
 */
public class AlipayEbppIndustryPerformOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2167341349598431439L;

	/** 
	 * 分账状态
	 */
	@ApiField("alloc_status")
	private String allocStatus;

	/** 
	 * 账单金额(订单原价，单位元)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 销账状态
	 */
	@ApiField("chargeoff_status")
	private String chargeoffStatus;

	/** 
	 * 创单类型
	 */
	@ApiField("create_type")
	private String createType;

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
	 * 支付成功时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 退款成功时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/** 
	 * 实时结算成功时间
	 */
	@ApiField("gmt_settle")
	private Date gmtSettle;

	/** 
	 * 行业业务受理平台分配的机构编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/** 
	 * 行业业务受理平台分配的父机构编码
	 */
	@ApiField("inst_group")
	private String instGroup;

	/** 
	 * 商户订单号。
订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 行业业务受理平台分配的业务服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 实时结算状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 行业业务受理平台分配的商户服务唯一编码
	 */
	@ApiField("unique_code")
	private String uniqueCode;

	public void setAllocStatus(String allocStatus) {
		this.allocStatus = allocStatus;
	}
	public String getAllocStatus( ) {
		return this.allocStatus;
	}

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

	public void setCreateType(String createType) {
		this.createType = createType;
	}
	public String getCreateType( ) {
		return this.createType;
	}

	public void setGmtAlloc(Date gmtAlloc) {
		this.gmtAlloc = gmtAlloc;
	}
	public Date getGmtAlloc( ) {
		return this.gmtAlloc;
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

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
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

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}
	public String getOutNo( ) {
		return this.outNo;
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

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}
	public String getUniqueCode( ) {
		return this.uniqueCode;
	}

}
