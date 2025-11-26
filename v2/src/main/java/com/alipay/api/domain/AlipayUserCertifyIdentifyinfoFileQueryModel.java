package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份信息问题查询
 *
 * @author auto create
 * @since 1.0, 2024-08-28 10:31:29
 */
public class AlipayUserCertifyIdentifyinfoFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4447555928817937413L;

	/**
	 * 文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
