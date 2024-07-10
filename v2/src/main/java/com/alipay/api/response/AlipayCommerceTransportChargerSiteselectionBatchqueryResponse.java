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
 * @since 1.0, 2024-06-24 10:32:05
 */
public class AlipayCommerceTransportChargerSiteselectionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6612184378746978449L;

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
