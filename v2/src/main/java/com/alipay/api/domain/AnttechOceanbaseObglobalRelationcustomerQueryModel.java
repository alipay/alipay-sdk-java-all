package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询海图关联客户
 *
 * @author auto create
 * @since 1.0, 2025-11-12 15:47:41
 */
public class AnttechOceanbaseObglobalRelationcustomerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6328314262277583146L;

	/**
	 * null
	 */
	@ApiListField("query_customer_and_leads_by_uid_request")
	@ApiField("query_customer_and_leads_by_uid_request")
	private List<QueryCustomerAndLeadsByUidRequest> queryCustomerAndLeadsByUidRequest;

	public List<QueryCustomerAndLeadsByUidRequest> getQueryCustomerAndLeadsByUidRequest() {
		return this.queryCustomerAndLeadsByUidRequest;
	}
	public void setQueryCustomerAndLeadsByUidRequest(List<QueryCustomerAndLeadsByUidRequest> queryCustomerAndLeadsByUidRequest) {
		this.queryCustomerAndLeadsByUidRequest = queryCustomerAndLeadsByUidRequest;
	}

}
