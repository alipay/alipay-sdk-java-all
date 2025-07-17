package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.securedomain.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:00:02
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1275227667762973888L;

	/** 
	 * 安全域名列表
	 */
	@ApiListField("secure_domain_list")
	@ApiField("string")
	private List<String> secureDomainList;

	public void setSecureDomainList(List<String> secureDomainList) {
		this.secureDomainList = secureDomainList;
	}
	public List<String> getSecureDomainList( ) {
		return this.secureDomainList;
	}

}
