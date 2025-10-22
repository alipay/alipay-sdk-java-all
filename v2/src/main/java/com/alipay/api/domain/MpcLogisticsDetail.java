package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流详情
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:20
 */
public class MpcLogisticsDetail extends AlipayObject {

	private static final long serialVersionUID = 2212167921685946666L;

	/**
	 * 物流发生时间
	 */
	@ApiField("occur_time")
	private String occurTime;

	/**
	 * 物流描述信息
	 */
	@ApiField("stand_desc")
	private String standDesc;

	public String getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(String occurTime) {
		this.occurTime = occurTime;
	}

	public String getStandDesc() {
		return this.standDesc;
	}
	public void setStandDesc(String standDesc) {
		this.standDesc = standDesc;
	}

}
