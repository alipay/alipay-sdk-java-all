package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 空间商业智能可选行业信息表
 *
 * @author auto create
 * @since 1.0, 2023-07-14 17:10:46
 */
public class ShopIndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 2138215467553927829L;

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
