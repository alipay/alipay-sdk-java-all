package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppBaseInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 17:11:45
 */
public class AlipayOpenMiniInnerappBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2571653857662614794L;

	/** 
	 * 小程序基础信息列表
	 */
	@ApiListField("mini_app_base_info_response_list")
	@ApiField("mini_app_base_info_response")
	private List<MiniAppBaseInfoResponse> miniAppBaseInfoResponseList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总量
	 */
	@ApiField("total")
	private Long total;

	public void setMiniAppBaseInfoResponseList(List<MiniAppBaseInfoResponse> miniAppBaseInfoResponseList) {
		this.miniAppBaseInfoResponseList = miniAppBaseInfoResponseList;
	}
	public List<MiniAppBaseInfoResponse> getMiniAppBaseInfoResponseList( ) {
		return this.miniAppBaseInfoResponseList;
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
