package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.attachment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-28 17:52:00
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimAttachmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7183984243566186916L;

	/** 
	 * attachment_stream+不唯一+供应商获取理赔附件+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("attachment_stream")
	private String attachmentStream;

	public void setAttachmentStream(String attachmentStream) {
		this.attachmentStream = attachmentStream;
	}
	public String getAttachmentStream( ) {
		return this.attachmentStream;
	}

}
