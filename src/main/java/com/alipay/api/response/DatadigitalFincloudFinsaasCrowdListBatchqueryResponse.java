package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CrowdInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.list.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-27 21:21:44
 */
public class DatadigitalFincloudFinsaasCrowdListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3432623198253122425L;

	/** 
	 * 人群信息列表
	 */
	@ApiListField("crowd_list")
	@ApiField("crowd_info_d_t_o")
	private List<CrowdInfoDTO> crowdList;

	/** 
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 人群总数
	 */
	@ApiField("total")
	private Long total;

	public void setCrowdList(List<CrowdInfoDTO> crowdList) {
		this.crowdList = crowdList;
	}
	public List<CrowdInfoDTO> getCrowdList( ) {
		return this.crowdList;
	}

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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
