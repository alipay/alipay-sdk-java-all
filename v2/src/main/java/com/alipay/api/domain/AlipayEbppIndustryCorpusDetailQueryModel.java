package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识详情查询
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:14
 */
public class AlipayEbppIndustryCorpusDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2141241722824439887L;

	/**
	 * 智能体id
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 知识语料类型
	 */
	@ApiField("corpus_type")
	private String corpusType;

	/**
	 * 机构自己保存的语料id
	 */
	@ApiField("out_corpus_id")
	private String outCorpusId;

	public String getBotId() {
		return this.botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getCorpusType() {
		return this.corpusType;
	}
	public void setCorpusType(String corpusType) {
		this.corpusType = corpusType;
	}

	public String getOutCorpusId() {
		return this.outCorpusId;
	}
	public void setOutCorpusId(String outCorpusId) {
		this.outCorpusId = outCorpusId;
	}

}
