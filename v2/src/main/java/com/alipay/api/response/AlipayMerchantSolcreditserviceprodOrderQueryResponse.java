package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DynamicRentBillingRuleDTO;
import com.alipay.api.domain.FixedRentBillingRuleDTO;
import com.alipay.api.domain.PeriodPayBillingRuleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:19
 */
public class AlipayMerchantSolcreditserviceprodOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7338718561371153167L;

	/** 
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("billing_end_time")
	private Date billingEndTime;

	/** 
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("billing_start_time")
	private Date billingStartTime;

	/** 
	 * 纯免押: DEPOSIT_FREE;
固定租金: FIXED_RENT;动态租金: DYNAMIC_RENT;
周期付: PERIOD_PAY
	 */
	@ApiField("credit_service_type")
	private String creditServiceType;

	/** 
	 * 违约金额(单位元),最多支持2位小数
	 */
	@ApiField("default_amount")
	private String defaultAmount;

	/** 
	 * 押金金额(单位元)，最多支持2位小数
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

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
	 * 开单使用的小程序ID
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_end_time")
	private Date orderEndTime;

	/** 
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 初始化: INIT;待开始: WAIT_START;使用中: IN_USE;
取消: CANCEL;
完结中: ENDING;
已完结: ENDED
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商家下单时自定义编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 周期付租金必填
	 */
	@ApiField("period_pay_billing_rule")
	private PeriodPayBillingRuleDTO periodPayBillingRule;

	/** 
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/** 
	 * 直付通进件得到的ID
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("u_open_id")
	private String uOpenId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("zm_sign_time")
	private Date zmSignTime;

	public void setBillingEndTime(Date billingEndTime) {
		this.billingEndTime = billingEndTime;
	}
	public Date getBillingEndTime( ) {
		return this.billingEndTime;
	}

	public void setBillingStartTime(Date billingStartTime) {
		this.billingStartTime = billingStartTime;
	}
	public Date getBillingStartTime( ) {
		return this.billingStartTime;
	}

	public void setCreditServiceType(String creditServiceType) {
		this.creditServiceType = creditServiceType;
	}
	public String getCreditServiceType( ) {
		return this.creditServiceType;
	}

	public void setDefaultAmount(String defaultAmount) {
		this.defaultAmount = defaultAmount;
	}
	public String getDefaultAmount( ) {
		return this.defaultAmount;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAmount( ) {
		return this.depositAmount;
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

	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}
	public String getMerchantAppId( ) {
		return this.merchantAppId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderEndTime(Date orderEndTime) {
		this.orderEndTime = orderEndTime;
	}
	public Date getOrderEndTime( ) {
		return this.orderEndTime;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPeriodPayBillingRule(PeriodPayBillingRuleDTO periodPayBillingRule) {
		this.periodPayBillingRule = periodPayBillingRule;
	}
	public PeriodPayBillingRuleDTO getPeriodPayBillingRule( ) {
		return this.periodPayBillingRule;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductNo( ) {
		return this.productNo;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setuOpenId(String uOpenId) {
		this.uOpenId = uOpenId;
	}
	public String getuOpenId( ) {
		return this.uOpenId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setZmSignTime(Date zmSignTime) {
		this.zmSignTime = zmSignTime;
	}
	public Date getZmSignTime( ) {
		return this.zmSignTime;
	}

}
