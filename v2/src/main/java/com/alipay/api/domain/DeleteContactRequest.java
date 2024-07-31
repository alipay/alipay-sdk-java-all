package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * DeleteContactRequest
 *
 * @author auto create
 * @since 1.0, 2023-10-17 17:14:30
 */
public class DeleteContactRequest extends AlipayObject {

	private static final long serialVersionUID = 7628868643194187753L;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
