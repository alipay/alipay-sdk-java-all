package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同同步返回结果
 *
 * @author auto create
 * @since 1.0, 2025-09-22 13:37:56
 */
public class ContractSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 6488629723529697454L;

	/**
	 * 合同中心受理id
	 */
	@ApiField("accept_id")
	private String acceptId;

	public String getAcceptId() {
		return this.acceptId;
	}
	public void setAcceptId(String acceptId) {
		this.acceptId = acceptId;
	}

}
