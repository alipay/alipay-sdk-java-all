package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 归档集合列表
 *
 * @author auto create
 * @since 1.0, 2024-03-13 15:55:35
 */
public class MongoRollbackCollection extends AlipayObject {

	private static final long serialVersionUID = 4844123786458914943L;

	/**
	 * 回档后集合名称
	 */
	@ApiField("rollback_collection_name")
	private String rollbackCollectionName;

	/**
	 * 回档集合名称
	 */
	@ApiField("source_collection_name")
	private String sourceCollectionName;

	public String getRollbackCollectionName() {
		return this.rollbackCollectionName;
	}
	public void setRollbackCollectionName(String rollbackCollectionName) {
		this.rollbackCollectionName = rollbackCollectionName;
	}

	public String getSourceCollectionName() {
		return this.sourceCollectionName;
	}
	public void setSourceCollectionName(String sourceCollectionName) {
		this.sourceCollectionName = sourceCollectionName;
	}

}
