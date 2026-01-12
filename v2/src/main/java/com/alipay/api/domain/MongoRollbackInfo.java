package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可回档列表
 *
 * @author auto create
 * @since 1.0, 2024-03-13 16:05:27
 */
public class MongoRollbackInfo extends AlipayObject {

	private static final long serialVersionUID = 8615232594724211867L;

	/**
	 * 归档时间
	 */
	@ApiField("archive_time")
	private String archiveTime;

	/**
	 * 可回档集合列表
	 */
	@ApiListField("rollback_collections")
	@ApiField("mongo_collection_info")
	private List<MongoCollectionInfo> rollbackCollections;

	public String getArchiveTime() {
		return this.archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}

	public List<MongoCollectionInfo> getRollbackCollections() {
		return this.rollbackCollections;
	}
	public void setRollbackCollections(List<MongoCollectionInfo> rollbackCollections) {
		this.rollbackCollections = rollbackCollections;
	}

}
