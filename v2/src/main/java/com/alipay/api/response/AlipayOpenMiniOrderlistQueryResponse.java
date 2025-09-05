package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleMiniOrderInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.orderlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-12 16:42:37
 */
public class AlipayOpenMiniOrderlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7561957718141111562L;

	/** 
	 * 订单列表
	 */
	@ApiListField("data_list")
	@ApiField("simple_mini_order_info_v_o")
	private List<SimpleMiniOrderInfoVO> dataList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<SimpleMiniOrderInfoVO> dataList) {
		this.dataList = dataList;
	}
	public List<SimpleMiniOrderInfoVO> getDataList( ) {
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
