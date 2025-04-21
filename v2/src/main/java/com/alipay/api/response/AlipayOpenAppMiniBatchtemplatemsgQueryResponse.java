package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BatchTemplateMsgRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.mini.batchtemplatemsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 11:45:16
 */
public class AlipayOpenAppMiniBatchtemplatemsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8542716468695368196L;

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
