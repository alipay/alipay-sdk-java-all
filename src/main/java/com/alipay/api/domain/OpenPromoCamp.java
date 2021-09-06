package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放活动接口活动
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OpenPromoCamp extends AlipayObject {

	private static final long serialVersionUID = 6673432238562965483L;

	/**
	 * 简短活动名，默认和活动名称相同
	 */
	@ApiField("camp_alias")
	private String campAlias;

	/**
	 * 活动描述
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/**
	 * 活动结束时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/**
	 * 活动类型，现在支持DRAW_PRIZE：表示领奖活动
	 */
	@ApiField("camp_type")
	private String campType;

	public String getCampAlias() {
		return this.campAlias;
	}
	public void setCampAlias(String campAlias) {
		this.campAlias = campAlias;
	}

	public String getCampDesc() {
		return this.campDesc;
	}
	public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

	public String getCampEndTime() {
		return this.campEndTime;
	}
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getCampStartTime() {
		return this.campStartTime;
	}
	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

	public String getCampType() {
		return this.campType;
	}
	public void setCampType(String campType) {
		this.campType = campType;
	}

}
