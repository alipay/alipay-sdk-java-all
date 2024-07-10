package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 执行数据库操作命令
 *
 * @author auto create
 * @since 1.0, 2023-11-02 21:36:50
 */
public class AlipayCloudCloudbaseDatabaseCommandApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3747883732176637825L;

	/**
	 * 数据库操作命令参数，JSON格式
	 */
	@ApiField("args")
	private String args;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * - listCollections
- createCollection
- dropCollection
- renameCollection
- statsCollection
- listIndexes
- createIndex
- dropIndex
- insertOneDocument
- insertManyDocuments
- replaceOneDocument
- deleteOneDocument
- deleteManyDocuments
- deleteManyDocumentsByIds
- updateOneDocument
- updateManyDocuments
- find
- count
	 */
	@ApiField("command")
	private String command;

	public String getArgs() {
		return this.args;
	}
	public void setArgs(String args) {
		this.args = args;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

}
