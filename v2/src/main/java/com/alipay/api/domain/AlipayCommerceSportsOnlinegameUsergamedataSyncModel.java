package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户数据上报信息同步
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:28:08
 */
public class AlipayCommerceSportsOnlinegameUsergamedataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6327779372283482665L;

	/**
	 * 运动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 三方用户赛事业务号
	 */
	@ApiField("out_user_game_no")
	private String outUserGameNo;

	/**
	 * 运动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 文体侧用户赛事业务号
	 */
	@ApiField("user_game_id")
	private String userGameId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUserGameId() {
		return this.userGameId;
	}
	public void setUserGameId(String userGameId) {
		this.userGameId = userGameId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
