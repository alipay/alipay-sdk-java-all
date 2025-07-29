package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.crlevel.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 10:45:00
 */
public class ZhimaCreditEpCrlevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836232745923359741L;

	/** 
	 * CR等级，1-12
	 */
	@ApiField("cr_rank")
	private String crRank;

	/** 
	 * CR等级描述，枚举值【好、较好、中等、中等偏下、较差、差】
	 */
	@ApiField("cr_rank_title")
	private String crRankTitle;

	/** 
	 * 企业是否有CR等级，true:有;false:没有。
false时cr_rank和cr_rank_title为null
	 */
	@ApiField("has_cr_rank")
	private Boolean hasCrRank;

	public void setCrRank(String crRank) {
		this.crRank = crRank;
	}
	public String getCrRank( ) {
		return this.crRank;
	}

	public void setCrRankTitle(String crRankTitle) {
		this.crRankTitle = crRankTitle;
	}
	public String getCrRankTitle( ) {
		return this.crRankTitle;
	}

	public void setHasCrRank(Boolean hasCrRank) {
		this.hasCrRank = hasCrRank;
	}
	public Boolean getHasCrRank( ) {
		return this.hasCrRank;
	}

}
