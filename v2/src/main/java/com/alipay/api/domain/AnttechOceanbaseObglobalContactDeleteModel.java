package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm联系人删除
 *
 * @author auto create
 * @since 1.0, 2023-10-17 17:14:30
 */
public class AnttechOceanbaseObglobalContactDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1218497291519822873L;

	/**
	 * 删除联系人请求
	 */
	@ApiField("delete_contact_request")
	private DeleteContactRequest deleteContactRequest;

	public DeleteContactRequest getDeleteContactRequest() {
		return this.deleteContactRequest;
	}
	public void setDeleteContactRequest(DeleteContactRequest deleteContactRequest) {
		this.deleteContactRequest = deleteContactRequest;
	}

}
