package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayequity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:16:10
 */
public class AlipayDataMdaTorchreplayequityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7747842661842349763L;

	/** 
	 * 领取权益奖品分布
	 */
	@ApiField("equity_prize_distribute")
	private String equityPrizeDistribute;

	/** 
	 * 领取权益用户次数
	 */
	@ApiField("equity_pv")
	private Long equityPv;

	/** 
	 * 领取权益用户数
	 */
	@ApiField("equity_uv")
	private Long equityUv;

	/** 
	 * 搜索用户数
	 */
	@ApiField("search_uv")
	private Long searchUv;

	/** 
	 * 搜索用户趋势
	 */
	@ApiField("search_uv_trend")
	private String searchUvTrend;

	/** 
	 * 火炬手服装数
	 */
	@ApiField("torchbearer_clothing_cnt")
	private Long torchbearerClothingCnt;

	public void setEquityPrizeDistribute(String equityPrizeDistribute) {
		this.equityPrizeDistribute = equityPrizeDistribute;
	}
	public String getEquityPrizeDistribute( ) {
		return this.equityPrizeDistribute;
	}

	public void setEquityPv(Long equityPv) {
		this.equityPv = equityPv;
	}
	public Long getEquityPv( ) {
		return this.equityPv;
	}

	public void setEquityUv(Long equityUv) {
		this.equityUv = equityUv;
	}
	public Long getEquityUv( ) {
		return this.equityUv;
	}

	public void setSearchUv(Long searchUv) {
		this.searchUv = searchUv;
	}
	public Long getSearchUv( ) {
		return this.searchUv;
	}

	public void setSearchUvTrend(String searchUvTrend) {
		this.searchUvTrend = searchUvTrend;
	}
	public String getSearchUvTrend( ) {
		return this.searchUvTrend;
	}

	public void setTorchbearerClothingCnt(Long torchbearerClothingCnt) {
		this.torchbearerClothingCnt = torchbearerClothingCnt;
	}
	public Long getTorchbearerClothingCnt( ) {
		return this.torchbearerClothingCnt;
	}

}
