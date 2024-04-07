package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm联系人创建
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:48:02
 */
public class AnttechOceanbaseObglobalContactCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6555415775223448478L;

	/**
	 * 创建联系人请求
	 */
	@ApiField("create_contact_request")
	private CreateContactRequest createContactRequest;

	public CreateContactRequest getCreateContactRequest() {
		return this.createContactRequest;
	}
	public void setCreateContactRequest(CreateContactRequest createContactRequest) {
		this.createContactRequest = createContactRequest;
	}

}
