package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收推广商品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-11 19:55:50
 */
public class MarketingProductInfo extends AlipayObject {

	private static final long serialVersionUID = 7119238644977498483L;

	/**
	 * 预估金额（固定值）单位为元
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 预估最大金额（区间值）单位为元，与assess_amount互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最大金额（如衣物统收预估估价为区间2.5元-5元）。
	 */
	@ApiField("assess_max_amount")
	private String assessMaxAmount;

	/**
	 * 预估最大数量（区间值）单位为个、KG或G。与assess_quantity互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最大数量（如衣物统收预估重量为区间5KG-10KG）。
	 */
	@ApiField("assess_max_quantity")
	private String assessMaxQuantity;

	/**
	 * 预估最小金额（区间值）单位为元，与assess_amount互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最小金额（如衣物统收预估估价为区间2.5元-5元）。
	 */
	@ApiField("assess_min_amount")
	private String assessMinAmount;

	/**
	 * 预估最小数量（区间值）单位为个、KG或G，与assess_quantity互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最小数量（如衣物统收预估重量为区间5KG-10KG）。
	 */
	@ApiField("assess_min_quantity")
	private String assessMinQuantity;

	/**
	 * 预估数量（固定值）单位为个、KG或G，支持两位小数点。
	 */
	@ApiField("assess_quantity")
	private String assessQuantity;

	/**
	 * 回收商品估价类型
	 */
	@ApiField("assess_type")
	private String assessType;

	/**
	 * 质检金额（单位为元）
	 */
	@ApiField("inspect_amount")
	private String inspectAmount;

	/**
	 * 质检数量,回收商完成商品质检后的数量。单位为个、KG或G。
	 */
	@ApiField("inspect_quantity")
	private String inspectQuantity;

	/**
	 * 回收商品单位
	 */
	@ApiField("unit_type")
	private String unitType;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getAssessMaxAmount() {
		return this.assessMaxAmount;
	}
	public void setAssessMaxAmount(String assessMaxAmount) {
		this.assessMaxAmount = assessMaxAmount;
	}

	public String getAssessMaxQuantity() {
		return this.assessMaxQuantity;
	}
	public void setAssessMaxQuantity(String assessMaxQuantity) {
		this.assessMaxQuantity = assessMaxQuantity;
	}

	public String getAssessMinAmount() {
		return this.assessMinAmount;
	}
	public void setAssessMinAmount(String assessMinAmount) {
		this.assessMinAmount = assessMinAmount;
	}

	public String getAssessMinQuantity() {
		return this.assessMinQuantity;
	}
	public void setAssessMinQuantity(String assessMinQuantity) {
		this.assessMinQuantity = assessMinQuantity;
	}

	public String getAssessQuantity() {
		return this.assessQuantity;
	}
	public void setAssessQuantity(String assessQuantity) {
		this.assessQuantity = assessQuantity;
	}

	public String getAssessType() {
		return this.assessType;
	}
	public void setAssessType(String assessType) {
		this.assessType = assessType;
	}

	public String getInspectAmount() {
		return this.inspectAmount;
	}
	public void setInspectAmount(String inspectAmount) {
		this.inspectAmount = inspectAmount;
	}

	public String getInspectQuantity() {
		return this.inspectQuantity;
	}
	public void setInspectQuantity(String inspectQuantity) {
		this.inspectQuantity = inspectQuantity;
	}

	public String getUnitType() {
		return this.unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
