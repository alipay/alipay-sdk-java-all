package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息批量发送记录查询请求
 *
 * @author auto create
 * @since 1.0, 2024-01-14 22:42:48
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3748332881748564422L;

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
