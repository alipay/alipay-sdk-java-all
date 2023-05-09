package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinanceFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:24:43
 */
public class AnttechBlockchainFinanceFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5549338319421188818L;

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
