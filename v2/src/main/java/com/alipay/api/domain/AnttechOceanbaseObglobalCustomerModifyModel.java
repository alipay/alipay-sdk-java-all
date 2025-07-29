package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm修改客户
 *
 * @author auto create
 * @since 1.0, 2025-03-03 14:53:54
 */
public class AnttechOceanbaseObglobalCustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2223115286179273869L;

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
