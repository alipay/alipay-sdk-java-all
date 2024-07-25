package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BatchTemplateMsgRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.mini.batchtemplatemsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4426179642684336527L;

	/** 
	 * 消息批量发送记录
	 */
	@ApiField("record")
	private BatchTemplateMsgRecordVO record;

	public void setRecord(BatchTemplateMsgRecordVO record) {
		this.record = record;
	}
	public BatchTemplateMsgRecordVO getRecord( ) {
		return this.record;
	}

}
