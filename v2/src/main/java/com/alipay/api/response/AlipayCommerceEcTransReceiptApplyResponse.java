package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.receipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-26 09:55:13
 */
public class AlipayCommerceEcTransReceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3272397369482438324L;

	/** 
	 * 文件申请号file_id信息。使用file_id可以查询处理状态，有效期2天
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}
