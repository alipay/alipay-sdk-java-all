package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndexTrendVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.trend.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:26:50
 */
public class AlipayMerchantQipanTrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2386718529893694891L;

	/** 
	 * 趋势分析数据
	 */
	@ApiListField("index_trend_results")
	@ApiField("index_trend_v_o")
	private List<IndexTrendVO> indexTrendResults;

	public void setIndexTrendResults(List<IndexTrendVO> indexTrendResults) {
		this.indexTrendResults = indexTrendResults;
	}
	public List<IndexTrendVO> getIndexTrendResults( ) {
		return this.indexTrendResults;
	}

}
