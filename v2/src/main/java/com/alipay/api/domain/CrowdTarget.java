package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群目标账户
 *
 * @author auto create
 * @since 1.0, 2023-02-28 17:17:55
 */
public class CrowdTarget extends AlipayObject {

	private static final long serialVersionUID = 6455767496291982531L;

	/**
	 * 目标用户id，如淘宝userid
	 */
	@ApiField("target")
	private String target;

	/**
	 * 目标账户类型，需要和人群类型保持一致
	 */
	@ApiField("target_type")
	private String targetType;

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
