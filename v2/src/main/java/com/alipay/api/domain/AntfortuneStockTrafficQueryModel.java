package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构流量分布查询
 *
 * @author auto create
 * @since 1.0, 2024-09-14 17:37:37
 */
public class AntfortuneStockTrafficQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4488412842323698692L;

	/**
	 * 机构标志
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 目标系统
	 */
	@ApiField("traffic_code")
	private String trafficCode;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getTrafficCode() {
		return this.trafficCode;
	}
	public void setTrafficCode(String trafficCode) {
		this.trafficCode = trafficCode;
	}

}
