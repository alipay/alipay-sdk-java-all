package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class LogisticsDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 7546755372587715694L;

	/**
	 * 物流类型, POST 平邮, EXPRESS 其他快递, VIRTUAL 虚拟物品, EMS EMS, DIRECT 无需物流
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
