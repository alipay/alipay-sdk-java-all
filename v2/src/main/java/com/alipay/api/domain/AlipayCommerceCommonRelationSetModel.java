package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团长支心客关系配置接口
 *
 * @author auto create
 * @since 1.0, 2023-12-05 11:25:33
 */
public class AlipayCommerceCommonRelationSetModel extends AlipayObject {

	private static final long serialVersionUID = 5293973543952516243L;

	/**
	 * 支心客的userId
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 支心客的openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 操作的类型
	 */
	@ApiField("operation_type")
	private String operationType;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
