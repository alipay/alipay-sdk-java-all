package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序本地商品订单对账明细
 *
 * @author auto create
 * @since 1.0, 2024-07-30 16:23:52
 */
public class SelfItemOrderBillDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 1685216152796295727L;

	/**
	 * 订单凭证号
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 当前订单售卖凭证的原价，单位：元，精确到小数点后两位
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
	 * 代运营服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("isv_alloc_amount")
	private String isvAllocAmount;

	/**
	 * 代运营服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 核销商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

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
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 成交场景
	 */
	@ApiField("order_scene")
	private String orderScene;

	/**
	 * 商品的原始价格，单位：元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_commission")
	private String payCommission;

	/**
	 * 当前订单支付时优惠的金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_discounted_price")
	private String payDiscountedPrice;

	/**
	 * 支付宝优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service")
	private String platformService;

	/**
	 * 退CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("platform_service_refund")
	private String platformServiceRefund;

	/**
	 * 预计CPS技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_cps_amount")
	private String preCpsAmount;

	/**
	 * 预计代运营服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_isv_alloc_amount")
	private String preIsvAllocAmount;

	/**
	 * 预计商家优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_merchant_discount_amount")
	private String preMerchantDiscountAmount;

	/**
	 * 预计支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_pay_commission")
	private String prePayCommission;

	/**
	 * 预计支付宝优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_platform_discount_amount")
	private String prePlatformDiscountAmount;

	/**
	 * 预计达人佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_public_alloc_amount")
	private String prePublicAllocAmount;

	/**
	 * 预计saas服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_saas_alloc_amount")
	private String preSaasAllocAmount;

	/**
	 * 预计用户实付，单位：元，精确到小数点后两位
	 */
	@ApiField("pre_user_fund_amount")
	private String preUserFundAmount;

	/**
	 * 订单预计结算时间
	 */
	@ApiField("predict_settle_time")
	private String predictSettleTime;

	/**
	 * 达人佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("public_alloc_amount")
	private String publicAllocAmount;

	/**
	 * 达人昵称
	 */
	@ApiField("public_name")
	private String publicName;

	/**
	 * 实收金额，单位：元，精确到小数点后两位
	 */
	@ApiField("real_receipt_amount")
	private String realReceiptAmount;

	/**
	 * 退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退代运营服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_isv_alloc_amount")
	private String refundIsvAllocAmount;

	/**
	 * 退商家优惠，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_merchant_discount_amount")
	private String refundMerchantDiscountAmount;

	/**
	 * 退支付手续费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_pay_commission")
	private String refundPayCommission;

	/**
	 * 退支付宝优惠，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_platform_discount_amount")
	private String refundPlatformDiscountAmount;

	/**
	 * 退达人佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_public_alloc_amount")
	private String refundPublicAllocAmount;

	/**
	 * 退saas服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_saas_alloc_amount")
	private String refundSaasAllocAmount;

	/**
	 * 退先享后付商家版技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_service_amount")
	private String refundServiceAmount;

	/**
	 * saas服务商佣金，单位：元，精确到小数点后两位
	 */
	@ApiField("saas_alloc_amount")
	private String saasAllocAmount;

	/**
	 * saas服务商名称
	 */
	@ApiField("saas_name")
	private String saasName;

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
	 * 先享后付商家版技术服务费，单位：元，精确到小数点后两位
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 结算到的银行卡号或支付宝账户
	 */
	@ApiField("settle_account_no")
	private String settleAccountNo;

	/**
	 * 结算账户类型，支付宝或银行卡
	 */
	@ApiField("settle_account_type")
	private String settleAccountType;

	/**
	 * 结算金额，单位：元，精确到小数点后两位
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 结算时的批次号
	 */
	@ApiField("settle_batch_id")
	private String settleBatchId;

	/**
	 * 核销的商家自有门店id
	 */
	@ApiField("settle_rel_shop_id")
	private String settleRelShopId;

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
	 * 核销员名称
	 */
	@ApiField("use_user_name")
	private String useUserName;

	/**
	 * 用户实付，单位：元，精确到小数点后两位
	 */
	@ApiField("user_fund_amount")
	private String userFundAmount;

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

	public String getIsvAllocAmount() {
		return this.isvAllocAmount;
	}
	public void setIsvAllocAmount(String isvAllocAmount) {
		this.isvAllocAmount = isvAllocAmount;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderScene() {
		return this.orderScene;
	}
	public void setOrderScene(String orderScene) {
		this.orderScene = orderScene;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
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

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
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

	public String getPreCpsAmount() {
		return this.preCpsAmount;
	}
	public void setPreCpsAmount(String preCpsAmount) {
		this.preCpsAmount = preCpsAmount;
	}

	public String getPreIsvAllocAmount() {
		return this.preIsvAllocAmount;
	}
	public void setPreIsvAllocAmount(String preIsvAllocAmount) {
		this.preIsvAllocAmount = preIsvAllocAmount;
	}

	public String getPreMerchantDiscountAmount() {
		return this.preMerchantDiscountAmount;
	}
	public void setPreMerchantDiscountAmount(String preMerchantDiscountAmount) {
		this.preMerchantDiscountAmount = preMerchantDiscountAmount;
	}

	public String getPrePayCommission() {
		return this.prePayCommission;
	}
	public void setPrePayCommission(String prePayCommission) {
		this.prePayCommission = prePayCommission;
	}

	public String getPrePlatformDiscountAmount() {
		return this.prePlatformDiscountAmount;
	}
	public void setPrePlatformDiscountAmount(String prePlatformDiscountAmount) {
		this.prePlatformDiscountAmount = prePlatformDiscountAmount;
	}

	public String getPrePublicAllocAmount() {
		return this.prePublicAllocAmount;
	}
	public void setPrePublicAllocAmount(String prePublicAllocAmount) {
		this.prePublicAllocAmount = prePublicAllocAmount;
	}

	public String getPreSaasAllocAmount() {
		return this.preSaasAllocAmount;
	}
	public void setPreSaasAllocAmount(String preSaasAllocAmount) {
		this.preSaasAllocAmount = preSaasAllocAmount;
	}

	public String getPreUserFundAmount() {
		return this.preUserFundAmount;
	}
	public void setPreUserFundAmount(String preUserFundAmount) {
		this.preUserFundAmount = preUserFundAmount;
	}

	public String getPredictSettleTime() {
		return this.predictSettleTime;
	}
	public void setPredictSettleTime(String predictSettleTime) {
		this.predictSettleTime = predictSettleTime;
	}

	public String getPublicAllocAmount() {
		return this.publicAllocAmount;
	}
	public void setPublicAllocAmount(String publicAllocAmount) {
		this.publicAllocAmount = publicAllocAmount;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
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

	public String getRefundIsvAllocAmount() {
		return this.refundIsvAllocAmount;
	}
	public void setRefundIsvAllocAmount(String refundIsvAllocAmount) {
		this.refundIsvAllocAmount = refundIsvAllocAmount;
	}

	public String getRefundMerchantDiscountAmount() {
		return this.refundMerchantDiscountAmount;
	}
	public void setRefundMerchantDiscountAmount(String refundMerchantDiscountAmount) {
		this.refundMerchantDiscountAmount = refundMerchantDiscountAmount;
	}

	public String getRefundPayCommission() {
		return this.refundPayCommission;
	}
	public void setRefundPayCommission(String refundPayCommission) {
		this.refundPayCommission = refundPayCommission;
	}

	public String getRefundPlatformDiscountAmount() {
		return this.refundPlatformDiscountAmount;
	}
	public void setRefundPlatformDiscountAmount(String refundPlatformDiscountAmount) {
		this.refundPlatformDiscountAmount = refundPlatformDiscountAmount;
	}

	public String getRefundPublicAllocAmount() {
		return this.refundPublicAllocAmount;
	}
	public void setRefundPublicAllocAmount(String refundPublicAllocAmount) {
		this.refundPublicAllocAmount = refundPublicAllocAmount;
	}

	public String getRefundSaasAllocAmount() {
		return this.refundSaasAllocAmount;
	}
	public void setRefundSaasAllocAmount(String refundSaasAllocAmount) {
		this.refundSaasAllocAmount = refundSaasAllocAmount;
	}

	public String getRefundServiceAmount() {
		return this.refundServiceAmount;
	}
	public void setRefundServiceAmount(String refundServiceAmount) {
		this.refundServiceAmount = refundServiceAmount;
	}

	public String getSaasAllocAmount() {
		return this.saasAllocAmount;
	}
	public void setSaasAllocAmount(String saasAllocAmount) {
		this.saasAllocAmount = saasAllocAmount;
	}

	public String getSaasName() {
		return this.saasName;
	}
	public void setSaasName(String saasName) {
		this.saasName = saasName;
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

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getSettleAccountNo() {
		return this.settleAccountNo;
	}
	public void setSettleAccountNo(String settleAccountNo) {
		this.settleAccountNo = settleAccountNo;
	}

	public String getSettleAccountType() {
		return this.settleAccountType;
	}
	public void setSettleAccountType(String settleAccountType) {
		this.settleAccountType = settleAccountType;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettleBatchId() {
		return this.settleBatchId;
	}
	public void setSettleBatchId(String settleBatchId) {
		this.settleBatchId = settleBatchId;
	}

	public String getSettleRelShopId() {
		return this.settleRelShopId;
	}
	public void setSettleRelShopId(String settleRelShopId) {
		this.settleRelShopId = settleRelShopId;
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

	public String getUseUserName() {
		return this.useUserName;
	}
	public void setUseUserName(String useUserName) {
		this.useUserName = useUserName;
	}

	public String getUserFundAmount() {
		return this.userFundAmount;
	}
	public void setUserFundAmount(String userFundAmount) {
		this.userFundAmount = userFundAmount;
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
