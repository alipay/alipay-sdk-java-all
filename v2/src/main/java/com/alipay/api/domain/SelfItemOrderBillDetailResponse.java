package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序本地商品订单对账明细
 *
 * @author auto create
 * @since 1.0, 2024-04-19 19:39:14
 */
public class SelfItemOrderBillDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 6636533852711324939L;

	/**
	 * 订单凭证号
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 当前订单售卖凭证的原价，单位分
	 */
	@ApiField("certificate_price")
	private String certificatePrice;

	/**
	 * 凭证状态
	 */
	@ApiField("certificate_status")
	private String certificateStatus;

	/**
	 * 收费类目
	 */
	@ApiField("fee_category")
	private String feeCategory;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 单笔履约关联的商家订单号
	 */
	@ApiField("merchant_verification_no")
	private String merchantVerificationNo;

	/**
	 * 小程序ID，标识当前返回的账单列表所属的小程序
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 成交场景
	 */
	@ApiField("order_scene")
	private String orderScene;

	/**
	 * 支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_commission")
	private String payCommission;

	/**
	 * 当前订单支付时优惠的金额，单位分
	 */
	@ApiField("pay_discounted_price")
	private String payDiscountedPrice;

	/**
	 * 平台技术服务费，单位分
	 */
	@ApiField("platform_service")
	private String platformService;

	/**
	 * 退技术服务费，单位分
	 */
	@ApiField("platform_service_refund")
	private String platformServiceRefund;

	/**
	 * 订单预计结算时间
	 */
	@ApiField("predict_settle_time")
	private String predictSettleTime;

	/**
	 * 实收金额，单位分
	 */
	@ApiField("real_receipt_amount")
	private String realReceiptAmount;

	/**
	 * 退款金额，单位分
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_pay_commission")
	private String refundPayCommission;

	/**
	 * 商家自有门店名称
	 */
	@ApiField("self_shop_name")
	private String selfShopName;

	/**
	 * 凭证核销的次序号 
例：商品为次卡，可使用三次，则一个凭证能够进行三次核销，生成三个核销次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 结算金额，单位分
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 当前凭证的结算状态，下钻到次序号维度
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 订单结算时间
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 当前交易订单关联的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 当前凭证核销门店的ID
	 */
	@ApiField("verification_shop_id")
	private String verificationShopId;

	/**
	 * 核销门店名称
	 */
	@ApiField("verification_shop_name")
	private String verificationShopName;

	/**
	 * 当前凭证核销时间
	 */
	@ApiField("verification_time")
	private Date verificationTime;

	/**
	 * 核销时如发生付款行为（如自提卡业务），则返回此次交易对应的交易号
	 */
	@ApiField("verification_trade_no")
	private String verificationTradeNo;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificatePrice() {
		return this.certificatePrice;
	}
	public void setCertificatePrice(String certificatePrice) {
		this.certificatePrice = certificatePrice;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public String getFeeCategory() {
		return this.feeCategory;
	}
	public void setFeeCategory(String feeCategory) {
		this.feeCategory = feeCategory;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantVerificationNo() {
		return this.merchantVerificationNo;
	}
	public void setMerchantVerificationNo(String merchantVerificationNo) {
		this.merchantVerificationNo = merchantVerificationNo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrderScene() {
		return this.orderScene;
	}
	public void setOrderScene(String orderScene) {
		this.orderScene = orderScene;
	}

	public String getPayCommission() {
		return this.payCommission;
	}
	public void setPayCommission(String payCommission) {
		this.payCommission = payCommission;
	}

	public String getPayDiscountedPrice() {
		return this.payDiscountedPrice;
	}
	public void setPayDiscountedPrice(String payDiscountedPrice) {
		this.payDiscountedPrice = payDiscountedPrice;
	}

	public String getPlatformService() {
		return this.platformService;
	}
	public void setPlatformService(String platformService) {
		this.platformService = platformService;
	}

	public String getPlatformServiceRefund() {
		return this.platformServiceRefund;
	}
	public void setPlatformServiceRefund(String platformServiceRefund) {
		this.platformServiceRefund = platformServiceRefund;
	}

	public String getPredictSettleTime() {
		return this.predictSettleTime;
	}
	public void setPredictSettleTime(String predictSettleTime) {
		this.predictSettleTime = predictSettleTime;
	}

	public String getRealReceiptAmount() {
		return this.realReceiptAmount;
	}
	public void setRealReceiptAmount(String realReceiptAmount) {
		this.realReceiptAmount = realReceiptAmount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundPayCommission() {
		return this.refundPayCommission;
	}
	public void setRefundPayCommission(String refundPayCommission) {
		this.refundPayCommission = refundPayCommission;
	}

	public String getSelfShopName() {
		return this.selfShopName;
	}
	public void setSelfShopName(String selfShopName) {
		this.selfShopName = selfShopName;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getVerificationShopId() {
		return this.verificationShopId;
	}
	public void setVerificationShopId(String verificationShopId) {
		this.verificationShopId = verificationShopId;
	}

	public String getVerificationShopName() {
		return this.verificationShopName;
	}
	public void setVerificationShopName(String verificationShopName) {
		this.verificationShopName = verificationShopName;
	}

	public Date getVerificationTime() {
		return this.verificationTime;
	}
	public void setVerificationTime(Date verificationTime) {
		this.verificationTime = verificationTime;
	}

	public String getVerificationTradeNo() {
		return this.verificationTradeNo;
	}
	public void setVerificationTradeNo(String verificationTradeNo) {
		this.verificationTradeNo = verificationTradeNo;
	}

}
