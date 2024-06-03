package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对象存储获取文件下载地址
 *
 * @author auto create
 * @since 1.0, 2023-12-07 14:34:15
 */
public class AlipayCloudCloudrunObjectstorageDownloadurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 3799692971362446257L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 使用主key还是副key进行签名。
	 */
	@ApiField("auth_key")
	private String authKey;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 欲获取的文件列表,最多支持同时获取20个文件的下载地址
	 */
	@ApiListField("file_list")
	@ApiField("download_url_request")
	private List<DownloadUrlRequest> fileList;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getAuthKey() {
		return this.authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public List<DownloadUrlRequest> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<DownloadUrlRequest> fileList) {
		this.fileList = fileList;
	}

}
