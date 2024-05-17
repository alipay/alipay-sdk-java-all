package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Otp校验方法负责对象
 *
 * @author auto create
 * @since 1.0, 2020-03-31 13:47:58
 */
public class OpenApiResolutionMethod extends AlipayObject {

	private static final long serialVersionUID = 3852727116373429669L;

	/**
	 * Otp校验方法的标识
	 */
	@ApiField("identifier")
	private String identifier;

	/**
	 * Otp校验方法是否需要用户交互
	 */
	@ApiField("requires_user_interaction")
	private Boolean requiresUserInteraction;

	/**
	 * Otp校验方法类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * Otp校验方法的值
	 */
	@ApiField("value")
	private String value;

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Boolean getRequiresUserInteraction() {
		return this.requiresUserInteraction;
	}
	public void setRequiresUserInteraction(Boolean requiresUserInteraction) {
		this.requiresUserInteraction = requiresUserInteraction;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
