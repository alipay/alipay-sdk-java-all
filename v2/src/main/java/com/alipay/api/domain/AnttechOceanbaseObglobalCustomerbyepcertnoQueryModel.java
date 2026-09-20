package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据统一社会信用代码批量查询客户信息
 *
 * @author auto create
 * @since 1.0, 2026-09-02 10:27:52
 */
public class AnttechOceanbaseObglobalCustomerbyepcertnoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2561872223534859375L;

	/**
	 * 查询请求参数
	 */
	@ApiField("query_customer_by_ep_cert_no_request")
	private QueryCustomerByEpCertNoRequest queryCustomerByEpCertNoRequest;

	public QueryCustomerByEpCertNoRequest getQueryCustomerByEpCertNoRequest() {
		return this.queryCustomerByEpCertNoRequest;
	}
	public void setQueryCustomerByEpCertNoRequest(QueryCustomerByEpCertNoRequest queryCustomerByEpCertNoRequest) {
		this.queryCustomerByEpCertNoRequest = queryCustomerByEpCertNoRequest;
	}

}
