package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NotifyRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.notifyrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 09:47:41
 */
public class AlipayIserviceCcmCrmNotifyrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3381824718867627578L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 通知发送记录
	 */
	@ApiListField("notify_record_list")
	@ApiField("notify_record")
	private List<NotifyRecord> notifyRecordList;

	/** 
	 * 每页的项目数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setNotifyRecordList(List<NotifyRecord> notifyRecordList) {
		this.notifyRecordList = notifyRecordList;
	}
	public List<NotifyRecord> getNotifyRecordList( ) {
		return this.notifyRecordList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
