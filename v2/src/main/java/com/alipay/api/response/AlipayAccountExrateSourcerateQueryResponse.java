package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExSourceRateVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.sourcerate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:57
 */
public class AlipayAccountExrateSourcerateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6473917152727324298L;

	/** 
	 * 源汇率记录
	 */
	@ApiListField("source_rate_list")
	@ApiField("ex_source_rate_v_o")
	private List<ExSourceRateVO> sourceRateList;

	public void setSourceRateList(List<ExSourceRateVO> sourceRateList) {
		this.sourceRateList = sourceRateList;
	}
	public List<ExSourceRateVO> getSourceRateList( ) {
		return this.sourceRateList;
	}

}
