package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.implus.chatrecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 14:02:40
 */
public class AlipayIserviceCcmImplusChatrecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287569389278396825L;

	/** 
	 * 分页参数，如果为空，则没有下一页
	 */
	@ApiField("next")
	private String next;

	/** 
	 * 聊天记录
	 */
	@ApiListField("rows")
	@ApiField("string")
	private List<String> rows;

	public void setNext(String next) {
		this.next = next;
	}
	public String getNext( ) {
		return this.next;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}
	public List<String> getRows( ) {
		return this.rows;
	}

}
