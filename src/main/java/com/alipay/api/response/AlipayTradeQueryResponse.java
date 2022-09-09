package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterprisePayInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.HbFqPayInfo;
import com.alipay.api.domain.TradeSettleInfo;
import com.alipay.api.domain.VoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-02 22:38:16
 */
public class AlipayTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182724641478684377L;

	/** 
	 * 支付宝店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/** 
	 * 间连商户在支付宝端的商户编号；
 只在银行间联交易场景下返回该信息；
	 */
	@ApiField("alipay_sub_merchant_id")
	private String alipaySubMerchantId;

	/** 
	 * 预授权支付模式，该参数仅在信用预授权支付场景下返回。信用预授权支付：CREDIT_PREAUTH_PAY
	 */
	@ApiField("auth_trade_pay_mode")
	private String authTradePayMode;

	/** 
	 * 订单描述；
只在银行间联交易场景下返回该信息；
	 */
	@ApiField("body")
	private String body;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
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
	 * 买家用户类型。CORPORATE:企业用户；PRIVATE:个人用户。
	 */
	@ApiField("buyer_user_type")
	private String buyerUserType;

	/** 
	 * 该笔交易针对收款方的收费金额；
 只在银行间联交易场景下返回该信息；
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
	 * 信用业务单号。信用支付场景才有值，先用后付产品里是芝麻订单号。
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
	 * 因公付支付信息
	 */
	@ApiField("enterprise_pay_info")
	private EnterprisePayInfo enterprisePayInfo;

	/** 
	 * 交易额外信息，特殊场景下与支付宝约定返回。
json格式。
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/** 
	 * 交易支付使用的资金渠道。
只有在签约中指定需要返回资金明细，或者入参的query_options中指定时才返回该字段信息。
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/** 
	 * 若用户使用花呗分期支付，且商家开通返回此通知参数，则会返回花呗分期信息。json格式其它说明详见花呗分期信息说明。
注意：商家需与支付宝约定后才返回本参数。
	 */
	@ApiField("hb_fq_pay_info")
	private HbFqPayInfo hbFqPayInfo;

	/** 
	 * 惠营宝回票金额
	 */
	@ApiField("hyb_amount")
	private String hybAmount;

	/** 
	 * 行业特殊信息（例如在医保卡支付业务中，向用户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 行业特殊信息-个账相关
	 */
	@ApiField("industry_sepc_detail_acc")
	private String industrySepcDetailAcc;

	/** 
	 * 行业特殊信息-统筹相关
	 */
	@ApiField("industry_sepc_detail_gov")
	private String industrySepcDetailGov;

	/** 
	 * 交易中用户支付的可开具发票的金额，单位为元，两位小数。该金额代表该笔交易中可以给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/** 
	 * 买家支付宝用户号，该字段将废弃，不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 公用回传参数。
返回支付时传入的passback_params参数信息
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/** 
	 * 支付币种订单金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 订单支付币种
	 */
	@ApiField("pay_currency")
	private String payCurrency;

	/** 
	 * 积分支付的金额，单位为元，两位小数。该金额代表该笔交易中用户使用积分支付的金额，比如集分宝或者支付宝实时优惠等
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 收款资金类型，当交易收款资金为数字人民币时返回值为“DC”，否则不返回该字段。
	 */
	@ApiField("receipt_currency_type")
	private String receiptCurrencyType;

	/** 
	 * 本次交易打款给卖家的时间
	 */
	@ApiField("send_pay_date")
	private Date sendPayDate;

	/** 
	 * 结算币种订单金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 订单结算币种，对应支付接口传入的settle_currency，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR
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
只在银行间联交易场景下返回该信息；
	 */
	@ApiField("settlement_id")
	private String settlementId;

	/** 
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 请求交易支付中的商户店铺的名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 订单标题；
 只在银行间联交易场景下返回该信息；
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 返回的交易结算信息，包含分账、补差等信息。
只有在query_options中指定时才返回该字段信息。
	 */
	@ApiField("trade_settle_info")
	private TradeSettleInfo tradeSettleInfo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 标价币种，该参数的值为支付时传入的trans_currency，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY、新台币：TWD。当trans_currency 和 settle_currency 不一致时，trans_currency支持人民币：CNY、新台币：TWD
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

	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}
	public String getAlipayStoreId( ) {
		return this.alipayStoreId;
	}

	public void setAlipaySubMerchantId(String alipaySubMerchantId) {
		this.alipaySubMerchantId = alipaySubMerchantId;
	}
	public String getAlipaySubMerchantId( ) {
		return this.alipaySubMerchantId;
	}

	public void setAuthTradePayMode(String authTradePayMode) {
		this.authTradePayMode = authTradePayMode;
	}
	public String getAuthTradePayMode( ) {
		return this.authTradePayMode;
	}

	public void setBody(String body) {
		this.body = body;
	}
	public String getBody( ) {
		return this.body;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
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

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

	public void setFundBillList(List<TradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<TradeFundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setHbFqPayInfo(HbFqPayInfo hbFqPayInfo) {
		this.hbFqPayInfo = hbFqPayInfo;
	}
	public HbFqPayInfo getHbFqPayInfo( ) {
		return this.hbFqPayInfo;
	}

	public void setHybAmount(String hybAmount) {
		this.hybAmount = hybAmount;
	}
	public String getHybAmount( ) {
		return this.hybAmount;
	}

	public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}
	public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
	}

	public void setIndustrySepcDetailAcc(String industrySepcDetailAcc) {
		this.industrySepcDetailAcc = industrySepcDetailAcc;
	}
	public String getIndustrySepcDetailAcc( ) {
		return this.industrySepcDetailAcc;
	}

	public void setIndustrySepcDetailGov(String industrySepcDetailGov) {
		this.industrySepcDetailGov = industrySepcDetailGov;
	}
	public String getIndustrySepcDetailGov( ) {
		return this.industrySepcDetailGov;
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

	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}
	public String getPassbackParams( ) {
		return this.passbackParams;
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

	public void setSendPayDate(Date sendPayDate) {
		this.sendPayDate = sendPayDate;
	}
	public Date getSendPayDate( ) {
		return this.sendPayDate;
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

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName( ) {
		return this.storeName;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId( ) {
		return this.terminalId;
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

	public void setTradeSettleInfo(TradeSettleInfo tradeSettleInfo) {
		this.tradeSettleInfo = tradeSettleInfo;
	}
	public TradeSettleInfo getTradeSettleInfo( ) {
		return this.tradeSettleInfo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
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
