package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广人群定向曝光规则
 *
 * @author auto create
 * @since 1.0, 2023-08-18 14:50:58
 */
public class DeliveryCrowdRule extends AlipayObject {

	private static final long serialVersionUID = 1791222457959279969L;

	/**
	 * 指定人群ID
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

}
