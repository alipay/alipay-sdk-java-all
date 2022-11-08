package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InteractiveServiceRecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.interactiverecord.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-28 10:41:52
 */
public class AlipaySecurityDataInteractiverecordListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8611331344629244468L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 用户交互记录
	 */
	@ApiListField("interact_records")
	@ApiField("interactive_service_record_detail")
	private List<InteractiveServiceRecordDetail> interactRecords;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setInteractRecords(List<InteractiveServiceRecordDetail> interactRecords) {
		this.interactRecords = interactRecords;
	}
	public List<InteractiveServiceRecordDetail> getInteractRecords( ) {
		return this.interactRecords;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
