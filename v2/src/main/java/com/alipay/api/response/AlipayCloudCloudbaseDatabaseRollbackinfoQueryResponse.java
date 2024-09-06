package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MongoRollbackInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbackinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 16:56:58
 */
public class AlipayCloudCloudbaseDatabaseRollbackinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1111225725813798133L;

	/** 
	 * 可回档列表
	 */
	@ApiListField("rollback_infos")
	@ApiField("mongo_rollback_info")
	private List<MongoRollbackInfo> rollbackInfos;

	public void setRollbackInfos(List<MongoRollbackInfo> rollbackInfos) {
		this.rollbackInfos = rollbackInfos;
	}
	public List<MongoRollbackInfo> getRollbackInfos( ) {
		return this.rollbackInfos;
	}

}
