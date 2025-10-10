package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CorpusPublishTaskResult;
import com.alipay.api.domain.CorpusSyncResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.corpus.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 19:17:33
 */
public class AlipayEbppIndustryCorpusCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8866377263148995532L;

	/** 
	 * 知识发布任务结果
	 */
	@ApiField("corpus_publish_task_result_list")
	private CorpusPublishTaskResult corpusPublishTaskResultList;

	/** 
	 * 知识同步结果
	 */
	@ApiField("corpus_sync_result")
	private CorpusSyncResult corpusSyncResult;

	public void setCorpusPublishTaskResultList(CorpusPublishTaskResult corpusPublishTaskResultList) {
		this.corpusPublishTaskResultList = corpusPublishTaskResultList;
	}
	public CorpusPublishTaskResult getCorpusPublishTaskResultList( ) {
		return this.corpusPublishTaskResultList;
	}

	public void setCorpusSyncResult(CorpusSyncResult corpusSyncResult) {
		this.corpusSyncResult = corpusSyncResult;
	}
	public CorpusSyncResult getCorpusSyncResult( ) {
		return this.corpusSyncResult;
	}

}
