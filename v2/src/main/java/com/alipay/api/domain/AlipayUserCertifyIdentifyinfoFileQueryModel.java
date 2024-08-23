package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份信息问题查询
 *
 * @author auto create
 * @since 1.0, 2024-08-01 11:23:16
 */
public class AlipayUserCertifyIdentifyinfoFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6382969586252231245L;

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
