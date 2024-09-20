package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm创建客户
 *
 * @author auto create
 * @since 1.0, 2024-06-03 16:37:53
 */
public class AnttechOceanbaseObglobalCustomerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5394696123841422244L;

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
