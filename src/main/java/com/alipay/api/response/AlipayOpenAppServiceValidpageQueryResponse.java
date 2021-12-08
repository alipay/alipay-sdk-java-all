package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceBase;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.validpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-18 16:47:28
 */
public class AlipayOpenAppServiceValidpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7877192442286129197L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页显示多少条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 服务基础信息
	 */
	@ApiListField("service_list")
	@ApiField("service_base")
	private List<ServiceBase> serviceList;

	/** 
	 * 记录总条数
	 */
	@ApiField("total")
	private Long total;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setServiceList(List<ServiceBase> serviceList) {
		this.serviceList = serviceList;
	}
	public List<ServiceBase> getServiceList( ) {
		return this.serviceList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
