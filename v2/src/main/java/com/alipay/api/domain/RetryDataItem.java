package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 待重试的数据信息
 *
 * @author auto create
 * @since 1.0, 2025-01-08 17:55:47
 */
public class RetryDataItem extends AlipayObject {

	private static final long serialVersionUID = 8782974568457823971L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务消息
	 */
	@ApiListField("biz_messages")
	@ApiField("string")
	private List<String> bizMessages;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getBizMessages() {
		return this.bizMessages;
	}
	public void setBizMessages(List<String> bizMessages) {
		this.bizMessages = bizMessages;
	}

}
