package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenBatch;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiQualityTestCloudacptBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6756936738115513649L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("open_batch")
	private List<OpenBatch> batchList;

	/** 
	 * 单品批次数
	 */
	@ApiField("batch_num")
	private String batchNum;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setBatchList(List<OpenBatch> batchList) {
		this.batchList = batchList;
	}
	public List<OpenBatch> getBatchList( ) {
		return this.batchList;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	public String getBatchNum( ) {
		return this.batchNum;
	}

}
