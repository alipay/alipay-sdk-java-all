package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce更新项目组成员接口
 *
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class AnttechOceanbaseObglobalSfleadsmemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4431145865487766262L;

	/**
	 * 提供给SalesForce更新项目组成员入参
	 */
	@ApiField("salesforce_update_leads_member_request")
	private SaleForceLeadsMemberModifyDTO salesforceUpdateLeadsMemberRequest;

	public SaleForceLeadsMemberModifyDTO getSalesforceUpdateLeadsMemberRequest() {
		return this.salesforceUpdateLeadsMemberRequest;
	}
	public void setSalesforceUpdateLeadsMemberRequest(SaleForceLeadsMemberModifyDTO salesforceUpdateLeadsMemberRequest) {
		this.salesforceUpdateLeadsMemberRequest = salesforceUpdateLeadsMemberRequest;
	}

}
