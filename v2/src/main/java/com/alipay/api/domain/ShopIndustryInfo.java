package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店所属行业信息
 *
 * @author auto create
 * @since 1.0, 2023-07-06 08:07:09
 */
public class ShopIndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 4743258991564981378L;

	/**
	 * 一级行业，依照场景需求获取，请联系本方业务负责人
	 */
	@ApiField("first_industry")
	private String firstIndustry;

	/**
	 * 二级行业，依照场景需求获取，请联系本方业务负责人
	 */
	@ApiField("second_industry")
	private String secondIndustry;

	/**
	 * 三级行业，依照场景需求获取，请联系本方业务负责人
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
