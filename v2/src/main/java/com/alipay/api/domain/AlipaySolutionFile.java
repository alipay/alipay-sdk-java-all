package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连解决方案文件类型
 *
 * @author auto create
 * @since 1.0, 2024-06-05 18:57:24
 */
public class AlipaySolutionFile extends AlipayObject {

	private static final long serialVersionUID = 2743926731492328817L;

	/**
	 * 标识解决方案的数据提报中所需的文件类型
	 */
	@ApiField("file_code")
	private String fileCode;

	/**
	 * 使用文件上传接口（alipay.open.file.upload）上传文件后返回的文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public String getFileCode() {
		return this.fileCode;
	}
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
