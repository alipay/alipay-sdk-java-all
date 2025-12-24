package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceRelatedItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.resource.url.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 17:18:15
 */
public class AlipayInsCooperationResourceUrlBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8858355473519243264L;

	/** 
	 * 资源项列表
	 */
	@ApiListField("resource_items")
	@ApiField("resource_related_item")
	private List<ResourceRelatedItem> resourceItems;

	/** 
	 * 响应时间
	 */
	@ApiField("response_time")
	private Date responseTime;

	/** 
	 * 结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setResourceItems(List<ResourceRelatedItem> resourceItems) {
		this.resourceItems = resourceItems;
	}
	public List<ResourceRelatedItem> getResourceItems( ) {
		return this.resourceItems;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public Date getResponseTime( ) {
		return this.responseTime;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
