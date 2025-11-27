package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayrightstat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:46
 */
public class AlipayDataMdaTorchreplayrightstatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516368314838573191L;

	/** 
	 * 今日线下火炬传递城市数
	 */
	@ApiField("offline_torch_replay_city_today_cnt")
	private Long offlineTorchReplayCityTodayCnt;

	/** 
	 * 线下火炬传递城市总数
	 */
	@ApiField("offline_torch_replay_city_total_cnt")
	private Long offlineTorchReplayCityTotalCnt;

	/** 
	 * 今日线下火炬传递人数
	 */
	@ApiField("offline_torch_replay_today_cnt")
	private Long offlineTorchReplayTodayCnt;

	/** 
	 * 线下火炬传递总人数
	 */
	@ApiField("offline_torch_replay_total_cnt")
	private Long offlineTorchReplayTotalCnt;

	/** 
	 * 线下传递人群画像
	 */
	@ApiField("offline_torchbearer_portrait")
	private String offlineTorchbearerPortrait;

	/** 
	 * 今日线下传递手榜单
	 */
	@ApiField("offline_torchbearer_today_list")
	private String offlineTorchbearerTodayList;

	public void setOfflineTorchReplayCityTodayCnt(Long offlineTorchReplayCityTodayCnt) {
		this.offlineTorchReplayCityTodayCnt = offlineTorchReplayCityTodayCnt;
	}
	public Long getOfflineTorchReplayCityTodayCnt( ) {
		return this.offlineTorchReplayCityTodayCnt;
	}

	public void setOfflineTorchReplayCityTotalCnt(Long offlineTorchReplayCityTotalCnt) {
		this.offlineTorchReplayCityTotalCnt = offlineTorchReplayCityTotalCnt;
	}
	public Long getOfflineTorchReplayCityTotalCnt( ) {
		return this.offlineTorchReplayCityTotalCnt;
	}

	public void setOfflineTorchReplayTodayCnt(Long offlineTorchReplayTodayCnt) {
		this.offlineTorchReplayTodayCnt = offlineTorchReplayTodayCnt;
	}
	public Long getOfflineTorchReplayTodayCnt( ) {
		return this.offlineTorchReplayTodayCnt;
	}

	public void setOfflineTorchReplayTotalCnt(Long offlineTorchReplayTotalCnt) {
		this.offlineTorchReplayTotalCnt = offlineTorchReplayTotalCnt;
	}
	public Long getOfflineTorchReplayTotalCnt( ) {
		return this.offlineTorchReplayTotalCnt;
	}

	public void setOfflineTorchbearerPortrait(String offlineTorchbearerPortrait) {
		this.offlineTorchbearerPortrait = offlineTorchbearerPortrait;
	}
	public String getOfflineTorchbearerPortrait( ) {
		return this.offlineTorchbearerPortrait;
	}

	public void setOfflineTorchbearerTodayList(String offlineTorchbearerTodayList) {
		this.offlineTorchbearerTodayList = offlineTorchbearerTodayList;
	}
	public String getOfflineTorchbearerTodayList( ) {
		return this.offlineTorchbearerTodayList;
	}

}
