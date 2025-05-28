package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息批量发送记录查询请求
 *
 * @author auto create
 * @since 1.0, 2025-03-06 11:45:16
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6812178764115958264L;

	/**
	 * 批量发送记录ID，唯一标识一次消息模板批量查询
	 */
	@ApiField("batch_msg_id")
	private String batchMsgId;

	public String getBatchMsgId() {
		return this.batchMsgId;
	}
	public void setBatchMsgId(String batchMsgId) {
		this.batchMsgId = batchMsgId;
	}

}
