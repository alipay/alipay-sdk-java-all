package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单条国标参考数据项
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:23:47
 */
public class ReferenceDataItem extends AlipayObject {

	private static final long serialVersionUID = 8847312228424536548L;

	/**
	 * 年龄段: 1=0-7岁, 2=7-18岁
	 */
	@ApiField("age_group")
	private Long ageGroup;

	/**
	 * 性别: 1=男, 2=女
	 */
	@ApiField("gender")
	private Long gender;

	/**
	 * 参考数据JSON
	 */
	@ApiField("reference_data")
	private String referenceData;

	/**
	 * 数值类型: PERCENTILE, THRESHOLD
	 */
	@ApiField("value_type")
	private String valueType;

	public Long getAgeGroup() {
		return this.ageGroup;
	}
	public void setAgeGroup(Long ageGroup) {
		this.ageGroup = ageGroup;
	}

	public Long getGender() {
		return this.gender;
	}
	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getReferenceData() {
		return this.referenceData;
	}
	public void setReferenceData(String referenceData) {
		this.referenceData = referenceData;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
