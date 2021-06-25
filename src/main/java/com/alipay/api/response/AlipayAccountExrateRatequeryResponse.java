package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExRefRateInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.ratequery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayAccountExrateRatequeryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6142724653721968817L;

	/** 
	 * 查询到的汇率对象列表，如果没有查询到则返回空列表
	 */
	@ApiListField("rate_query_response_list")
	@ApiField("ex_ref_rate_info_v_o")
	private List<ExRefRateInfoVO> rateQueryResponseList;

	public void setRateQueryResponseList(List<ExRefRateInfoVO> rateQueryResponseList) {
		this.rateQueryResponseList = rateQueryResponseList;
	}
	public List<ExRefRateInfoVO> getRateQueryResponseList( ) {
		return this.rateQueryResponseList;
	}

}
