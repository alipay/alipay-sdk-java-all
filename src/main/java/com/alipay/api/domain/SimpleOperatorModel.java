package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员简单模型，包含操作员id，操作员类型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:59
 */
public class SimpleOperatorModel extends AlipayObject {

	private static final long serialVersionUID = 6366249463246782653L;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员类型，只区分收银员和非收银员
收银员为“RESTRICTED_CASHIER”，非收银员为“STANDARD_NORMAL”
	 */
	@ApiField("operator_type")
	private String operatorType;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
