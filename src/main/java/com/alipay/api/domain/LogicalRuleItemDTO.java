package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逻辑取值规则DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-19 15:14:10
 */
public class LogicalRuleItemDTO extends AlipayObject {

	private static final long serialVersionUID = 2726392399393887633L;

	/**
	 * 人群名称+不唯一
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群Key+唯一
	 */
	@ApiField("ext_crowd_key")
	private String extCrowdKey;

	/**
	 * 人群有效期+不唯一
	 */
	@ApiField("gmt_expired_time")
	private String gmtExpiredTime;

	/**
	 * 人群导出调度方式+不唯一
	 */
	@ApiField("schedule_type")
	private String scheduleType;

	/**
	 * 逻辑规则方式+不唯一
	 */
	@ApiField("type")
	private String type;

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getExtCrowdKey() {
		return this.extCrowdKey;
	}
	public void setExtCrowdKey(String extCrowdKey) {
		this.extCrowdKey = extCrowdKey;
	}

	public String getGmtExpiredTime() {
		return this.gmtExpiredTime;
	}
	public void setGmtExpiredTime(String gmtExpiredTime) {
		this.gmtExpiredTime = gmtExpiredTime;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
