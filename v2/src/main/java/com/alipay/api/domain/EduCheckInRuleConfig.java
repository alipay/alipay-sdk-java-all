package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签到规则配置
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:48:55
 */
public class EduCheckInRuleConfig extends AlipayObject {

	private static final long serialVersionUID = 3516398722975395211L;

	/**
	 * 规则扩展信息
	 */
	@ApiField("course_config_ext")
	private EduCheckInRuleConfigExt courseConfigExt;

	/**
	 * 规则生效状态
	 */
	@ApiField("enable_status")
	private Boolean enableStatus;

	/**
	 * 签到结束时间，格式：HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 签到频率类型
	 */
	@ApiField("frequency_type")
	private String frequencyType;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 是否启用拍照校验
	 */
	@ApiField("picture_check")
	private Boolean pictureCheck;

	/**
	 * 是否启用位置校验
	 */
	@ApiField("place_check")
	private Boolean placeCheck;

	/**
	 * 签到半径，单位米
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 签到规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 签到规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 签到规则类型
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 签到开始时间，格式：HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 周天列表，数字1-7分别表示周一到周日。
	 */
	@ApiListField("week_day_list")
	@ApiField("number")
	private List<Long> weekDayList;

	public EduCheckInRuleConfigExt getCourseConfigExt() {
		return this.courseConfigExt;
	}
	public void setCourseConfigExt(EduCheckInRuleConfigExt courseConfigExt) {
		this.courseConfigExt = courseConfigExt;
	}

	public Boolean getEnableStatus() {
		return this.enableStatus;
	}
	public void setEnableStatus(Boolean enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Boolean getPictureCheck() {
		return this.pictureCheck;
	}
	public void setPictureCheck(Boolean pictureCheck) {
		this.pictureCheck = pictureCheck;
	}

	public Boolean getPlaceCheck() {
		return this.placeCheck;
	}
	public void setPlaceCheck(Boolean placeCheck) {
		this.placeCheck = placeCheck;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<Long> getWeekDayList() {
		return this.weekDayList;
	}
	public void setWeekDayList(List<Long> weekDayList) {
		this.weekDayList = weekDayList;
	}

}
