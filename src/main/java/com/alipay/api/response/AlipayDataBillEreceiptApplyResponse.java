package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.ereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-17 17:50:50
 */
public class AlipayDataBillEreceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5776297956556272994L;

	/** 
	 * 文件申请号file_id信息。
使用file_id可以查询处理状态，有效期：2天
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
