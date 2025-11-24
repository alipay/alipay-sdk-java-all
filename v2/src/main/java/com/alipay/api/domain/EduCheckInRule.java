package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签到规则
 *
 * @author auto create
 * @since 1.0, 2025-06-18 17:16:16
 */
public class EduCheckInRule extends AlipayObject {

	private static final long serialVersionUID = 1688332882467566424L;

	/**
	 * 活动平台id
	 */
	@ApiField("auth_activity_id")
	private String authActivityId;

	/**
	 * 签到核身认证类型
	 */
	@ApiField("authentication_type")
	private String authenticationType;

	/**
	 * 课程签到扩展参数
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
	 * 碰一下签到校验开关
	 */
	@ApiField("nfc_check")
	private Boolean nfcCheck;

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
	 * 关联的位置列表，用于签到时匹配到的签到规则的位置校验
	 */
	@ApiListField("place_list")
	@ApiField("edu_place_info")
	private List<EduPlaceInfo> placeList;

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
	 * 签到类型
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

	public String getAuthActivityId() {
		return this.authActivityId;
	}
	public void setAuthActivityId(String authActivityId) {
		this.authActivityId = authActivityId;
	}

	public String getAuthenticationType() {
		return this.authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}

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

	public Boolean getNfcCheck() {
		return this.nfcCheck;
	}
	public void setNfcCheck(Boolean nfcCheck) {
		this.nfcCheck = nfcCheck;
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

	public List<EduPlaceInfo> getPlaceList() {
		return this.placeList;
	}
	public void setPlaceList(List<EduPlaceInfo> placeList) {
		this.placeList = placeList;
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
