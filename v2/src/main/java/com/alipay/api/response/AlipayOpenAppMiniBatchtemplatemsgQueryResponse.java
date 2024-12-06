package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BatchTemplateMsgRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.mini.batchtemplatemsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 18:09:30
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1292121174958121899L;

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
