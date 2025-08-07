package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息记录详情卡片，目前只有答案卡片，后续会开放出来 4e过程卡片 等等
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:40
 */
public class ZXZMessageCard extends AlipayObject {

	private static final long serialVersionUID = 8364477574966491839L;

	/**
	 * 详细内容，详情请看文档 《openapi标准化接口》 4.2
	 */
	@ApiField("data")
	private String data;

	/**
	 * 执行状态 pending 等待中 running 执行中 success 执行成功 fail 失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 4Eprocess 4e过程，当前未开放
answer 答案卡片
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
