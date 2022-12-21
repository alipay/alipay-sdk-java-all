package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.ereceiptagent.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:03:58
 */
public class AlipayDataBillEreceiptagentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4691252321274449258L;

	/** 
	 * 文件申请号file_id信息。使用file_id可以查询处理状态
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
