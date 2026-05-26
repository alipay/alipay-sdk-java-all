package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceTechnicianInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.technician.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 13:42:44
 */
public class AlipayCommerceLifeserviceTechnicianQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3696822411714996799L;

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
	@ApiListField("technician_infos")
	@ApiField("life_service_technician_info")
	private List<LifeServiceTechnicianInfo> technicianInfos;

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

	public void setTechnicianInfos(List<LifeServiceTechnicianInfo> technicianInfos) {
		this.technicianInfos = technicianInfos;
	}
	public List<LifeServiceTechnicianInfo> getTechnicianInfos( ) {
		return this.technicianInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
