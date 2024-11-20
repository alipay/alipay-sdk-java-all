package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.file.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:37:02
 */
public class AntfortuneFinresearchFileDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6516923152598722969L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件的状态 果是上传过程需要轮询或获取结果，上传过程中如果结果为空，等待3s在重试，其余情况调用方根据自己的实际情况决定
从结果中的 upload_status 判断是否成功 FINISH 代表成功， ANALYZE_FAIL 代表上传失败， PARSING(文件解析中)、INIT(初始化，等待解析
	 */
	@ApiField("upload_status")
	private String uploadStatus;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	public String getUploadStatus( ) {
		return this.uploadStatus;
	}

}
