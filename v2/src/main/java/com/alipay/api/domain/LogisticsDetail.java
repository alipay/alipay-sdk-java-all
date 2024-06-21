package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2023-07-12 11:32:25
 */
public class LogisticsDetail extends AlipayObject {

	private static final long serialVersionUID = 1759575147128549637L;

	/**
	 * 物流类型
	 */
	@ApiField("logistics_type")
	private String logisticsType;

	public String getLogisticsType() {
		return this.logisticsType;
	}
	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

}
