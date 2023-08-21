package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayrightreal.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 19:06:39
 */
public class AlipayDataMdaTorchreplayrightrealQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3157643816588921759L;

	/** 
	 * 城市分布
	 */
	@ApiField("online_torch_replay_city_distribute")
	private String onlineTorchReplayCityDistribute;

	/** 
	 * 今日火炬传递总人次
	 */
	@ApiField("online_torch_replay_today_cnt")
	private Long onlineTorchReplayTodayCnt;

	/** 
	 * 今日火炬传递总人数
	 */
	@ApiField("online_torch_replay_today_user_cnt")
	private Long onlineTorchReplayTodayUserCnt;

	/** 
	 * 线上火炬传递总人次
	 */
	@ApiField("online_torch_replay_total_cnt")
	private Long onlineTorchReplayTotalCnt;

	/** 
	 * 线上火炬传递总人数
	 */
	@ApiField("online_torch_replay_total_user_cnt")
	private Long onlineTorchReplayTotalUserCnt;

	public void setOnlineTorchReplayCityDistribute(String onlineTorchReplayCityDistribute) {
		this.onlineTorchReplayCityDistribute = onlineTorchReplayCityDistribute;
	}
	public String getOnlineTorchReplayCityDistribute( ) {
		return this.onlineTorchReplayCityDistribute;
	}

	public void setOnlineTorchReplayTodayCnt(Long onlineTorchReplayTodayCnt) {
		this.onlineTorchReplayTodayCnt = onlineTorchReplayTodayCnt;
	}
	public Long getOnlineTorchReplayTodayCnt( ) {
		return this.onlineTorchReplayTodayCnt;
	}

	public void setOnlineTorchReplayTodayUserCnt(Long onlineTorchReplayTodayUserCnt) {
		this.onlineTorchReplayTodayUserCnt = onlineTorchReplayTodayUserCnt;
	}
	public Long getOnlineTorchReplayTodayUserCnt( ) {
		return this.onlineTorchReplayTodayUserCnt;
	}

	public void setOnlineTorchReplayTotalCnt(Long onlineTorchReplayTotalCnt) {
		this.onlineTorchReplayTotalCnt = onlineTorchReplayTotalCnt;
	}
	public Long getOnlineTorchReplayTotalCnt( ) {
		return this.onlineTorchReplayTotalCnt;
	}

	public void setOnlineTorchReplayTotalUserCnt(Long onlineTorchReplayTotalUserCnt) {
		this.onlineTorchReplayTotalUserCnt = onlineTorchReplayTotalUserCnt;
	}
	public Long getOnlineTorchReplayTotalUserCnt( ) {
		return this.onlineTorchReplayTotalUserCnt;
	}

}
