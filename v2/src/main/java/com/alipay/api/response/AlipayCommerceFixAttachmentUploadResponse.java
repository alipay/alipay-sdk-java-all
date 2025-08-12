package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FixFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.attachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 13:32:34
 */
public class AlipayCommerceFixAttachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2149486372255223941L;

	/** 
	 * 上传文件的内容。
	 */
	@ApiField("file_info")
	private FixFileInfo fileInfo;

	public void setFileInfo(FixFileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	public FixFileInfo getFileInfo( ) {
		return this.fileInfo;
	}

}
