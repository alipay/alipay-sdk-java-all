package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品编辑
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:50:19
 */
public class AlipayMerchantSolcreditserviceprodProductCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 8593358126886675919L;

	/**
	 * 纯免押: DEPOSIT_FREE;
固定租金: FIXED_RENT;
动态租金: DYNAMIC_RENT;
周期付: PERIOD_PAY
	 */
	@ApiField("credit_service_type")
	private String creditServiceType;

	/**
	 * 商品对应押金金额，免押金额
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 商品详情描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 动态租金必填
	 */
	@ApiField("dynamic_rent_billing_rule")
	private DynamicRentBillingRuleDTO dynamicRentBillingRule;

	/**
	 * 固定租金必填
	 */
	@ApiField("fixed_rent_billing_rule")
	private FixedRentBillingRuleDTO fixedRentBillingRule;

	/**
	 * 商家自定义的编号
	 */
	@ApiField("out_product_no")
	private String outProductNo;

	/**
	 * 周期付租金必填
	 */
	@ApiField("period_pay_billing_rule")
	private PeriodPayBillingRuleDTO periodPayBillingRule;

	/**
	 * 非纯免押场景必填
	 */
	@ApiField("post_payment_name")
	private String postPaymentName;

	/**
	 * 需要使用通用图片上传接口返回的链接
	 */
	@ApiField("product_cover_pic_url")
	private String productCoverPicUrl;

	/**
	 * 商家自定义
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 修改必填，不填为新增
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 使用规则
	 */
	@ApiField("purchase_note")
	private String purchaseNote;

	/**
	 * 风控类目code
	 */
	@ApiField("scene_category_code")
	private String sceneCategoryCode;

	/**
	 * 直付通进件得到的ID
	 */
	@ApiField("smid")
	private String smid;

	public String getCreditServiceType() {
		return this.creditServiceType;
	}
	public void setCreditServiceType(String creditServiceType) {
		this.creditServiceType = creditServiceType;
	}

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public DynamicRentBillingRuleDTO getDynamicRentBillingRule() {
		return this.dynamicRentBillingRule;
	}
	public void setDynamicRentBillingRule(DynamicRentBillingRuleDTO dynamicRentBillingRule) {
		this.dynamicRentBillingRule = dynamicRentBillingRule;
	}

	public FixedRentBillingRuleDTO getFixedRentBillingRule() {
		return this.fixedRentBillingRule;
	}
	public void setFixedRentBillingRule(FixedRentBillingRuleDTO fixedRentBillingRule) {
		this.fixedRentBillingRule = fixedRentBillingRule;
	}

	public String getOutProductNo() {
		return this.outProductNo;
	}
	public void setOutProductNo(String outProductNo) {
		this.outProductNo = outProductNo;
	}

	public PeriodPayBillingRuleDTO getPeriodPayBillingRule() {
		return this.periodPayBillingRule;
	}
	public void setPeriodPayBillingRule(PeriodPayBillingRuleDTO periodPayBillingRule) {
		this.periodPayBillingRule = periodPayBillingRule;
	}

	public String getPostPaymentName() {
		return this.postPaymentName;
	}
	public void setPostPaymentName(String postPaymentName) {
		this.postPaymentName = postPaymentName;
	}

	public String getProductCoverPicUrl() {
		return this.productCoverPicUrl;
	}
	public void setProductCoverPicUrl(String productCoverPicUrl) {
		this.productCoverPicUrl = productCoverPicUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getPurchaseNote() {
		return this.purchaseNote;
	}
	public void setPurchaseNote(String purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	public String getSceneCategoryCode() {
		return this.sceneCategoryCode;
	}
	public void setSceneCategoryCode(String sceneCategoryCode) {
		this.sceneCategoryCode = sceneCategoryCode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
