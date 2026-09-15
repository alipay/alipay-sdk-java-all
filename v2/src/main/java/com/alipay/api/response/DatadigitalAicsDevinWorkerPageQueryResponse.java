package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkerItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.worker.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:08
 */
public class DatadigitalAicsDevinWorkerPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1742355982857189477L;

	/** 
	 * 当前页码
	 */
	@ApiField("current")
	private Long current;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("worker_item")
	private List<WorkerItem> data;

	/** 
	 * 总分页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCurrent( ) {
		return this.current;
	}

	public void setData(List<WorkerItem> data) {
		this.data = data;
	}
	public List<WorkerItem> getData( ) {
		return this.data;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
