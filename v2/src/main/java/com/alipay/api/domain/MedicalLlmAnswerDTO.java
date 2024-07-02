package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗问答对象
 *
 * @author auto create
 * @since 1.0, 2024-03-19 21:28:57
 */
public class MedicalLlmAnswerDTO extends AlipayObject {

	private static final long serialVersionUID = 2548122298995996452L;

	/**
	 * 对话内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 当前轮次具体输入内容
	 */
	@ApiField("query")
	private String query;

	/**
	 * 当前轮次对话顺序
	 */
	@ApiField("seq_num")
	private String seqNum;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSeqNum() {
		return this.seqNum;
	}
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

}
