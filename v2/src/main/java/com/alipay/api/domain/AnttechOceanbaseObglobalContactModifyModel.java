package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm联系人修改
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:48:55
 */
public class AnttechOceanbaseObglobalContactModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3534929367875631879L;

	/**
	 * 修改联系人请求
	 */
	@ApiField("update_contact_request")
	private UpdateContactRequest updateContactRequest;

	public UpdateContactRequest getUpdateContactRequest() {
		return this.updateContactRequest;
	}
	public void setUpdateContactRequest(UpdateContactRequest updateContactRequest) {
		this.updateContactRequest = updateContactRequest;
	}

}
