package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WebhookBind;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:23
 */
public class AlipayCloudCloudbaseMonitorWebhookbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6676339992487478948L;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * webhook 绑定信息
	 */
	@ApiListField("webhook_binds")
	@ApiField("webhook_bind")
	private List<WebhookBind> webhookBinds;

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setWebhookBinds(List<WebhookBind> webhookBinds) {
		this.webhookBinds = webhookBinds;
	}
	public List<WebhookBind> getWebhookBinds( ) {
		return this.webhookBinds;
	}

}
