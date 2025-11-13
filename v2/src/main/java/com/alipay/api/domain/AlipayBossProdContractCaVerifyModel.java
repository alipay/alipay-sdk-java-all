package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子章验证
 *
 * @author auto create
 * @since 1.0, 2024-08-14 18:14:56
 */
public class AlipayBossProdContractCaVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7422892638633729421L;

	/**
	 * http地址
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
