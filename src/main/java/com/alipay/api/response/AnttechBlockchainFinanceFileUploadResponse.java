package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinanceFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:37:25
 */
public class AnttechBlockchainFinanceFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3431365132746343995L;

	/** 
	 * 上传成功后返回文件信息
	 */
	@ApiField("file_info")
	private FinanceFileInfo fileInfo;

	public void setFileInfo(FinanceFileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	public FinanceFileInfo getFileInfo( ) {
		return this.fileInfo;
	}

}
