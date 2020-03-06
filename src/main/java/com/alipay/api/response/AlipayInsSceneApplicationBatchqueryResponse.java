package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsApplicationQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:08
 */
public class AlipayInsSceneApplicationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2341246393392316811L;

	/** 
	 * 投保单列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application_query")
	private List<InsApplicationQuery> applications;

	public void setApplications(List<InsApplicationQuery> applications) {
		this.applications = applications;
	}
	public List<InsApplicationQuery> getApplications( ) {
		return this.applications;
	}

}
