package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InterceptedCorpusResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.corpus.batch.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 13:27:31
 */
public class AlipayEbppIndustryCorpusBatchSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8827914338365777558L;

	/** 
	 * 拦截的语料列表
	 */
	@ApiListField("intercepted_corpus_list")
	@ApiField("intercepted_corpus_result")
	private List<InterceptedCorpusResult> interceptedCorpusList;

	/** 
	 * 同步知识的批次id，用于反向查询同步知识的处理情况
	 */
	@ApiField("sync_batch_id")
	private String syncBatchId;

	/** 
	 * 同步结果
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setInterceptedCorpusList(List<InterceptedCorpusResult> interceptedCorpusList) {
		this.interceptedCorpusList = interceptedCorpusList;
	}
	public List<InterceptedCorpusResult> getInterceptedCorpusList( ) {
		return this.interceptedCorpusList;
	}

	public void setSyncBatchId(String syncBatchId) {
		this.syncBatchId = syncBatchId;
	}
	public String getSyncBatchId( ) {
		return this.syncBatchId;
	}

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
