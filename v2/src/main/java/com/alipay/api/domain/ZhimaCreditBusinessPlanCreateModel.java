package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻商业信用履约计划创建
 *
 * @author auto create
 * @since 1.0, 2024-10-24 20:56:52
 */
public class ZhimaCreditBusinessPlanCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4111776382585914128L;

	/**
	 * 商户订单号。 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 计划信息
	 */
	@ApiField("plan_info")
	private CreditPerformancePlanInfoOpen planInfo;

	/**
	 * 履约计划模式
	 */
	@ApiField("plan_mode")
	private String planMode;

	/**
	 * 履约计划子模式
	 */
	@ApiField("plan_sub_mode")
	private String planSubMode;

	/**
	 * 日、周、月、季分期模式时间传输需要按照对应的时间间隔传输。
	 */
	@ApiField("plan_type")
	private String planType;

	/**
	 * 产品标识，按枚举填入。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 芝麻信用服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public CreditPerformancePlanInfoOpen getPlanInfo() {
		return this.planInfo;
	}
	public void setPlanInfo(CreditPerformancePlanInfoOpen planInfo) {
		this.planInfo = planInfo;
	}

	public String getPlanMode() {
		return this.planMode;
	}
	public void setPlanMode(String planMode) {
		this.planMode = planMode;
	}

	public String getPlanSubMode() {
		return this.planSubMode;
	}
	public void setPlanSubMode(String planSubMode) {
		this.planSubMode = planSubMode;
	}

	public String getPlanType() {
		return this.planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
