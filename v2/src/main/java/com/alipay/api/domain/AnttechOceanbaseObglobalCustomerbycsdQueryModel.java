package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询csd名下海图客户信息
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:42:57
 */
public class AnttechOceanbaseObglobalCustomerbycsdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8476111814239768919L;

	/**
	 * 请求参数
	 */
	@ApiField("query_customer_by_csd_work_no_request")
	private QueryCustomerByCsdWorkNoReq queryCustomerByCsdWorkNoRequest;

	public QueryCustomerByCsdWorkNoReq getQueryCustomerByCsdWorkNoRequest() {
		return this.queryCustomerByCsdWorkNoRequest;
	}
	public void setQueryCustomerByCsdWorkNoRequest(QueryCustomerByCsdWorkNoReq queryCustomerByCsdWorkNoRequest) {
		this.queryCustomerByCsdWorkNoRequest = queryCustomerByCsdWorkNoRequest;
	}

}
