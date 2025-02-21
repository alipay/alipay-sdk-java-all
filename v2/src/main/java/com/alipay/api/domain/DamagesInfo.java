package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付违约金信息
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:38:54
 */
public class DamagesInfo extends AlipayObject {

	private static final long serialVersionUID = 4719415733344564536L;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 违约金的金额，单位：分
	 */
	@ApiField("damages_cash")
	private Long damagesCash;

	/**
	 * 违约金发起方式
	 */
	@ApiField("damages_issue_type")
	private String damagesIssueType;

	/**
	 * 违约金比例，单位：%，例如返回值是30，代表30%
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金的状态
	 */
	@ApiField("damages_status")
	private String damagesStatus;

	/**
	 * 违约金的类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	/**
	 * 违约金订单id，damages_status=init时没有值，需要用户确认
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 交易流水号
	 */
	@ApiField("payment_no")
	private String paymentNo;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDamagesCash() {
		return this.damagesCash;
	}
	public void setDamagesCash(Long damagesCash) {
		this.damagesCash = damagesCash;
	}

	public String getDamagesIssueType() {
		return this.damagesIssueType;
	}
	public void setDamagesIssueType(String damagesIssueType) {
		this.damagesIssueType = damagesIssueType;
	}

	public String getDamagesRate() {
		return this.damagesRate;
	}
	public void setDamagesRate(String damagesRate) {
		this.damagesRate = damagesRate;
	}

	public String getDamagesStatus() {
		return this.damagesStatus;
	}
	public void setDamagesStatus(String damagesStatus) {
		this.damagesStatus = damagesStatus;
	}

	public String getDamagesType() {
		return this.damagesType;
	}
	public void setDamagesType(String damagesType) {
		this.damagesType = damagesType;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getPaymentNo() {
		return this.paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

}
