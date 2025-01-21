package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作人信息
 *
 * @author auto create
 * @since 1.0, 2017-10-10 18:45:21
 */
public class PromoOperatorInfo extends AlipayObject {

	private static final long serialVersionUID = 3736269382826266979L;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型。SALES：口碑内部小二；MER：商户；MER_OPERATOR：商户员工；PROVIDER：服务商；PROVIDER_STAFF：服务商员工；
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
