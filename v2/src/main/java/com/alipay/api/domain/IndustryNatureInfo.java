package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业行业性质信息
 *
 * @author auto create
 * @since 1.0, 2026-09-30 13:49:30
 */
public class IndustryNatureInfo extends AlipayObject {

	private static final long serialVersionUID = 8759483197917653136L;

	/**
	 * 行业性质有效期结束时间（为空表示永久有效）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 行业性质
	 */
	@ApiField("industry_nature")
	private String industryNature;

	/**
	 * 行业性质有效期开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIndustryNature() {
		return this.industryNature;
	}
	public void setIndustryNature(String industryNature) {
		this.industryNature = industryNature;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
