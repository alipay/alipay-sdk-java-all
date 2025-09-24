package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户数据上报信息同步
 *
 * @author auto create
 * @since 1.0, 2024-07-08 17:02:49
 */
public class AlipayCommerceSportsUsergameDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8615431518959431971L;

	/**
	 * 赛事id
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户赛事编号
	 */
	@ApiField("out_user_game_no")
	private String outUserGameNo;

	/**
	 * 来源ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 赛事状态  FINISH 已完赛  UN_FINISH 未完赛 UNDER_WAY 进行中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 赛事上报数据ID集合，只有完赛状态为未完赛时可空，其他场景都必填
	 */
	@ApiListField("user_game_data_id_list")
	@ApiField("string")
	private List<String> userGameDataIdList;

	/**
	 * 用户赛事ID
	 */
	@ApiField("user_game_id")
	private String userGameId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
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

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getUserGameDataIdList() {
		return this.userGameDataIdList;
	}
	public void setUserGameDataIdList(List<String> userGameDataIdList) {
		this.userGameDataIdList = userGameDataIdList;
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
