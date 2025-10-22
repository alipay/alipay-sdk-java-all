package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 售卖订单数据同步
 *
 * @author auto create
 * @since 1.0, 2025-08-18 15:35:34
 */
public class AlipayCommerceMerchantcardOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2176983874136956341L;

	/**
	 * 推送批次号，由外部传入，用于标识是哪一次推送任务
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 售卖订单数据列表
	 */
	@ApiListField("order_data_list")
	@ApiField("order_data_sync_request")
	private List<OrderDataSyncRequest> orderDataList;

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

	public List<OrderDataSyncRequest> getOrderDataList() {
		return this.orderDataList;
	}
	public void setOrderDataList(List<OrderDataSyncRequest> orderDataList) {
		this.orderDataList = orderDataList;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
