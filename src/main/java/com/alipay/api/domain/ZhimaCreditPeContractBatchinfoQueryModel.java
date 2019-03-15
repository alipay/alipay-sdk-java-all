package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约批量查询
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:09:37
 */
public class ZhimaCreditPeContractBatchinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7212258426518632489L;

	/**
	 * 活动名
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 查询批次号，从1开始计数
	 */
	@ApiField("batch_index")
	private Long batchIndex;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 批量查询数据日期
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 查询事务号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Long getBatchIndex() {
		return this.batchIndex;
	}
	public void setBatchIndex(Long batchIndex) {
		this.batchIndex = batchIndex;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
