package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票管家交易信息模型
 *
 * @author auto create
 * @since 1.0, 2019-11-29 10:54:28
 */
public class InvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 8556387764635317387L;

	/**
	 * 支付宝交易号（字段于2017-02-21废弃，请勿使用）
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 交易创建时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("create_trade_date")
	private String createTradeDate;

	/**
	 * 交易号（发票管家指定）
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 交易商品总称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 发票内容项明细
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_query_open_model")
	private List<InvoiceItemQueryOpenModel> invoiceContent;

	/**
	 * 品牌全称，由商户在发票管家配置
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 交易商户品牌简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 交易所属的商户id，即卖家主体标志，可以为支付宝的门店id
也可以为支付宝的签约pid，也可以为支付宝的收款账户seller_user_id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户交易订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易支付时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("payment_trade_date")
	private String paymentTradeDate;

	/**
	 * 实际付款金额，不包含商户优惠金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 商户门店全称，由商户在发票管家配置
	 */
	@ApiField("sub_m_name")
	private String subMName;

	/**
	 * 商户交易门店简称，一般由m_short_name+sub_m_short_name确定唯一的商户，这两项配置需要商户提前在支付宝配置
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 交易总金额，精确到小数点两位，以元为单位
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易资金明细列表
	 */
	@ApiListField("trade_fund_list")
	@ApiField("invoice_trade_fund_item")
	private List<InvoiceTradeFundItem> tradeFundList;

	/**
	 * 交易商品明细列表
	 */
	@ApiListField("trade_goods_list")
	@ApiField("invoice_trade_goods_item")
	private List<InvoiceTradeGoodsItem> tradeGoodsList;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易的买家支付宝账户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getCreateTradeDate() {
		return this.createTradeDate;
	}
	public void setCreateTradeDate(String createTradeDate) {
		this.createTradeDate = createTradeDate;
	}

	public String getEinvTradeId() {
		return this.einvTradeId;
	}
	public void setEinvTradeId(String einvTradeId) {
		this.einvTradeId = einvTradeId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public List<InvoiceItemQueryOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(List<InvoiceItemQueryOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getmName() {
		return this.mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPaymentTradeDate() {
		return this.paymentTradeDate;
	}
	public void setPaymentTradeDate(String paymentTradeDate) {
		this.paymentTradeDate = paymentTradeDate;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getSubMName() {
		return this.subMName;
	}
	public void setSubMName(String subMName) {
		this.subMName = subMName;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public List<InvoiceTradeFundItem> getTradeFundList() {
		return this.tradeFundList;
	}
	public void setTradeFundList(List<InvoiceTradeFundItem> tradeFundList) {
		this.tradeFundList = tradeFundList;
	}

	public List<InvoiceTradeGoodsItem> getTradeGoodsList() {
		return this.tradeGoodsList;
	}
	public void setTradeGoodsList(List<InvoiceTradeGoodsItem> tradeGoodsList) {
		this.tradeGoodsList = tradeGoodsList;
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
