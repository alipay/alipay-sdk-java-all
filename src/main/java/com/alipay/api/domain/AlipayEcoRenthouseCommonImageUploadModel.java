package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件资源上传
 *
 * @author auto create
 * @since 1.0, 2020-06-02 19:24:33
 */
public class AlipayEcoRenthouseCommonImageUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3535596249762618569L;

	/**
	 * 文件内容字节数组Base64字符串,最大支持上传5M的文件
	 */
	@ApiField("file_base")
	private String fileBase;

	/**
	 * 文件类型
1：图片（支持jpg、png、jpeg、bmp格式） 
2：合同（HTML格式）
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * true|false是否公共读写，私密文件使用否，如电子合同
	 */
	@ApiField("is_public")
	private Boolean isPublic;

	public String getFileBase() {
		return this.fileBase;
	}
	public void setFileBase(String fileBase) {
		this.fileBase = fileBase;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Boolean getIsPublic() {
		return this.isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

}
