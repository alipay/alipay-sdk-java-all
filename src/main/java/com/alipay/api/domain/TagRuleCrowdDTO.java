package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签圈人人群基本信息
 *
 * @author auto create
 * @since 1.0, 2022-05-26 09:36:53
 */
public class TagRuleCrowdDTO extends AlipayObject {

	private static final long serialVersionUID = 2287436449825669953L;

	/**
	 * 人群名称+不唯一
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群场景Code+唯一
	 */
	@ApiField("crowd_scene")
	private String crowdScene;

	/**
	 * 是否需要导出沟通+不唯一
	 */
	@ApiField("export_to_gotone")
	private Boolean exportToGotone;

	/**
	 * 人群有效期+不唯一
	 */
	@ApiField("gmt_expired_time")
	private String gmtExpiredTime;

	/**
	 * 标签组规则+不唯一
	 */
	@ApiListField("rules")
	@ApiField("tag_rule_group_d_t_o")
	private List<TagRuleGroupDTO> rules;

	/**
	 * 人群导出调度时间+不唯一
	 */
	@ApiField("schedule_time")
	private String scheduleTime;

	/**
	 * 人群导出调度方式+不唯一
	 */
	@ApiField("schedule_type")
	private String scheduleType;

	/**
	 * 人群来源+不唯一
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getCrowdScene() {
		return this.crowdScene;
	}
	public void setCrowdScene(String crowdScene) {
		this.crowdScene = crowdScene;
	}

	public Boolean getExportToGotone() {
		return this.exportToGotone;
	}
	public void setExportToGotone(Boolean exportToGotone) {
		this.exportToGotone = exportToGotone;
	}

	public String getGmtExpiredTime() {
		return this.gmtExpiredTime;
	}
	public void setGmtExpiredTime(String gmtExpiredTime) {
		this.gmtExpiredTime = gmtExpiredTime;
	}

	public List<TagRuleGroupDTO> getRules() {
		return this.rules;
	}
	public void setRules(List<TagRuleGroupDTO> rules) {
		this.rules = rules;
	}

	public String getScheduleTime() {
		return this.scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
