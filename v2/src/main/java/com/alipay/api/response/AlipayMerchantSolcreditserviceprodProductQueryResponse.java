package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DynamicRentBillingRuleDTO;
import com.alipay.api.domain.FixedRentBillingRuleDTO;
import com.alipay.api.domain.PeriodPayBillingRuleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:20
 */
public class AlipayMerchantSolcreditserviceprodProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5166791646131316194L;

	/** 
	 * 纯免押: DEPOSIT_FREE;
固定租金: FIXED_RENT;动态租金: DYNAMIC_RENT;
周期付: PERIOD_PAY
	 */
	@ApiField("credit_service_type")
	private String creditServiceType;

	/** 
	 * 押金金额(单位元)，商品对应押金金额，免押金额
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
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 商家编辑商品时自定义的编号
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
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/** 
	 * 待上架: WAIT_UP;
已上架: PRODUCT_UP;已下架: PRODUCT_DOWN
	 */
	@ApiField("product_status")
	private String productStatus;

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

	public void setCreditServiceType(String creditServiceType) {
		this.creditServiceType = creditServiceType;
	}
	public String getCreditServiceType( ) {
		return this.creditServiceType;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAmount( ) {
		return this.depositAmount;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDynamicRentBillingRule(DynamicRentBillingRuleDTO dynamicRentBillingRule) {
		this.dynamicRentBillingRule = dynamicRentBillingRule;
	}
	public DynamicRentBillingRuleDTO getDynamicRentBillingRule( ) {
		return this.dynamicRentBillingRule;
	}

	public void setFixedRentBillingRule(FixedRentBillingRuleDTO fixedRentBillingRule) {
		this.fixedRentBillingRule = fixedRentBillingRule;
	}
	public FixedRentBillingRuleDTO getFixedRentBillingRule( ) {
		return this.fixedRentBillingRule;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOutProductNo(String outProductNo) {
		this.outProductNo = outProductNo;
	}
	public String getOutProductNo( ) {
		return this.outProductNo;
	}

	public void setPeriodPayBillingRule(PeriodPayBillingRuleDTO periodPayBillingRule) {
		this.periodPayBillingRule = periodPayBillingRule;
	}
	public PeriodPayBillingRuleDTO getPeriodPayBillingRule( ) {
		return this.periodPayBillingRule;
	}

	public void setPostPaymentName(String postPaymentName) {
		this.postPaymentName = postPaymentName;
	}
	public String getPostPaymentName( ) {
		return this.postPaymentName;
	}

	public void setProductCoverPicUrl(String productCoverPicUrl) {
		this.productCoverPicUrl = productCoverPicUrl;
	}
	public String getProductCoverPicUrl( ) {
		return this.productCoverPicUrl;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductNo( ) {
		return this.productNo;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductStatus( ) {
		return this.productStatus;
	}

	public void setPurchaseNote(String purchaseNote) {
		this.purchaseNote = purchaseNote;
	}
	public String getPurchaseNote( ) {
		return this.purchaseNote;
	}

	public void setSceneCategoryCode(String sceneCategoryCode) {
		this.sceneCategoryCode = sceneCategoryCode;
	}
	public String getSceneCategoryCode( ) {
		return this.sceneCategoryCode;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

}
