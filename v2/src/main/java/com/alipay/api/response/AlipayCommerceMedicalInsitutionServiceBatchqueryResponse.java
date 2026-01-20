package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrgOperationalAggregateItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insitution.service.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 15:20:58
 */
public class AlipayCommerceMedicalInsitutionServiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3891665523136331279L;

	/** 
	 * null
	 */
	@ApiListField("org_operational_metric_list")
	@ApiField("org_operational_aggregate_item")
	private List<OrgOperationalAggregateItem> orgOperationalMetricList;

	public void setOrgOperationalMetricList(List<OrgOperationalAggregateItem> orgOperationalMetricList) {
		this.orgOperationalMetricList = orgOperationalMetricList;
	}
	public List<OrgOperationalAggregateItem> getOrgOperationalMetricList( ) {
		return this.orgOperationalMetricList;
	}

}
