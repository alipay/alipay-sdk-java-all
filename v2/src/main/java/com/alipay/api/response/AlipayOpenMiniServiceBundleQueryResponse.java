package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiBundleAppServiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.service.bundle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:28:25
 */
public class AlipayOpenMiniServiceBundleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3814855586666975468L;

	/** 
	 * 子服务信息
	 */
	@ApiListField("data_list")
	@ApiField("multi_bundle_app_service_result")
	private List<MultiBundleAppServiceResult> dataList;

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
	 * 数据总数量
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<MultiBundleAppServiceResult> dataList) {
		this.dataList = dataList;
	}
	public List<MultiBundleAppServiceResult> getDataList( ) {
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
