package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户赛事信息同步
 *
 * @author auto create
 * @since 1.0, 2023-03-03 13:57:33
 */
public class AlipayCommerceSportsOnlinegameUsergameSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5618555881414269557L;

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
	 * 已参加
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

}
