package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 舆情数据处理平台外部数据提交接口
 *
 * @author auto create
 * @since 1.0, 2017-06-02 13:56:58
 */
public class AlipayBossCsDatacollectSendModel extends AlipayObject {

	private static final long serialVersionUID = 7483897828275554618L;

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
