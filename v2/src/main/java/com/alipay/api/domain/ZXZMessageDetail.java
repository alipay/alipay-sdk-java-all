package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小助消息详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:36:40
 */
public class ZXZMessageDetail extends AlipayObject {

	private static final long serialVersionUID = 6673186363238881433L;

	/**
	 * 支小助回答记录卡片信息
	 */
	@ApiListField("records")
	@ApiField("z_x_z_message_card")
	private List<ZXZMessageCard> records;

	/**
	 * 执行状态 pending 等待中 running 执行中 success 执行成功 fail 失败
	 */
	@ApiField("status")
	private String status;

	public List<ZXZMessageCard> getRecords() {
		return this.records;
	}
	public void setRecords(List<ZXZMessageCard> records) {
		this.records = records;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
