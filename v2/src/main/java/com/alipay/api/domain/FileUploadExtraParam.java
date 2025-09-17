package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件上传额外参数
 *
 * @author auto create
 * @since 1.0, 2023-06-07 21:13:16
 */
public class FileUploadExtraParam extends AlipayObject {

	private static final long serialVersionUID = 8522454414244468394L;

	/**
	 * 是否同步上传到其他平台。素材类型为视频且需要同步优酷，请必传入参数youku，素材接口将代上传到优酷账号；素材类型为图片，无需传入参数
	 */
	@ApiField("extern_upload")
	private String externUpload;

	/**
	 * 文件加密类型
	 */
	@ApiField("file_encrypt_type")
	private String fileEncryptType;

	public String getExternUpload() {
		return this.externUpload;
	}
	public void setExternUpload(String externUpload) {
		this.externUpload = externUpload;
	}

	public String getFileEncryptType() {
		return this.fileEncryptType;
	}
	public void setFileEncryptType(String fileEncryptType) {
		this.fileEncryptType = fileEncryptType;
	}

}
