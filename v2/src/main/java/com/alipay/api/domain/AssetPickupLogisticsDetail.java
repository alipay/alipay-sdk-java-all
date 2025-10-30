package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上门取件物流信息查询
 *
 * @author auto create
 * @since 1.0, 2025-04-29 10:47:57
 */
public class AssetPickupLogisticsDetail extends AlipayObject {

	private static final long serialVersionUID = 8255751113448113314L;

	/**
	 * 逆向入库指令
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 批次号，用于幂等
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_infos")
	private LogisticsInfo logisticsInfos;

	/**
	 * 揽收
	 */
	@ApiField("pickup_status")
	private String pickupStatus;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public LogisticsInfo getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(LogisticsInfo logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

	public String getPickupStatus() {
		return this.pickupStatus;
	}
	public void setPickupStatus(String pickupStatus) {
		this.pickupStatus = pickupStatus;
	}

}
