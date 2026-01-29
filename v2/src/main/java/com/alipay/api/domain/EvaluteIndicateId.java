package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评估指标id模型
 *
 * @author auto create
 * @since 1.0, 2024-03-07 18:08:16
 */
public class EvaluteIndicateId extends AlipayObject {

	private static final long serialVersionUID = 3256393524243279927L;

	/**
	 * 商户指标id
	 */
	@ApiField("isv_indicate_id")
	private String isvIndicateId;

	public String getIsvIndicateId() {
		return this.isvIndicateId;
	}
	public void setIsvIndicateId(String isvIndicateId) {
		this.isvIndicateId = isvIndicateId;
	}

}
