package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除文件夹
 *
 * @author auto create
 * @since 1.0, 2024-03-14 14:59:28
 */
public class AlipayCloudCloudrunObjectstorageDirectoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7347722135151483874L;

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
	 * 要删除的文件夹列表
	 */
	@ApiListField("file_id_list")
	@ApiField("string")
	private List<String> fileIdList;

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

	public List<String> getFileIdList() {
		return this.fileIdList;
	}
	public void setFileIdList(List<String> fileIdList) {
		this.fileIdList = fileIdList;
	}

}
