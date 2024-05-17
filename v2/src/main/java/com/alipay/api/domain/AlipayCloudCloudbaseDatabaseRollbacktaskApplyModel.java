package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 执行数据库回档任务
 *
 * @author auto create
 * @since 1.0, 2024-03-13 16:51:53
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2725569461796665965L;

	/**
	 * 归档时间
	 */
	@ApiField("archive_time")
	private String archiveTime;

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
	 * 归档集合列表
	 */
	@ApiListField("rollback_collections")
	@ApiField("mongo_rollback_collection")
	private List<MongoRollbackCollection> rollbackCollections;

	public String getArchiveTime() {
		return this.archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
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

	public List<MongoRollbackCollection> getRollbackCollections() {
		return this.rollbackCollections;
	}
	public void setRollbackCollections(List<MongoRollbackCollection> rollbackCollections) {
		this.rollbackCollections = rollbackCollections;
	}

}
