package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户参赛上报跑步数据信息
 *
 * @author auto create
 * @since 1.0, 2022-12-20 10:08:05
 */
public class UserOnlineGameDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4139174643752814277L;

	/**
	 * 运动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用户外部参赛业务号
	 */
	@ApiField("out_user_game_no")
	private String outUserGameNo;

	/**
	 * 运动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 消耗的卡路里(卡 保留五位小数)
	 */
	@ApiField("user_data_calory")
	private String userDataCalory;

	/**
	 * 消耗的时间
	 */
	@ApiField("user_data_seconds")
	private Long userDataSeconds;

	/**
	 * 配速(保留五位小数)
	 */
	@ApiField("user_data_speed")
	private String userDataSpeed;

	/**
	 * 运动类型
	 */
	@ApiField("user_data_sports_type")
	private String userDataSportsType;

	/**
	 * 进度单位
	 */
	@ApiField("user_data_unit")
	private String userDataUnit;

	/**
	 * 用户完成进度值(保留两位小数)
	 */
	@ApiField("user_data_value")
	private String userDataValue;

	/**
	 * 运动侧来源ID
	 */
	@ApiField("user_game_data_id")
	private String userGameDataId;

	/**
	 * 文体侧用户参赛业务号
	 */
	@ApiField("user_game_id")
	private String userGameId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOutUserGameNo() {
		return this.outUserGameNo;
	}
	public void setOutUserGameNo(String outUserGameNo) {
		this.outUserGameNo = outUserGameNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserDataCalory() {
		return this.userDataCalory;
	}
	public void setUserDataCalory(String userDataCalory) {
		this.userDataCalory = userDataCalory;
	}

	public Long getUserDataSeconds() {
		return this.userDataSeconds;
	}
	public void setUserDataSeconds(Long userDataSeconds) {
		this.userDataSeconds = userDataSeconds;
	}

	public String getUserDataSpeed() {
		return this.userDataSpeed;
	}
	public void setUserDataSpeed(String userDataSpeed) {
		this.userDataSpeed = userDataSpeed;
	}

	public String getUserDataSportsType() {
		return this.userDataSportsType;
	}
	public void setUserDataSportsType(String userDataSportsType) {
		this.userDataSportsType = userDataSportsType;
	}

	public String getUserDataUnit() {
		return this.userDataUnit;
	}
	public void setUserDataUnit(String userDataUnit) {
		this.userDataUnit = userDataUnit;
	}

	public String getUserDataValue() {
		return this.userDataValue;
	}
	public void setUserDataValue(String userDataValue) {
		this.userDataValue = userDataValue;
	}

	public String getUserGameDataId() {
		return this.userGameDataId;
	}
	public void setUserGameDataId(String userGameDataId) {
		this.userGameDataId = userGameDataId;
	}

	public String getUserGameId() {
		return this.userGameId;
	}
	public void setUserGameId(String userGameId) {
		this.userGameId = userGameId;
	}

}
