package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用主体信息
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:04:15
 */
public class TargetInfo extends AlipayObject {

	private static final long serialVersionUID = 7481815436865292194L;

	/**
	 * 应用id，例如小程序id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 应用类型
小程序传入：APPID
生活号传入：PUBLICID
	 */
	@ApiField("target_type")
	private String targetType;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
