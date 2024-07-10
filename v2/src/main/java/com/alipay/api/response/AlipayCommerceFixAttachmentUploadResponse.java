package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FixFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.attachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceFixAttachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5125893613279427197L;

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
