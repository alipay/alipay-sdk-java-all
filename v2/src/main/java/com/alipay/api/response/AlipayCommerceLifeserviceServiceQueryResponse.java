package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 16:52:42
 */
public class AlipayCommerceLifeserviceServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8182324652787754983L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("service_infos")
	@ApiField("life_service_service_info")
	private List<LifeServiceServiceInfo> serviceInfos;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setServiceInfos(List<LifeServiceServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;
	}
	public List<LifeServiceServiceInfo> getServiceInfos( ) {
		return this.serviceInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
