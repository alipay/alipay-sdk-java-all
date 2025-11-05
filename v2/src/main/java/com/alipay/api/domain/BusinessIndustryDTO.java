package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业筛选条件
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class BusinessIndustryDTO extends AlipayObject {

	private static final long serialVersionUID = 3423547926242472818L;

	/**
	 * 一级行业
	 */
	@ApiField("first_industry")
	private String firstIndustry;

	/**
	 * 二级行业
	 */
	@ApiField("second_industry")
	private String secondIndustry;

	/**
	 * 三级行业
	 */
	@ApiField("third_industry")
	private String thirdIndustry;

	public String getFirstIndustry() {
		return this.firstIndustry;
	}
	public void setFirstIndustry(String firstIndustry) {
		this.firstIndustry = firstIndustry;
	}

	public String getSecondIndustry() {
		return this.secondIndustry;
	}
	public void setSecondIndustry(String secondIndustry) {
		this.secondIndustry = secondIndustry;
	}

	public String getThirdIndustry() {
		return this.thirdIndustry;
	}
	public void setThirdIndustry(String thirdIndustry) {
		this.thirdIndustry = thirdIndustry;
	}

}
