package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 执行数据库回档任务
 *
 * @author auto create
 * @since 1.0, 2025-05-16 15:15:20
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5264511481914421952L;

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
