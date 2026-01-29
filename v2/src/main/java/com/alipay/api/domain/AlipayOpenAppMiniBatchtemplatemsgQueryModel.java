package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息批量发送记录查询请求
 *
 * @author auto create
 * @since 1.0, 2025-12-26 11:48:56
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5118358169857558614L;

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
