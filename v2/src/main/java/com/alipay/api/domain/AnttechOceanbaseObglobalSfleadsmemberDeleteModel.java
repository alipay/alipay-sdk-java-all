package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce删除项目组成员接口
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:31
 */
public class AnttechOceanbaseObglobalSfleadsmemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3197627654688444678L;

	/**
	 * 提供给SalesForce删除项目组成员入参
	 */
	@ApiField("salesforce_delete_leads_member_request")
	private SaleForceLeadsMemberDeleteDTO salesforceDeleteLeadsMemberRequest;

	public SaleForceLeadsMemberDeleteDTO getSalesforceDeleteLeadsMemberRequest() {
		return this.salesforceDeleteLeadsMemberRequest;
	}
	public void setSalesforceDeleteLeadsMemberRequest(SaleForceLeadsMemberDeleteDTO salesforceDeleteLeadsMemberRequest) {
		this.salesforceDeleteLeadsMemberRequest = salesforceDeleteLeadsMemberRequest;
	}

}
