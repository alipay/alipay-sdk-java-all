package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.accountstatus.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 14:42:50
 */
public class AlipayCommerceLifeserviceAccountstatusBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5162239327654975799L;

	/** 
	 * null
	 */
	@ApiListField("life_service_account_list")
	@ApiField("life_service_account_info")
	private List<LifeServiceAccountInfo> lifeServiceAccountList;

	public void setLifeServiceAccountList(List<LifeServiceAccountInfo> lifeServiceAccountList) {
		this.lifeServiceAccountList = lifeServiceAccountList;
	}
	public List<LifeServiceAccountInfo> getLifeServiceAccountList( ) {
		return this.lifeServiceAccountList;
	}

}
