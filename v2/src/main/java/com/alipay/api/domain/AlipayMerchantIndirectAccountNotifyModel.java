package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联小程序机构动账通知
 *
 * @author auto create
 * @since 1.0, 2023-04-26 17:21:36
 */
public class AlipayMerchantIndirectAccountNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1512318168384782833L;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 间联小程序ID
	 */
	@ApiField("mrchind_app_id")
	private String mrchindAppId;

	/**
	 * 外部唯一流水编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部商户编号(银行商户号)
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 支付渠道，参考枚举如下：
ALIPAY:支付宝
WECHAT_PAY:微信支付
UNION_PAY:银联支付
OTHER	其他付款方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 透传支付渠道付款方银行值
如果是微信渠道，传bank_type字段
如果是支付宝渠道，拼装字段fund_channel|bank_code|fund_type，中间用英文竖线|间隔
	 */
	@ApiField("payer_bank_type")
	private String payerBankType;

	/**
	 * 付款用户在当前商户的当天消费总金额
	 */
	@ApiField("payer_total_amount_on_the_merchant")
	private String payerTotalAmountOnTheMerchant;

	/**
	 * 付款用户在该商家当天的消费笔数
	 */
	@ApiField("payer_total_count_on_the_merchant")
	private Long payerTotalCountOnTheMerchant;

	/**
	 * 付款方用户编号。
如果微信=openid
如果是支付宝=buyer_user_id
	 */
	@ApiField("payer_user_no")
	private String payerUserNo;

	/**
	 * 若商家在机构侧存在多个门店，可上报此交易对应机构侧的门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 若商家在机构侧存在多个门店，可上报此交易对应机构侧的门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商户smid (支付宝进件商户号)
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 三方机构分配的商户识别码
如果是支付宝=smid
如果是微信 = sub_mch_id
	 */
	@ApiField("third_party_merchant_no")
	private String thirdPartyMerchantNo;

	/**
	 * 第三方订单号
（支付宝、微信等第三方返回的交易订单号）
	 */
	@ApiField("third_party_trade_no")
	private String thirdPartyTradeNo;

	/**
	 * 当日收款总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 当日收款总笔数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 交易成功时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMrchindAppId() {
		return this.mrchindAppId;
	}
	public void setMrchindAppId(String mrchindAppId) {
		this.mrchindAppId = mrchindAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPayerBankType() {
		return this.payerBankType;
	}
	public void setPayerBankType(String payerBankType) {
		this.payerBankType = payerBankType;
	}

	public String getPayerTotalAmountOnTheMerchant() {
		return this.payerTotalAmountOnTheMerchant;
	}
	public void setPayerTotalAmountOnTheMerchant(String payerTotalAmountOnTheMerchant) {
		this.payerTotalAmountOnTheMerchant = payerTotalAmountOnTheMerchant;
	}

	public Long getPayerTotalCountOnTheMerchant() {
		return this.payerTotalCountOnTheMerchant;
	}
	public void setPayerTotalCountOnTheMerchant(Long payerTotalCountOnTheMerchant) {
		this.payerTotalCountOnTheMerchant = payerTotalCountOnTheMerchant;
	}

	public String getPayerUserNo() {
		return this.payerUserNo;
	}
	public void setPayerUserNo(String payerUserNo) {
		this.payerUserNo = payerUserNo;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
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

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
