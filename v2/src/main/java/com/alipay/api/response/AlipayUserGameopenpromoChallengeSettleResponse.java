package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GameChallengePrizeVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gameopenpromo.challenge.settle response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-02 09:41:54
 */
public class AlipayUserGameopenpromoChallengeSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 2889813695689361977L;

	/** 
	 * 结算的奖品信息,和副本查询接口的奖品保持一致
	 */
	@ApiField("settle_prize_info")
	private GameChallengePrizeVO settlePrizeInfo;

	/** 
	 * 本次结算的当前状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	public void setSettlePrizeInfo(GameChallengePrizeVO settlePrizeInfo) {
		this.settlePrizeInfo = settlePrizeInfo;
	}
	public GameChallengePrizeVO getSettlePrizeInfo( ) {
		return this.settlePrizeInfo;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}
	public String getSettleStatus( ) {
		return this.settleStatus;
	}

}
