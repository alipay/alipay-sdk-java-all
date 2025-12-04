package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询bd名下海图客户信息
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class AnttechOceanbaseObglobalCustomerbyownerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6625299896292621679L;

	/**
	 * 请求参数
	 */
	@ApiField("query_customer_by_bd_work_no_request")
	private QueryCustomerByBdWorkNoRequest queryCustomerByBdWorkNoRequest;

	public QueryCustomerByBdWorkNoRequest getQueryCustomerByBdWorkNoRequest() {
		return this.queryCustomerByBdWorkNoRequest;
	}
	public void setQueryCustomerByBdWorkNoRequest(QueryCustomerByBdWorkNoRequest queryCustomerByBdWorkNoRequest) {
		this.queryCustomerByBdWorkNoRequest = queryCustomerByBdWorkNoRequest;
	}

}
