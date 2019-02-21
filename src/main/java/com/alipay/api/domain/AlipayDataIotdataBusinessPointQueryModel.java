package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务点位查询
 *
 * @author auto create
 * @since 1.0, 2019-01-23 11:54:09
 */
public class AlipayDataIotdataBusinessPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7895583674866656346L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

}
