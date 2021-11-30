package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益详情
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class BenefitDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2657981636212759419L;

	/**
	 * 权益金额信息
	 */
	@ApiField("benefit_amount_info")
	private BenefitAmountInfo benefitAmountInfo;

	/**
	 * 权益日期信息
	 */
	@ApiField("benefit_date_info")
	private BenefitDateInfo benefitDateInfo;

	/**
	 * 权益展示信息
	 */
	@ApiField("benefit_display_info")
	private BenefitDisplayInfo benefitDisplayInfo;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 之前权益申领的操作id
	 */
	@ApiField("benefit_operation_id")
	private String benefitOperationId;

	/**
	 * 操作时间
	 */
	@ApiField("benefit_operation_time")
	private Date benefitOperationTime;

	/**
	 * 权益发放来源
	 */
	@ApiField("benefit_source")
	private BenefitSource benefitSource;

	/**
	 * 权益状态
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/**
	 * 权益类型
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 用户id
	 */
	@ApiField("customer_id")
	private String customerId;

	public BenefitAmountInfo getBenefitAmountInfo() {
		return this.benefitAmountInfo;
	}
	public void setBenefitAmountInfo(BenefitAmountInfo benefitAmountInfo) {
		this.benefitAmountInfo = benefitAmountInfo;
	}

	public BenefitDateInfo getBenefitDateInfo() {
		return this.benefitDateInfo;
	}
	public void setBenefitDateInfo(BenefitDateInfo benefitDateInfo) {
		this.benefitDateInfo = benefitDateInfo;
	}

	public BenefitDisplayInfo getBenefitDisplayInfo() {
		return this.benefitDisplayInfo;
	}
	public void setBenefitDisplayInfo(BenefitDisplayInfo benefitDisplayInfo) {
		this.benefitDisplayInfo = benefitDisplayInfo;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitOperationId() {
		return this.benefitOperationId;
	}
	public void setBenefitOperationId(String benefitOperationId) {
		this.benefitOperationId = benefitOperationId;
	}

	public Date getBenefitOperationTime() {
		return this.benefitOperationTime;
	}
	public void setBenefitOperationTime(Date benefitOperationTime) {
		this.benefitOperationTime = benefitOperationTime;
	}

	public BenefitSource getBenefitSource() {
		return this.benefitSource;
	}
	public void setBenefitSource(BenefitSource benefitSource) {
		this.benefitSource = benefitSource;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
