package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 14:56:40
 */
public class DatadigitalFincloudFinsaasDesignPageBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3648954884159779151L;

	/** 
	 * 承载页列表
	 */
	@ApiListField("page_list")
	@ApiField("page_info_d_t_o")
	private List<PageInfoDTO> pageList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询总量
	 */
	@ApiField("total")
	private Long total;

	public void setPageList(List<PageInfoDTO> pageList) {
		this.pageList = pageList;
	}
	public List<PageInfoDTO> getPageList( ) {
		return this.pageList;
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
