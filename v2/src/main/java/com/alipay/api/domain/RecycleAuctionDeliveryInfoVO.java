package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收竞拍履约信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleAuctionDeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3321226871789952913L;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_bill_no")
	private String logisticsBillNo;

	/**
	 * 物流平台
	 */
	@ApiField("logistics_platform")
	private String logisticsPlatform;

	/**
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	public String getLogisticsBillNo() {
		return this.logisticsBillNo;
	}
	public void setLogisticsBillNo(String logisticsBillNo) {
		this.logisticsBillNo = logisticsBillNo;
	}

	public String getLogisticsPlatform() {
		return this.logisticsPlatform;
	}
	public void setLogisticsPlatform(String logisticsPlatform) {
		this.logisticsPlatform = logisticsPlatform;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

}
