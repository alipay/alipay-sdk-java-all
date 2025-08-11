package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 助威足球小游戏结果确认
 *
 * @author auto create
 * @since 1.0, 2021-05-14 13:40:16
 */
public class AlipayCommerceSportsCheerResultConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5536714781691286614L;

	/**
	 * 用户助威记录流水号
	 */
	@ApiField("game_serial_number")
	private String gameSerialNumber;

	/**
	 * 用户是否助威游戏胜利
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/**
	 * 游戏中另一支队伍得分
	 */
	@ApiField("other_team_score")
	private Long otherTeamScore;

	/**
	 * 用户所支持队伍得分
	 */
	@ApiField("user_team_score")
	private Long userTeamScore;

	public String getGameSerialNumber() {
		return this.gameSerialNumber;
	}
	public void setGameSerialNumber(String gameSerialNumber) {
		this.gameSerialNumber = gameSerialNumber;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Long getOtherTeamScore() {
		return this.otherTeamScore;
	}
	public void setOtherTeamScore(Long otherTeamScore) {
		this.otherTeamScore = otherTeamScore;
	}

	public Long getUserTeamScore() {
		return this.userTeamScore;
	}
	public void setUserTeamScore(Long userTeamScore) {
		this.userTeamScore = userTeamScore;
	}

}
