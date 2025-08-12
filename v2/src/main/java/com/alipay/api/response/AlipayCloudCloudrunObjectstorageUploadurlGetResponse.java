package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OssPostUploadFormData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.uploadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 09:56:43
 */
public class AlipayCloudCloudrunObjectstorageUploadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1481198367439122264L;

	/** 
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 仅当通过POST Form方式上传时有意义。
POST Form上传时，用户需要填写该接口返回的所有表单参数，且不能填写额外的表单参数，否则会上传失败。
	 */
	@ApiListField("form_data")
	@ApiField("oss_post_upload_form_data")
	private List<OssPostUploadFormData> formData;

	/** 
	 * 文件上传地址，该文件的上传地址
	 */
	@ApiField("upload_url")
	private String uploadUrl;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFormData(List<OssPostUploadFormData> formData) {
		this.formData = formData;
	}
	public List<OssPostUploadFormData> getFormData( ) {
		return this.formData;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	public String getUploadUrl( ) {
		return this.uploadUrl;
	}

}
