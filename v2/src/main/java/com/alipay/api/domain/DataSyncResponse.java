package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据同步响应模型
 *
 * @author auto create
 * @since 1.0, 2025-01-10 11:23:30
 */
public class DataSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 3767925189384189296L;

	/**
	 * 推送批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 处理失败的记录数
	 */
	@ApiField("failed_num")
	private Long failedNum;

	/**
	 * 待重试的数据列表
	 */
	@ApiListField("retry_data_list")
	@ApiField("retry_data_item")
	private List<RetryDataItem> retryDataList;

	/**
	 * 处理成功的记录数
	 */
	@ApiField("success_num")
	private Long successNum;

	/**
	 * 处理的记录总数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Long getFailedNum() {
		return this.failedNum;
	}
	public void setFailedNum(Long failedNum) {
		this.failedNum = failedNum;
	}

	public List<RetryDataItem> getRetryDataList() {
		return this.retryDataList;
	}
	public void setRetryDataList(List<RetryDataItem> retryDataList) {
		this.retryDataList = retryDataList;
	}

	public Long getSuccessNum() {
		return this.successNum;
	}
	public void setSuccessNum(Long successNum) {
		this.successNum = successNum;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

}
