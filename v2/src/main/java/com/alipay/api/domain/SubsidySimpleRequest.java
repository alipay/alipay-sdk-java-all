package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * subsidySimpleRequest
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class SubsidySimpleRequest extends AlipayObject {

	private static final long serialVersionUID = 4293117627493582579L;

	/**
	 * 收单模式（淘外场景使用）
	 */
	@ApiField("acquire_mode")
	private String acquireMode;

	/**
	 * 资产类型编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 一级业务标识
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 用户id，即付款方（亲密付类似场景预留字段）
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 商品id
	 */
	@ApiField("good_item_id")
	private String goodItemId;

	/**
	 * 分期期数
	 */
	@ApiListField("install_nums")
	@ApiField("string")
	private List<String> installNums;

	/**
	 * 分期贴息参数
	 */
	@ApiField("installment_biz_info")
	private String installmentBizInfo;

	/**
	 * 第三方出资id（主子店铺场景预留字段）
	 */
	@ApiField("investor_id")
	private String investorId;

	/**
	 * 国际链路中能够唯一区分二级商户粒度的独立字段。由unitradeprod进行拼接。
	 */
	@ApiField("ipay_secmerchant")
	private String ipaySecmerchant;

	/**
	 * 是否合并支付2.0
	 */
	@ApiField("merge_pay")
	private Boolean mergePay;

	/**
	 * 内部门店id。直连、国内间连有使用。（含义不清楚，待定）
	 */
	@ApiField("mshop_id")
	private String mshopId;

	/**
	 * 本笔交易订单金额
	 */
	@ApiField("order_amount")
	private SubsidyMoney orderAmount;

	/**
	 * 原始商户id。目前国际站全3链路才有使用，入驻全球站的机构或直连商户ID
	 */
	@ApiField("original_mid")
	private String originalMid;

	/**
	 * 原始卖家id。目前国际站全3链路才有使用，机构分配商户的ID（全球站）
	 */
	@ApiField("original_seller_id")
	private String originalSellerId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商家pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 一般指同一个商家 会有多个平台载体(直接管控商品或承载商户入驻)，如taobao，tmall 
* 淘系一般都有值，淘外一般为空。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 业务平台类型
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 销售产品码 与deliveryProductCode含义
（淘外场景使用）
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	/**
	 * 贴息禁用能力新增字段值 用于判断当前场景类型
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级商户id（淘外场景使用）
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	/**
	 * 商家sellerId
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 门店id。直连、国内间连、国际间连都有使用。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 子业务平台类型，platformType下的子业务频道（预留字段）
	 */
	@ApiField("sub_platform_type")
	private String subPlatformType;

	/**
	 * 贴息产品化场景编码
	 */
	@ApiField("subsidy_biz_code")
	private String subsidyBizCode;

	/**
	 * 如果是合并支付，对应的所有订单总金额
	 */
	@ApiField("total_amount")
	private SubsidyMoney totalAmount;

	/**
	 * 交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAcquireMode() {
		return this.acquireMode;
	}
	public void setAcquireMode(String acquireMode) {
		this.acquireMode = acquireMode;
	}

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getGoodItemId() {
		return this.goodItemId;
	}
	public void setGoodItemId(String goodItemId) {
		this.goodItemId = goodItemId;
	}

	public List<String> getInstallNums() {
		return this.installNums;
	}
	public void setInstallNums(List<String> installNums) {
		this.installNums = installNums;
	}

	public String getInstallmentBizInfo() {
		return this.installmentBizInfo;
	}
	public void setInstallmentBizInfo(String installmentBizInfo) {
		this.installmentBizInfo = installmentBizInfo;
	}

	public String getInvestorId() {
		return this.investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public String getIpaySecmerchant() {
		return this.ipaySecmerchant;
	}
	public void setIpaySecmerchant(String ipaySecmerchant) {
		this.ipaySecmerchant = ipaySecmerchant;
	}

	public Boolean getMergePay() {
		return this.mergePay;
	}
	public void setMergePay(Boolean mergePay) {
		this.mergePay = mergePay;
	}

	public String getMshopId() {
		return this.mshopId;
	}
	public void setMshopId(String mshopId) {
		this.mshopId = mshopId;
	}

	public SubsidyMoney getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(SubsidyMoney orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOriginalMid() {
		return this.originalMid;
	}
	public void setOriginalMid(String originalMid) {
		this.originalMid = originalMid;
	}

	public String getOriginalSellerId() {
		return this.originalSellerId;
	}
	public void setOriginalSellerId(String originalSellerId) {
		this.originalSellerId = originalSellerId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSubPlatformType() {
		return this.subPlatformType;
	}
	public void setSubPlatformType(String subPlatformType) {
		this.subPlatformType = subPlatformType;
	}

	public String getSubsidyBizCode() {
		return this.subsidyBizCode;
	}
	public void setSubsidyBizCode(String subsidyBizCode) {
		this.subsidyBizCode = subsidyBizCode;
	}

	public SubsidyMoney getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(SubsidyMoney totalAmount) {
		this.totalAmount = totalAmount;
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
