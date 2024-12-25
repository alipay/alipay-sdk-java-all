package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C租房智能体合同信息更新
 *
 * @author auto create
 * @since 1.0, 2024-10-23 19:47:40
 */
public class AlipayCloudCloudpromoContractFormInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1873738976512633376L;

	/**
	 * 用户主体id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 三方小程序id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
