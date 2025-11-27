package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能体知识库通用查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:24
 */
public class AlipayEbppIndustryCorpusCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5122826872951943183L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 知识发布任务查询参数
	 */
	@ApiField("corpus_publish_task_query_param")
	private CorpusPublishTaskQueryParam corpusPublishTaskQueryParam;

	/**
	 * 知识同步任务id。从知识同步接口的出参中获取
	 */
	@ApiField("corpus_sync_batch_id")
	private String corpusSyncBatchId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public CorpusPublishTaskQueryParam getCorpusPublishTaskQueryParam() {
		return this.corpusPublishTaskQueryParam;
	}
	public void setCorpusPublishTaskQueryParam(CorpusPublishTaskQueryParam corpusPublishTaskQueryParam) {
		this.corpusPublishTaskQueryParam = corpusPublishTaskQueryParam;
	}

	public String getCorpusSyncBatchId() {
		return this.corpusSyncBatchId;
	}
	public void setCorpusSyncBatchId(String corpusSyncBatchId) {
		this.corpusSyncBatchId = corpusSyncBatchId;
	}

}
