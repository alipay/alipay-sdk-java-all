package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce更新商机接口
 *
 * @author auto create
 * @since 1.0, 2026-10-14 18:17:59
 */
public class AnttechOceanbaseObglobalSfleadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5436199136677181872L;

	/**
	 * 提供给saleforce更新商机接口的入参
	 */
	@ApiField("salesforce_update_leads_request")
	private SaleForceUpdateLeadsParams salesforceUpdateLeadsRequest;

	public SaleForceUpdateLeadsParams getSalesforceUpdateLeadsRequest() {
		return this.salesforceUpdateLeadsRequest;
	}
	public void setSalesforceUpdateLeadsRequest(SaleForceUpdateLeadsParams salesforceUpdateLeadsRequest) {
		this.salesforceUpdateLeadsRequest = salesforceUpdateLeadsRequest;
	}

}
