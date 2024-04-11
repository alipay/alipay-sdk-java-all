package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点获取文件上传链接
 *
 * @author auto create
 * @since 1.0, 2024-03-14 14:58:21
 */
public class AlipayCloudCloudrunStaticsiteUploadurlCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2885683932754487194L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 文件类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件路径。
文件全路径:
● 必须以"/"开头
● 使用UTF-8编码
● 长度必须在1024字符之间
● 不能出现连续"/"
● 不能以"/"结尾
	 */
	@ApiField("path")
	private String path;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

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
