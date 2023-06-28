package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对象存储获取文件上传地址
 *
 * @author auto create
 * @since 1.0, 2023-06-27 20:30:16
 */
public class AlipayCloudCloudrunObjectstorageUploadurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 8177784435463157795L;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件上传路径
	 */
	@ApiField("path")
	private String path;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
