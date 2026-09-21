package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AftersaleSimpleInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.aftersalepage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-16 15:12:54
 */
public class AlipayOpenMiniOrderAftersalepageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8764815487225222181L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("aftersale_simple_info_v_o")
	private List<AftersaleSimpleInfoVO> dataList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AftersaleSimpleInfoVO> dataList) {
		this.dataList = dataList;
	}
	public List<AftersaleSimpleInfoVO> getDataList( ) {
		return this.dataList;
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
