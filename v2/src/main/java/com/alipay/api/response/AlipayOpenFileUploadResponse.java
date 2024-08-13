package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7765334811124256814L;

	/** 
	 * 视频资源id，同步外部渠道后，外部渠道返回的id。目前支持同步优酷场景，返回优酷视频id，用于支付宝客户端播放视频使用
	 */
	@ApiField("extern_id")
	private String externId;

	/** 
	 * 文件id，用于提供后后续业务调用使用
	 */
	@ApiField("file_id")
	private String fileId;

	public void setExternId(String externId) {
		this.externId = externId;
	}
	public String getExternId( ) {
		return this.externId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}
