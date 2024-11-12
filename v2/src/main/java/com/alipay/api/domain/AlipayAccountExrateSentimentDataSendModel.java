package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家制裁数据受理接口
 *
 * @author auto create
 * @since 1.0, 2017-11-28 21:58:58
 */
public class AlipayAccountExrateSentimentDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 7123847425949693886L;

	/**
	 * 国家制裁提交数据内容
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
