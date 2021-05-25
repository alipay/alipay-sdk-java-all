package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppServiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.operation.appservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-08 13:46:19
 */
public class AlipayOpenMiniOperationAppserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4294463389262355165L;

	/** 
	 * 子服务列表
	 */
	@ApiListField("data_list")
	@ApiField("app_service_result")
	private List<AppServiceResult> dataList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 该应用子服务总数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AppServiceResult> dataList) {
		this.dataList = dataList;
	}
	public List<AppServiceResult> getDataList( ) {
		return this.dataList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
