package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce创建商机接口
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:25:55
 */
public class AnttechOceanbaseObglobalSfleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2628538381187716334L;

	/**
	 * 提供给saleforce创建商机接口的入参
	 */
	@ApiField("salesforce_create_leads_request")
	private SaleForceCreateLeadsParams salesforceCreateLeadsRequest;

	public SaleForceCreateLeadsParams getSalesforceCreateLeadsRequest() {
		return this.salesforceCreateLeadsRequest;
	}
	public void setSalesforceCreateLeadsRequest(SaleForceCreateLeadsParams salesforceCreateLeadsRequest) {
		this.salesforceCreateLeadsRequest = salesforceCreateLeadsRequest;
	}

}
