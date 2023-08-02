package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建文件夹
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:15:56
 */
public class AlipayCloudCloudrunObjectstorageDirectoryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8178895228615611522L;

	/**
	 * 定义文件的访问权限。
	 */
	@ApiField("acl")
	private String acl;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件夹的绝对路径
	 */
	@ApiField("path")
	private String path;

	public String getAcl() {
		return this.acl;
	}
	public void setAcl(String acl) {
		this.acl = acl;
	}

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
