package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 16:34:23
 */
public class BizUnitInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6697329343558853339L;

	/**
	 * 店铺ID
	 */
	@ApiField("biz_unit_id")
	private String bizUnitId;

	public String getBizUnitId() {
		return this.bizUnitId;
	}
	public void setBizUnitId(String bizUnitId) {
		this.bizUnitId = bizUnitId;
	}

}
