package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建签到规则
 *
 * @author auto create
 * @since 1.0, 2025-08-29 19:42:17
 */
public class AlipayCommerceEducateCheckinRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7664766568746199842L;

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
	 * 课程签到类型相关参数，签退结束分钟
	 */
	@ApiField("check_out_end_minutes")
	private Long checkOutEndMinutes;

	/**
	 * 课程签到类型相关参数，签退结束类型
	 */
	@ApiField("check_out_end_type")
	private String checkOutEndType;

	/**
	 * 课程签到类型相关参数，签退开始分钟
	 */
	@ApiField("check_out_start_minutes")
	private Long checkOutStartMinutes;

	/**
	 * 课程签到类型相关参数，签退开始类型
	 */
	@ApiField("check_out_start_type")
	private String checkOutStartType;

	/**
	 * 寝室签到规则扩展
	 */
	@ApiField("dormitory_config")
	private DormitoryConfig dormitoryConfig;

	/**
	 * 课程签到类型相关参数，是否开始签到开关，兜底为OFF
	 */
	@ApiField("enable_check_in")
	private String enableCheckIn;

	/**
	 * 课程签到类型相关参数，是否开启签退开关，兜底为OFF
	 */
	@ApiField("enable_check_out")
	private String enableCheckOut;

	/**
	 * 规则生效状态
	 */
	@ApiField("enable_status")
	private Boolean enableStatus;

	/**
	 * 结束时间，用于标识签到结束类型的时间，单位分钟
	 */
	@ApiField("end_minutes")
	private Long endMinutes;

	/**
	 * 签到结束时间，格式：HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 签到结束类型
	 */
	@ApiField("end_type")
	private String endType;

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
	 * 关联的位置id列表，用于签到时匹配到的签到规则的位置校验
	 */
	@ApiListField("place_id_list")
	@ApiField("string")
	private List<String> placeIdList;

	/**
	 * 签到半径，单位：米。用户签到时所在位置和签到地点经纬度的直线距离。
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 签到规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 签到规则类型，不传默认为寝室签到
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 开始时间，用于标识签到开始类型的时间，单位分钟
	 */
	@ApiField("start_minutes")
	private Long startMinutes;

	/**
	 * 签到开始时间，格式：HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 签到开始类型
	 */
	@ApiField("start_type")
	private String startType;

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

	public Long getCheckOutEndMinutes() {
		return this.checkOutEndMinutes;
	}
	public void setCheckOutEndMinutes(Long checkOutEndMinutes) {
		this.checkOutEndMinutes = checkOutEndMinutes;
	}

	public String getCheckOutEndType() {
		return this.checkOutEndType;
	}
	public void setCheckOutEndType(String checkOutEndType) {
		this.checkOutEndType = checkOutEndType;
	}

	public Long getCheckOutStartMinutes() {
		return this.checkOutStartMinutes;
	}
	public void setCheckOutStartMinutes(Long checkOutStartMinutes) {
		this.checkOutStartMinutes = checkOutStartMinutes;
	}

	public String getCheckOutStartType() {
		return this.checkOutStartType;
	}
	public void setCheckOutStartType(String checkOutStartType) {
		this.checkOutStartType = checkOutStartType;
	}

	public DormitoryConfig getDormitoryConfig() {
		return this.dormitoryConfig;
	}
	public void setDormitoryConfig(DormitoryConfig dormitoryConfig) {
		this.dormitoryConfig = dormitoryConfig;
	}

	public String getEnableCheckIn() {
		return this.enableCheckIn;
	}
	public void setEnableCheckIn(String enableCheckIn) {
		this.enableCheckIn = enableCheckIn;
	}

	public String getEnableCheckOut() {
		return this.enableCheckOut;
	}
	public void setEnableCheckOut(String enableCheckOut) {
		this.enableCheckOut = enableCheckOut;
	}

	public Boolean getEnableStatus() {
		return this.enableStatus;
	}
	public void setEnableStatus(Boolean enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Long getEndMinutes() {
		return this.endMinutes;
	}
	public void setEndMinutes(Long endMinutes) {
		this.endMinutes = endMinutes;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndType() {
		return this.endType;
	}
	public void setEndType(String endType) {
		this.endType = endType;
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

	public List<String> getPlaceIdList() {
		return this.placeIdList;
	}
	public void setPlaceIdList(List<String> placeIdList) {
		this.placeIdList = placeIdList;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
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

	public Long getStartMinutes() {
		return this.startMinutes;
	}
	public void setStartMinutes(Long startMinutes) {
		this.startMinutes = startMinutes;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartType() {
		return this.startType;
	}
	public void setStartType(String startType) {
		this.startType = startType;
	}

	public List<Long> getWeekDayList() {
		return this.weekDayList;
	}
	public void setWeekDayList(List<Long> weekDayList) {
		this.weekDayList = weekDayList;
	}

}
