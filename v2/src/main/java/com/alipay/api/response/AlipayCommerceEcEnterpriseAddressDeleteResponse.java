package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 10:07:49
 */
public class AlipayCommerceEcEnterpriseAddressDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4363232473762948885L;

	/** 
	 * null
	 */
	@ApiListField("fail_address_id_list")
	@ApiField("string")
	private List<String> failAddressIdList;

	public void setFailAddressIdList(List<String> failAddressIdList) {
		this.failAddressIdList = failAddressIdList;
	}
	public List<String> getFailAddressIdList( ) {
		return this.failAddressIdList;
	}

}
