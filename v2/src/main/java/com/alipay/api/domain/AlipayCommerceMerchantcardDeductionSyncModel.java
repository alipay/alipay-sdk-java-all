package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核销订单数据同步
 *
 * @author auto create
 * @since 1.0, 2025-08-18 15:31:43
 */
public class AlipayCommerceMerchantcardDeductionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8358221889967783497L;

	/**
	 * 推送批次号，由外部传入，用于标识是哪一次推送任务
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 核销订单数据列表
	 */
	@ApiListField("deduction_data_list")
	@ApiField("deduction_data_sync_request")
	private List<DeductionDataSyncRequest> deductionDataList;

	/**
	 * 同步类型，用于区分是增量同步还是存量同步
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public List<DeductionDataSyncRequest> getDeductionDataList() {
		return this.deductionDataList;
	}
	public void setDeductionDataList(List<DeductionDataSyncRequest> deductionDataList) {
		this.deductionDataList = deductionDataList;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
