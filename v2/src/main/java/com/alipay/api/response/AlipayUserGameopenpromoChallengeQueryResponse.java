package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GameChallengePrizeVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gameopenpromo.challenge.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-02 09:41:54
 */
public class AlipayUserGameopenpromoChallengeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2359391582796147216L;

	/** 
	 * 副本奖励列表, 用户所有能获得的奖励都在列表中
	 */
	@ApiListField("challenge_prize_list")
	@ApiField("game_challenge_prize_v_o")
	private List<GameChallengePrizeVO> challengePrizeList;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 参与副本活动需要消耗的福卡数量，可以直接对用户进行表达
	 */
	@ApiField("fuka_cost")
	private Long fukaCost;

	/** 
	 * 用户福卡是否充足
	 */
	@ApiField("fuka_enough")
	private Boolean fukaEnough;

	/** 
	 * 使用该字段判断副本活动是否对用户可见，true表示可见
	 */
	@ApiField("join_authority")
	private Boolean joinAuthority;

	/** 
	 * 用户最大参与次数，可用于对用户表达
	 */
	@ApiField("join_max_limit")
	private Long joinMaxLimit;

	/** 
	 * 用户已经参与的活动次数(已结算口径统计)，可以用来对客表达
	 */
	@ApiField("join_times")
	private Long joinTimes;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public void setChallengePrizeList(List<GameChallengePrizeVO> challengePrizeList) {
		this.challengePrizeList = challengePrizeList;
	}
	public List<GameChallengePrizeVO> getChallengePrizeList( ) {
		return this.challengePrizeList;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setFukaCost(Long fukaCost) {
		this.fukaCost = fukaCost;
	}
	public Long getFukaCost( ) {
		return this.fukaCost;
	}

	public void setFukaEnough(Boolean fukaEnough) {
		this.fukaEnough = fukaEnough;
	}
	public Boolean getFukaEnough( ) {
		return this.fukaEnough;
	}

	public void setJoinAuthority(Boolean joinAuthority) {
		this.joinAuthority = joinAuthority;
	}
	public Boolean getJoinAuthority( ) {
		return this.joinAuthority;
	}

	public void setJoinMaxLimit(Long joinMaxLimit) {
		this.joinMaxLimit = joinMaxLimit;
	}
	public Long getJoinMaxLimit( ) {
		return this.joinMaxLimit;
	}

	public void setJoinTimes(Long joinTimes) {
		this.joinTimes = joinTimes;
	}
	public Long getJoinTimes( ) {
		return this.joinTimes;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

}
