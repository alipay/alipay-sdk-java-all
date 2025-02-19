package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对象存储删除文件
 *
 * @author auto create
 * @since 1.0, 2024-03-14 14:58:36
 */
public class AlipayCloudCloudrunObjectstorageFilelistDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7123173724512962426L;

	/**
	 * 内部使用 uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 要删除的文件id列表，文件id为文件的唯一索引ID，上传文件后系统会创建返回该文件的文件id
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
