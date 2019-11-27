package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易记录详情信息
 *
 * @author auto create
 * @since 1.0, 2019-10-10 16:20:06
 */
public class TradeItemResult extends AlipayObject {

	private static final long serialVersionUID = 1277595155639572162L;

	/**
	 * 支付宝订单号。对账使用，不脱敏
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 交易创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 交易支付时间
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/**
	 * 交易退款时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 商品备注信息
	 */
	@ApiField("goods_memo")
	private String goodsMemo;

	/**
	 * 商品名称
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商家优惠金额
	 */
	@ApiField("net_mdiscount")
	private String netMdiscount;

	/**
	 * 对方账户
	 */
	@ApiField("other_account")
	private String otherAccount;

	/**
	 * 订单退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 服务费金额
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店编号
	 */
	@ApiField("store_no")
	private String storeNo;

	/**
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 业务类型，帮助商户作为对账参考
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public String getGoodsMemo() {
		return this.goodsMemo;
	}
	public void setGoodsMemo(String goodsMemo) {
		this.goodsMemo = goodsMemo;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getNetMdiscount() {
		return this.netMdiscount;
	}
	public void setNetMdiscount(String netMdiscount) {
		this.netMdiscount = netMdiscount;
	}

	public String getOtherAccount() {
		return this.otherAccount;
	}
	public void setOtherAccount(String otherAccount) {
		this.otherAccount = otherAccount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
