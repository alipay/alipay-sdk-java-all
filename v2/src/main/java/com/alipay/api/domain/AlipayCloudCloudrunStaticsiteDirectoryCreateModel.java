package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点创建文件夹
 *
 * @author auto create
 * @since 1.0, 2023-10-09 13:59:16
 */
public class AlipayCloudCloudrunStaticsiteDirectoryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4793164785121755765L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件夹绝对路径
● 必须以"/"开头，不能以/结尾
● 使用UTF-8编码
● 长度必须在1024字符之间
● 不能出现连续"/"
	 */
	@ApiField("path")
	private String path;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
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
