package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户赛事信息同步
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:30:30
 */
public class AlipayCommerceSportsOnlinegameUsergameSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2443992537132645337L;

	/**
	 * 用户参赛的场次组别ID
	 */
	@ApiField("game_event_id")
	private String gameEventId;

	/**
	 * 文体侧赛事业务号
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 用户参加比赛完成时间
	 */
	@ApiField("gmt_complete")
	private Date gmtComplete;

	/**
	 * 用户参加比赛开始时间
	 */
	@ApiField("gmt_join")
	private Date gmtJoin;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户参赛的服务商场次组别ID
	 */
	@ApiField("out_game_event_no")
	private String outGameEventNo;

	/**
	 * 外部赛事业务号
	 */
	@ApiField("out_game_no")
	private String outGameNo;

	/**
	 * 用户报名赛事业务号
	 */
	@ApiField("out_user_game_no")
	private String outUserGameNo;

	/**
	 * JOIN("JOIN", "已参加"),
COMPLETED("COMPLETED", "已完成"),
STOPPED("STOPPED", "未完成"),
	 */
	@ApiField("status")
	private String status;

	/**
	 * 文体侧用户赛事信息业务号
	 */
	@ApiField("user_game_id")
	private String userGameId;

	/**
	 * 用户参赛号码牌
	 */
	@ApiField("user_game_plate")
	private String userGamePlate;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 个人赛
	 */
	@ApiField("user_join_type")
	private String userJoinType;

	/**
	 * 用户昵称(可空 为空默认取支付宝用户昵称)
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户参赛详情支付宝小程序跳转地址
	 */
	@ApiField("user_online_detail_url")
	private String userOnlineDetailUrl;

	public String getGameEventId() {
		return this.gameEventId;
	}
	public void setGameEventId(String gameEventId) {
		this.gameEventId = gameEventId;
	}

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Date getGmtComplete() {
		return this.gmtComplete;
	}
	public void setGmtComplete(Date gmtComplete) {
		this.gmtComplete = gmtComplete;
	}

	public Date getGmtJoin() {
		return this.gmtJoin;
	}
	public void setGmtJoin(Date gmtJoin) {
		this.gmtJoin = gmtJoin;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutGameEventNo() {
		return this.outGameEventNo;
	}
	public void setOutGameEventNo(String outGameEventNo) {
		this.outGameEventNo = outGameEventNo;
	}

	public String getOutGameNo() {
		return this.outGameNo;
	}
	public void setOutGameNo(String outGameNo) {
		this.outGameNo = outGameNo;
	}

	public String getOutUserGameNo() {
		return this.outUserGameNo;
	}
	public void setOutUserGameNo(String outUserGameNo) {
		this.outUserGameNo = outUserGameNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserGameId() {
		return this.userGameId;
	}
	public void setUserGameId(String userGameId) {
		this.userGameId = userGameId;
	}

	public String getUserGamePlate() {
		return this.userGamePlate;
	}
	public void setUserGamePlate(String userGamePlate) {
		this.userGamePlate = userGamePlate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserJoinType() {
		return this.userJoinType;
	}
	public void setUserJoinType(String userJoinType) {
		this.userJoinType = userJoinType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOnlineDetailUrl() {
		return this.userOnlineDetailUrl;
	}
	public void setUserOnlineDetailUrl(String userOnlineDetailUrl) {
		this.userOnlineDetailUrl = userOnlineDetailUrl;
	}

}
