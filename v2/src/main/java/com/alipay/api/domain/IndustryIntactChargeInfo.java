package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业完整收费信息

 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryIntactChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 5187219745451511934L;

	/**
	 * 实际收费金额，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 收费类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 收费时间,时间精确到秒
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 是否退费
	 */
	@ApiField("is_refund")
	private String isRefund;

	/**
	 * 外部请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 应收费金额，单位元
	 */
	@ApiField("plan_amount")
	private String planAmount;

	/**
	 * 收费产品
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 收费唯一id
	 */
	@ApiField("service_target")
	private String serviceTarget;

	/**
	 * 收费类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 收费目标账号
	 */
	@ApiField("target_account_no")
	private String targetAccountNo;

	/**
	 * 收费目标uid
	 */
	@ApiField("target_user_id")
	private String targetUserId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getIsRefund() {
		return this.isRefund;
	}
	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlanAmount() {
		return this.planAmount;
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getServiceTarget() {
		return this.serviceTarget;
	}
	public void setServiceTarget(String serviceTarget) {
		this.serviceTarget = serviceTarget;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetAccountNo() {
		return this.targetAccountNo;
	}
	public void setTargetAccountNo(String targetAccountNo) {
		this.targetAccountNo = targetAccountNo;
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}
	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

}
