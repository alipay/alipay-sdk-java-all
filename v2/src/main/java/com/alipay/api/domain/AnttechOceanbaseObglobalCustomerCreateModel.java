package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm创建客户
 *
 * @author auto create
 * @since 1.0, 2025-07-31 16:55:07
 */
public class AnttechOceanbaseObglobalCustomerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3258285574587514951L;

	/**
	 * 创建客户请求
	 */
	@ApiField("create_customer_request")
	private CreateCustomerRequest createCustomerRequest;

	public CreateCustomerRequest getCreateCustomerRequest() {
		return this.createCustomerRequest;
	}
	public void setCreateCustomerRequest(CreateCustomerRequest createCustomerRequest) {
		this.createCustomerRequest = createCustomerRequest;
	}

}
