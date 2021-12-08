package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StandardServiceBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 21:00:30
 */
public class AlipayOpenAppServiceListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3576628294157625333L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 服务列表
	 */
	@ApiListField("records")
	@ApiField("standard_service_base_info")
	private List<StandardServiceBaseInfo> records;

	/** 
	 * 总记录数
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

	public void setRecords(List<StandardServiceBaseInfo> records) {
		this.records = records;
	}
	public List<StandardServiceBaseInfo> getRecords( ) {
		return this.records;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
