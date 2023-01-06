package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件上传额外参数
 *
 * @author auto create
 * @since 1.0, 2021-11-18 19:13:03
 */
public class FileUploadExtraParam extends AlipayObject {

	private static final long serialVersionUID = 5139371161556163218L;

	/**
	 * 是否同步上传到其他平台。素材类型为视频且需要同步优酷，请必传入参数youku，素材接口将代上传到优酷账号；素材类型为图片，无需传入参数
	 */
	@ApiField("extern_upload")
	private String externUpload;

	/**
	 * 文件加密类型，可选值：NO_ENCRYPT（不加密），CLIENT_DECRYPT（afts服务器加密，客户端解密），AFTS_SERVER（afts服务器端自动加解密），OSS_DECRYPT（使用oss存储加解密），AFTS_SERVER_STANDRAD（afts服务器自动加解密标准版，与AFTS_SERVER的差别在于秘钥使用方式不同）
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
