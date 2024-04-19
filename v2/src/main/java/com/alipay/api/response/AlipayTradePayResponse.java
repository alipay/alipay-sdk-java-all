package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BkAgentRespInfo;
import com.alipay.api.domain.ChargeInfo;
import com.alipay.api.domain.EnterprisePayInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 14:35:48
 */
public class AlipayTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6715225863995724491L;

	/** 
	 * 先享后付2.0垫资金额,不返回表示没有走垫资，非空表示垫资支付的金额
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/** 
	 * 异步支付模式，目前有五种值：
ASYNC_DELAY_PAY(异步延时付款);
ASYNC_REALTIME_PAY(异步准实时付款);
SYNC_DIRECT_PAY(同步直接扣款);
NORMAL_ASYNC_PAY(纯异步付款);
QUOTA_OCCUPYIED_ASYNC_PAY(异步支付并且预占了先享后付额度);
	 */
	@ApiField("async_payment_mode")
	private String asyncPaymentMode;

	/** 
	 * 预授权支付模式，该参数仅在信用预授权支付场景下返回。信用预授权支付：CREDIT_PREAUTH_PAY
	 */
	@ApiField("auth_trade_pay_mode")
	private String authTradePayMode;

	/** 
	 * 间联交易下，返回给机构的信息
	 */
	@ApiField("bkagent_resp_info")
	private BkAgentRespInfo bkagentRespInfo;

	/** 
	 * 商户传入业务信息，具体值要和支付宝约定
将商户传入信息分发给相应系统，应用于安全，营销等参数直传场景
格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 买家付款的金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 买家名称；
买家为个人用户时为买家姓名，买家为企业用户时为企业名称；
默认不返回该信息，需与支付宝约定后配置返回；
	 */
	@ApiField("buyer_user_name")
	private String buyerUserName;

	/** 
	 * 买家用户类型。
	 */
	@ApiField("buyer_user_type")
	private String buyerUserType;

	/** 
	 * 是否可以转为app支付，仅当商户代扣失败场景才会返回该字段信息
	 */
	@ApiField("can_turn_to_app_pay")
	private String canTurnToAppPay;

	/** 
	 * 支付宝卡余额
	 */
	@ApiField("card_balance")
	private String cardBalance;

	/** 
	 * 该笔交易针对收款方的收费金额；
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("charge_amount")
	private String chargeAmount;

	/** 
	 * 费率活动标识。
当交易享受特殊行业或活动费率时，返回该场景的标识。具体场景如下：
trade_special_00：订单优惠费率；
industry_special_on_00：线上行业特殊费率0；
industry_special_on_01：线上行业特殊费率1；
industry_special_00：线下行业特殊费率0；
industry_special_01：线下行业特殊费率1；
bluesea_1：蓝海活动优惠费率标签；
注：只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("charge_flags")
	private String chargeFlags;

	/** 
	 * 计费信息列表
	 */
	@ApiField("charge_info_list")
	private ChargeInfo chargeInfoList;

	/** 
	 * 信用业务单号。信用支付场景才有值。先用后付产品里是芝麻订单号。
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用支付模式。表示订单是采用信用支付方式（支付时买家没有出资，需要后续履约）。"creditAdvanceV2"表示芝麻先用后付模式，用户后续需要履约扣款。 此字段只有信用支付场景才有值，商户需要根据字段值单独处理。此字段以后可能扩展其他值，建议商户使用白名单方式识别，对于未识别的值做失败处理，并联系支付宝技术支持人员。
	 */
	@ApiField("credit_pay_mode")
	private String creditPayMode;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 本次交易支付所使用的单品券优惠的商品优惠信息。
只有在query_options中指定时才返回该字段信息。
	 */
	@ApiField("discount_goods_detail")
	private String discountGoodsDetail;

	/** 
	 * 因公付支付信息，只有入参的query_options中指定时才返回该字段信息
	 */
	@ApiField("enterprise_pay_info")
	private EnterprisePayInfo enterprisePayInfo;

	/** 
	 * 交易支付使用的资金渠道。
只有在签约中指定需要返回资金明细，或者入参的query_options中指定时才返回该字段信息。
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/** 
	 * 交易支付时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 惠营宝回票金额
	 */
	@ApiField("hyb_amount")
	private String hybAmount;

	/** 
	 * 交易中可给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/** 
	 * 买家支付宝用户号,该参数已废弃，请不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付币种订单金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付币种
	 */
	@ApiField("pay_currency")
	private String payCurrency;

	/** 
	 * 使用集分宝付款的金额
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 收款资金类型，当交易收款资金为数字人民币时返回值为“DC”，否则不返回该字段。
	 */
	@ApiField("receipt_currency_type")
	private String receiptCurrencyType;

	/** 
	 * 结算币种订单金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 商户指定的结算币种，目前支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/** 
	 * 结算币种兑换标价币种汇率
	 */
	@ApiField("settle_trans_rate")
	private String settleTransRate;

	/** 
	 * 支付清算编号，用于清算对账使用；
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("settlement_id")
	private String settlementId;

	/** 
	 * 发生支付交易的商户门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 交易金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 标价币种, total_amount对应的币种单位。目前支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/** 
	 * 标价币种兑换支付币种汇率
	 */
	@ApiField("trans_pay_rate")
	private String transPayRate;

	/** 
	 * 本交易支付时使用的所有优惠券信息。
只有在query_options中指定时才返回该字段信息。
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail")
	private List<VoucherDetail> voucherDetailList;

	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getAdvanceAmount( ) {
		return this.advanceAmount;
	}

	public void setAsyncPaymentMode(String asyncPaymentMode) {
		this.asyncPaymentMode = asyncPaymentMode;
	}
	public String getAsyncPaymentMode( ) {
		return this.asyncPaymentMode;
	}

	public void setAuthTradePayMode(String authTradePayMode) {
		this.authTradePayMode = authTradePayMode;
	}
	public String getAuthTradePayMode( ) {
		return this.authTradePayMode;
	}

	public void setBkagentRespInfo(BkAgentRespInfo bkagentRespInfo) {
		this.bkagentRespInfo = bkagentRespInfo;
	}
	public BkAgentRespInfo getBkagentRespInfo( ) {
		return this.bkagentRespInfo;
	}

	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}
	public String getBusinessParams( ) {
		return this.businessParams;
	}

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

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}
	public String getBuyerUserName( ) {
		return this.buyerUserName;
	}

	public void setBuyerUserType(String buyerUserType) {
		this.buyerUserType = buyerUserType;
	}
	public String getBuyerUserType( ) {
		return this.buyerUserType;
	}

	public void setCanTurnToAppPay(String canTurnToAppPay) {
		this.canTurnToAppPay = canTurnToAppPay;
	}
	public String getCanTurnToAppPay( ) {
		return this.canTurnToAppPay;
	}

	public void setCardBalance(String cardBalance) {
		this.cardBalance = cardBalance;
	}
	public String getCardBalance( ) {
		return this.cardBalance;
	}

	public void setChargeAmount(String chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	public String getChargeAmount( ) {
		return this.chargeAmount;
	}

	public void setChargeFlags(String chargeFlags) {
		this.chargeFlags = chargeFlags;
	}
	public String getChargeFlags( ) {
		return this.chargeFlags;
	}

	public void setChargeInfoList(ChargeInfo chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}
	public ChargeInfo getChargeInfoList( ) {
		return this.chargeInfoList;
	}

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setCreditPayMode(String creditPayMode) {
		this.creditPayMode = creditPayMode;
	}
	public String getCreditPayMode( ) {
		return this.creditPayMode;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setDiscountGoodsDetail(String discountGoodsDetail) {
		this.discountGoodsDetail = discountGoodsDetail;
	}
	public String getDiscountGoodsDetail( ) {
		return this.discountGoodsDetail;
	}

	public void setEnterprisePayInfo(EnterprisePayInfo enterprisePayInfo) {
		this.enterprisePayInfo = enterprisePayInfo;
	}
	public EnterprisePayInfo getEnterprisePayInfo( ) {
		return this.enterprisePayInfo;
	}

	public void setFundBillList(List<TradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<TradeFundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setHybAmount(String hybAmount) {
		this.hybAmount = hybAmount;
	}
	public String getHybAmount( ) {
		return this.hybAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}
	public String getMdiscountAmount( ) {
		return this.mdiscountAmount;
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

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}
	public String getPayCurrency( ) {
		return this.payCurrency;
	}

	public void setPointAmount(String pointAmount) {
		this.pointAmount = pointAmount;
	}
	public String getPointAmount( ) {
		return this.pointAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setReceiptCurrencyType(String receiptCurrencyType) {
		this.receiptCurrencyType = receiptCurrencyType;
	}
	public String getReceiptCurrencyType( ) {
		return this.receiptCurrencyType;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}
	public String getSettleCurrency( ) {
		return this.settleCurrency;
	}

	public void setSettleTransRate(String settleTransRate) {
		this.settleTransRate = settleTransRate;
	}
	public String getSettleTransRate( ) {
		return this.settleTransRate;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}
	public String getSettlementId( ) {
		return this.settlementId;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName( ) {
		return this.storeName;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}
	public String getTransCurrency( ) {
		return this.transCurrency;
	}

	public void setTransPayRate(String transPayRate) {
		this.transPayRate = transPayRate;
	}
	public String getTransPayRate( ) {
		return this.transPayRate;
	}

	public void setVoucherDetailList(List<VoucherDetail> voucherDetailList) {
		this.voucherDetailList = voucherDetailList;
	}
	public List<VoucherDetail> getVoucherDetailList( ) {
		return this.voucherDetailList;
	}

}
