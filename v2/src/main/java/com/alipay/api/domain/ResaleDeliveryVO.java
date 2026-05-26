package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流履约信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 17:42:46
 */
public class ResaleDeliveryVO extends AlipayObject {

	private static final long serialVersionUID = 2868219719126781841L;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_bill_no")
	private String logisticsBillNo;

	/**
	 * 按照本文规范传入
https://opendocs.alipay.com/mini/07hva0?pathHash=5de3c48d
	 */
	@ApiField("logistics_platform")
	private String logisticsPlatform;

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

}
