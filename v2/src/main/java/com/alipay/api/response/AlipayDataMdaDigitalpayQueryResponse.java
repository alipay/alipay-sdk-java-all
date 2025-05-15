package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.digitalpay.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:09:02
 */
public class AlipayDataMdaDigitalpayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8731389431825164629L;

	/** 
	 * 亚运村交易笔数
	 */
	@ApiField("asian_village_trd_cnt")
	private Long asianVillageTrdCnt;

	/** 
	 * 主媒体中心交易笔数
	 */
	@ApiField("mmc_trd_cnt")
	private Long mmcTrdCnt;

	/** 
	 * 总交易笔数
	 */
	@ApiField("total_trd_cnt")
	private Long totalTrdCnt;

	/** 
	 * 近7天交易趋势
	 */
	@ApiField("trd_cnt_trend")
	private String trdCntTrend;

	/** 
	 * 竞赛场馆交易笔数
	 */
	@ApiField("venue_trd_cnt")
	private Long venueTrdCnt;

	public void setAsianVillageTrdCnt(Long asianVillageTrdCnt) {
		this.asianVillageTrdCnt = asianVillageTrdCnt;
	}
	public Long getAsianVillageTrdCnt( ) {
		return this.asianVillageTrdCnt;
	}

	public void setMmcTrdCnt(Long mmcTrdCnt) {
		this.mmcTrdCnt = mmcTrdCnt;
	}
	public Long getMmcTrdCnt( ) {
		return this.mmcTrdCnt;
	}

	public void setTotalTrdCnt(Long totalTrdCnt) {
		this.totalTrdCnt = totalTrdCnt;
	}
	public Long getTotalTrdCnt( ) {
		return this.totalTrdCnt;
	}

	public void setTrdCntTrend(String trdCntTrend) {
		this.trdCntTrend = trdCntTrend;
	}
	public String getTrdCntTrend( ) {
		return this.trdCntTrend;
	}

	public void setVenueTrdCnt(Long venueTrdCnt) {
		this.venueTrdCnt = venueTrdCnt;
	}
	public Long getVenueTrdCnt( ) {
		return this.venueTrdCnt;
	}

}
