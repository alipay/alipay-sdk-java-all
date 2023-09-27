package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RefundChargeInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.PresetPayToolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 16:41:44
 */
public class AlipayTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4228483612566833596L;

	/** 
	 * 用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 退款支付时间
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 是否有银行卡冲退，仅当query_options中传入deposit_back_info时返回
	 */
	@ApiField("has_deposit_back")
	private String hasDepositBack;

	/** 
	 * 买家支付宝用户号，该参数已废弃，请不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款金额中买家退款金额;单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_buyer_amount")
	private String presentRefundBuyerAmount;

	/** 
	 * 本次退款金额中平台优惠退款金额；单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_discount_amount")
	private String presentRefundDiscountAmount;

	/** 
	 * 本次退款金额中商家优惠退款金额；单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_mdiscount_amount")
	private String presentRefundMdiscountAmount;

	/** 
	 * 本次退款针对收款方的退收费金额；单位：元。
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("refund_charge_amount")
	private String refundChargeAmount;

	/** 
	 * 退费信息
	 */
	@ApiListField("refund_charge_info_list")
	@ApiField("refund_charge_info")
	private List<RefundChargeInfo> refundChargeInfoList;

	/** 
	 * 退款币种信息
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/** 
	 * 退款使用的资金渠道。
只有在签约中指定需要返回资金明细，或者入参的query_options中指定时才返回该字段信息。
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundDetailItemList;

	/** 
	 * 退款总金额。单位：元。
指该笔交易累计已经退款成功的金额。
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 本次请求退惠营宝金额。单位：元。
	 */
	@ApiField("refund_hyb_amount")
	private String refundHybAmount;

	/** 
	 * 退回的前置资产列表
	 */
	@ApiField("refund_preset_paytool_list")
	private PresetPayToolInfo refundPresetPaytoolList;

	/** 
	 * 退款清算编号，用于清算对账使用；
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("refund_settlement_id")
	private String refundSettlementId;

	/** 
	 * 本次商户实际退回金额。单位：元。
说明：如需获取该值，需在入参query_options中传入 refund_detail_item_list。
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 交易在支付时候的门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId( ) {
		return this.buyerOpenId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	public String getFundChange( ) {
		return this.fundChange;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setHasDepositBack(String hasDepositBack) {
		this.hasDepositBack = hasDepositBack;
	}
	public String getHasDepositBack( ) {
		return this.hasDepositBack;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
		this.presentRefundBuyerAmount = presentRefundBuyerAmount;
	}
	public String getPresentRefundBuyerAmount( ) {
		return this.presentRefundBuyerAmount;
	}

	public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
		this.presentRefundDiscountAmount = presentRefundDiscountAmount;
	}
	public String getPresentRefundDiscountAmount( ) {
		return this.presentRefundDiscountAmount;
	}

	public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
		this.presentRefundMdiscountAmount = presentRefundMdiscountAmount;
	}
	public String getPresentRefundMdiscountAmount( ) {
		return this.presentRefundMdiscountAmount;
	}

	public void setRefundChargeAmount(String refundChargeAmount) {
		this.refundChargeAmount = refundChargeAmount;
	}
	public String getRefundChargeAmount( ) {
		return this.refundChargeAmount;
	}

	public void setRefundChargeInfoList(List<RefundChargeInfo> refundChargeInfoList) {
		this.refundChargeInfoList = refundChargeInfoList;
	}
	public List<RefundChargeInfo> getRefundChargeInfoList( ) {
		return this.refundChargeInfoList;
	}

	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}
	public String getRefundCurrency( ) {
		return this.refundCurrency;
	}

	public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	public List<TradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

	public void setRefundHybAmount(String refundHybAmount) {
		this.refundHybAmount = refundHybAmount;
	}
	public String getRefundHybAmount( ) {
		return this.refundHybAmount;
	}

	public void setRefundPresetPaytoolList(PresetPayToolInfo refundPresetPaytoolList) {
		this.refundPresetPaytoolList = refundPresetPaytoolList;
	}
	public PresetPayToolInfo getRefundPresetPaytoolList( ) {
		return this.refundPresetPaytoolList;
	}

	public void setRefundSettlementId(String refundSettlementId) {
		this.refundSettlementId = refundSettlementId;
	}
	public String getRefundSettlementId( ) {
		return this.refundSettlementId;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName( ) {
		return this.storeName;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
