package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建签到规则
 *
 * @author auto create
 * @since 1.0, 2025-04-29 14:17:19
 */
public class AlipayCommerceEducateCheckinRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2263413531934551467L;

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
