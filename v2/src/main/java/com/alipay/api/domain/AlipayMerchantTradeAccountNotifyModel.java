package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连商户动帐通知
 *
 * @author auto create
 * @since 1.0, 2024-12-19 13:35:18
 */
public class AlipayMerchantTradeAccountNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8535411177429624622L;

	/**
	 * 收银员ID，若收银员需要接收动账通知，需要传该字段。该字段值与商户信息查接口中的收银员ID一致
	 */
	@ApiField("cashier_id")
	private String cashierId;

	/**
	 * 商服小程序ID
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 服务商侧商户号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 外部业务号，与收款详情中出参的order_no保持一致，每笔动账确保唯一，否则可能导致消息重复发送
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 组合支付的情况下，列表中为多个值
	 */
	@ApiListField("payer_bank_type_list")
	@ApiField("pay_type")
	private List<PayType> payerBankTypeList;

	/**
	 * 付款用户在当前商家的当天消费金额，交易成功金额的总和
	 */
	@ApiField("payer_total_amount")
	private String payerTotalAmount;

	/**
	 * 付款用户在当前商家的当天消费笔数
	 */
	@ApiField("payer_total_count")
	private Long payerTotalCount;

	/**
	 * 付款用户号
	 */
	@ApiField("payer_user_no")
	private String payerUserNo;

	/**
	 * 用户类型
	 */
	@ApiField("payer_user_type")
	private String payerUserType;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 本交易是支付宝直连交易还是支付宝间连交易
	 */
	@ApiField("sub_trade_channel")
	private String subTradeChannel;

	/**
	 * 如果是微信交易 ，为sub_mch_id的值
如果是间连支付宝交易，为smid的值
如果是直连支付宝交易，为交易pid的值
	 */
	@ApiField("third_party_merchant_no")
	private String thirdPartyMerchantNo;

	/**
	 * 第三方订单号 （支付宝、微信等第三方返回的交易订单号）
	 */
	@ApiField("third_party_trade_no")
	private String thirdPartyTradeNo;

	/**
	 * 当日的交易成功的金额总和
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 当日收款总笔数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 交易金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易渠道
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	/**
	 * 交易成功时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getCashierId() {
		return this.cashierId;
	}
	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PayType> getPayerBankTypeList() {
		return this.payerBankTypeList;
	}
	public void setPayerBankTypeList(List<PayType> payerBankTypeList) {
		this.payerBankTypeList = payerBankTypeList;
	}

	public String getPayerTotalAmount() {
		return this.payerTotalAmount;
	}
	public void setPayerTotalAmount(String payerTotalAmount) {
		this.payerTotalAmount = payerTotalAmount;
	}

	public Long getPayerTotalCount() {
		return this.payerTotalCount;
	}
	public void setPayerTotalCount(Long payerTotalCount) {
		this.payerTotalCount = payerTotalCount;
	}

	public String getPayerUserNo() {
		return this.payerUserNo;
	}
	public void setPayerUserNo(String payerUserNo) {
		this.payerUserNo = payerUserNo;
	}

	public String getPayerUserType() {
		return this.payerUserType;
	}
	public void setPayerUserType(String payerUserType) {
		this.payerUserType = payerUserType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSubTradeChannel() {
		return this.subTradeChannel;
	}
	public void setSubTradeChannel(String subTradeChannel) {
		this.subTradeChannel = subTradeChannel;
	}

	public String getThirdPartyMerchantNo() {
		return this.thirdPartyMerchantNo;
	}
	public void setThirdPartyMerchantNo(String thirdPartyMerchantNo) {
		this.thirdPartyMerchantNo = thirdPartyMerchantNo;
	}

	public String getThirdPartyTradeNo() {
		return this.thirdPartyTradeNo;
	}
	public void setThirdPartyTradeNo(String thirdPartyTradeNo) {
		this.thirdPartyTradeNo = thirdPartyTradeNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
