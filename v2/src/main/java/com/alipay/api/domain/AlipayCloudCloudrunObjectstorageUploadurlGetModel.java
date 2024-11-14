package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对象存储获取文件上传地址
 *
 * @author auto create
 * @since 1.0, 2023-09-01 19:09:51
 */
public class AlipayCloudCloudrunObjectstorageUploadurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 6518879586972124578L;

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
	 * 文件上传路径，请以"/"开头，此为期望在对象存储上保存的文件路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 上传文件要使用的方法，支持PUT/POST。
默认PUT，可选值：POST/PUT
● POST：通过POST Form的方式上传
● PUT：通过PUT方法上传
	 */
	@ApiField("upload_method")
	private String uploadMethod;

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

	public String getUploadMethod() {
		return this.uploadMethod;
	}
	public void setUploadMethod(String uploadMethod) {
		this.uploadMethod = uploadMethod;
	}

}
