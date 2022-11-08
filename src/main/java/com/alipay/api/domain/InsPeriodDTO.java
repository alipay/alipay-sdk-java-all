package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁保险开放平台保障期限模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:36:28
 */
public class InsPeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 6555599597986498292L;

	/**
	 * 选项标签
	 */
	@ApiField("option_tag")
	private String optionTag;

	/**
	 * 期限数值
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 是否推荐
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 期限单位：SECOND,MINUTE,HOUR,DAY,MONTH,YEAR
	 */
	@ApiField("unit")
	private String unit;

	public String getOptionTag() {
		return this.optionTag;
	}
	public void setOptionTag(String optionTag) {
		this.optionTag = optionTag;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
