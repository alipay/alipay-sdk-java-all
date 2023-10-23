package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm修改客户
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:49:53
 */
public class AnttechOceanbaseObglobalCustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6868912551377635284L;

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
