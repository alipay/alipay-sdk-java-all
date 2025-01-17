package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:15
 */
public class AlipayOpenMiniInnerappServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8315689651662794132L;

	/** 
	 * 小程序服务信息
	 */
	@ApiListField("mini_app_service_info_list")
	@ApiField("mini_app_service_info")
	private List<MiniAppServiceInfo> miniAppServiceInfoList;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMiniAppServiceInfoList(List<MiniAppServiceInfo> miniAppServiceInfoList) {
		this.miniAppServiceInfoList = miniAppServiceInfoList;
	}
	public List<MiniAppServiceInfo> getMiniAppServiceInfoList( ) {
		return this.miniAppServiceInfoList;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
