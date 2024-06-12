package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改文件ACL
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:03:03
 */
public class AlipayCloudCloudrunObjectstorageObjectaclModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1214843658696585334L;

	/**
	 * 文件acl，取值default：默认，acl继承自桶的acl；private: 私有，公网无法直接访问获取；public-read: 公开，公网可以直接访问获取
	 */
	@ApiField("acl")
	private String acl;

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
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

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

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
