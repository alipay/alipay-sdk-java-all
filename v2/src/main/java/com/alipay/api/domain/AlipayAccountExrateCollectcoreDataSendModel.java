package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融信息受理接口
 *
 * @author auto create
 * @since 1.0, 2021-11-30 17:51:05
 */
public class AlipayAccountExrateCollectcoreDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 2836156152178226229L;

	/**
	 * 上数提交数据内容
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
