package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrgOperationalAggregate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insitution.service.settle response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:41
 */
public class AlipayCommerceMedicalInsitutionServiceSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 3876513887442751428L;

	/** 
	 * null
	 */
	@ApiListField("org_operational_aggregate_list")
	@ApiField("org_operational_aggregate")
	private List<OrgOperationalAggregate> orgOperationalAggregateList;

	public void setOrgOperationalAggregateList(List<OrgOperationalAggregate> orgOperationalAggregateList) {
		this.orgOperationalAggregateList = orgOperationalAggregateList;
	}
	public List<OrgOperationalAggregate> getOrgOperationalAggregateList( ) {
		return this.orgOperationalAggregateList;
	}

}
