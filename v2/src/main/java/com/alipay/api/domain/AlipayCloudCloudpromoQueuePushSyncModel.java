package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户排队状态变更信息同步
 *
 * @author auto create
 * @since 1.0, 2024-09-26 15:52:48
 */
public class AlipayCloudCloudpromoQueuePushSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5789499619531221127L;

	/**
	 * 该字段为客户spi要求，传入内容为加密后的文本。
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
