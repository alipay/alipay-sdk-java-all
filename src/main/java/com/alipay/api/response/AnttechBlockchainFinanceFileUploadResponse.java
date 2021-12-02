package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinanceFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-14 15:14:19
 */
public class AnttechBlockchainFinanceFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4423991763672679973L;

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
