package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * salesforce新增项目组成员
 *
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class AnttechOceanbaseObglobalSfleadsmemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5433849657585159937L;

	/**
	 * 提供给SalesForce创建项目组成员入参
	 */
	@ApiField("salesforce_create_leads_member_request")
	private SaleForceLeadsMemberCreateDTO salesforceCreateLeadsMemberRequest;

	public SaleForceLeadsMemberCreateDTO getSalesforceCreateLeadsMemberRequest() {
		return this.salesforceCreateLeadsMemberRequest;
	}
	public void setSalesforceCreateLeadsMemberRequest(SaleForceLeadsMemberCreateDTO salesforceCreateLeadsMemberRequest) {
		this.salesforceCreateLeadsMemberRequest = salesforceCreateLeadsMemberRequest;
	}

}
