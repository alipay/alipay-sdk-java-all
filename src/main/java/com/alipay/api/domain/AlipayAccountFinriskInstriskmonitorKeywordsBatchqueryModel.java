package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询关键词接口
 *
 * @author auto create
 * @since 1.0, 2018-07-03 23:53:52
 */
public class AlipayAccountFinriskInstriskmonitorKeywordsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3143361876683331288L;

	/**
	 * 查询机构关键词
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
