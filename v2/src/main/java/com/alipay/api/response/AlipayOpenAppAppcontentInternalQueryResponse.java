package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.internal.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-27 11:22:40
 */
public class AlipayOpenAppAppcontentInternalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612923267356764689L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 服务列表
	 */
	@ApiListField("service_list")
	@ApiField("service_info")
	private List<ServiceInfo> serviceList;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private String total;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setServiceList(List<ServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}
	public List<ServiceInfo> getServiceList( ) {
		return this.serviceList;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
