package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LotteryType;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.typelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:58:44
 */
public class AlipayCommerceLotteryTypelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1484173693725164742L;

	/** 
	 * 彩票系统支持的可用于赠送的彩种类型列表
	 */
	@ApiListField("results")
	@ApiField("lottery_type")
	private List<LotteryType> results;

	/** 
	 * 彩票系统支持的可用于赠送的彩种个数
	 */
	@ApiField("total_result")
	private Long totalResult;

	public void setResults(List<LotteryType> results) {
		this.results = results;
	}
	public List<LotteryType> getResults( ) {
		return this.results;
	}

	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
