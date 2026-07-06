package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:37
 */
public class RecycleOrderBenefitVO extends AlipayObject {

	private static final long serialVersionUID = 8531881217813125556L;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益发放节点
	 */
	@ApiField("benefit_node")
	private String benefitNode;

	/**
	 * 权益数量
	 */
	@ApiField("benefit_num")
	private String benefitNum;

	/**
	 * 权益状态
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/**
	 * 权益子类型
	 */
	@ApiField("benefit_sub_type")
	private String benefitSubType;

	/**
	 * 权益类型
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 单位类型
	 */
	@ApiField("unit_type")
	private String unitType;

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitNode() {
		return this.benefitNode;
	}
	public void setBenefitNode(String benefitNode) {
		this.benefitNode = benefitNode;
	}

	public String getBenefitNum() {
		return this.benefitNum;
	}
	public void setBenefitNum(String benefitNum) {
		this.benefitNum = benefitNum;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

	public String getBenefitSubType() {
		return this.benefitSubType;
	}
	public void setBenefitSubType(String benefitSubType) {
		this.benefitSubType = benefitSubType;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getUnitType() {
		return this.unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
