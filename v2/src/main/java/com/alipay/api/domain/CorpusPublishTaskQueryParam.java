package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识发布任务查询参数
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:24
 */
public class CorpusPublishTaskQueryParam extends AlipayObject {

	private static final long serialVersionUID = 7882254928652592886L;

	/**
	 * 知识语料类型
	 */
	@ApiField("corpus_type")
	private String corpusType;

	/**
	 * 发布类型
	 */
	@ApiField("publish_type")
	private String publishType;

	/**
	 * 发布任务的状态
	 */
	@ApiField("status")
	private String status;

	public String getCorpusType() {
		return this.corpusType;
	}
	public void setCorpusType(String corpusType) {
		this.corpusType = corpusType;
	}

	public String getPublishType() {
		return this.publishType;
	}
	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
