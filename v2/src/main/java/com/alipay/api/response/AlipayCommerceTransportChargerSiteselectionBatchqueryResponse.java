package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SiteSelectionTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.siteselection.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:31
 */
public class AlipayCommerceTransportChargerSiteselectionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1649182252312733232L;

	/** 
	 * 任务列表
	 */
	@ApiListField("tasks")
	@ApiField("site_selection_task")
	private List<SiteSelectionTask> tasks;

	public void setTasks(List<SiteSelectionTask> tasks) {
		this.tasks = tasks;
	}
	public List<SiteSelectionTask> getTasks( ) {
		return this.tasks;
	}

}
