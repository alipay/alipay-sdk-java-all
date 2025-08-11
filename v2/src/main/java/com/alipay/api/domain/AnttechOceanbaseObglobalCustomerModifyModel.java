package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm修改客户
 *
 * @author auto create
 * @since 1.0, 2025-07-31 16:55:05
 */
public class AnttechOceanbaseObglobalCustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2144145572174679668L;

	/**
	 * 修改客户请求
	 */
	@ApiField("update_customer_request")
	private UpdateCustomerRequest updateCustomerRequest;

	public UpdateCustomerRequest getUpdateCustomerRequest() {
		return this.updateCustomerRequest;
	}
	public void setUpdateCustomerRequest(UpdateCustomerRequest updateCustomerRequest) {
		this.updateCustomerRequest = updateCustomerRequest;
	}

}
