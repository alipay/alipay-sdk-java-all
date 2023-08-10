package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaasDatabaseHistorie;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 10:36:39
 */
public class AlipayCloudCloudbaseDatabaseTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8588182566469848547L;

	/** 
	 * 任务执行历史列表
	 */
	@ApiListField("histories")
	@ApiField("faas_database_historie")
	private List<FaasDatabaseHistorie> histories;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setHistories(List<FaasDatabaseHistorie> histories) {
		this.histories = histories;
	}
	public List<FaasDatabaseHistorie> getHistories( ) {
		return this.histories;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
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
