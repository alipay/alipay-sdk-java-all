package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询员工在职状态接口
 *
 * @author auto create
 * @since 1.0, 2023-10-18 19:10:17
 */
public class AnttechOceanbaseObglobalCrmworkstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8275421197829285752L;

	/**
	 * 参数必填
	 */
	@ApiField("crm_query_worker_suspended_status_request")
	private String crmQueryWorkerSuspendedStatusRequest;

	public String getCrmQueryWorkerSuspendedStatusRequest() {
		return this.crmQueryWorkerSuspendedStatusRequest;
	}
	public void setCrmQueryWorkerSuspendedStatusRequest(String crmQueryWorkerSuspendedStatusRequest) {
		this.crmQueryWorkerSuspendedStatusRequest = crmQueryWorkerSuspendedStatusRequest;
	}

}
