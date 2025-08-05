package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 拦截的语料结果描述
 *
 * @author auto create
 * @since 1.0, 2025-07-04 13:22:37
 */
public class InterceptedCorpusResult extends AlipayObject {

	private static final long serialVersionUID = 3314261772696774659L;

	/**
	 * 拦截的描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 校验失败的id列表
	 */
	@ApiListField("out_corpus_id_list")
	@ApiField("string")
	private List<String> outCorpusIdList;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<String> getOutCorpusIdList() {
		return this.outCorpusIdList;
	}
	public void setOutCorpusIdList(List<String> outCorpusIdList) {
		this.outCorpusIdList = outCorpusIdList;
	}

}
