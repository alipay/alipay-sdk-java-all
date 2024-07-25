package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArticleSummaryAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.articlesummary.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayOpenPublicArticlesummaryDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5645638363431435923L;

	/** 
	 * 文章分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("article_summary_analysis_data")
	private List<ArticleSummaryAnalysisData> dataList;

	public void setDataList(List<ArticleSummaryAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<ArticleSummaryAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
