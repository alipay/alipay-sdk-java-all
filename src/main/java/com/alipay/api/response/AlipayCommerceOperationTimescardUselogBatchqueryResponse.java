package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TimeCardUseLogRecordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.uselog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-30 21:13:49
 */
public class AlipayCommerceOperationTimescardUselogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3141425651275518619L;

	/** 
	 * 次卡使用记录
	 */
	@ApiListField("datas")
	@ApiField("time_card_use_log_record_info")
	private List<TimeCardUseLogRecordInfo> datas;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页size
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页总的记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDatas(List<TimeCardUseLogRecordInfo> datas) {
		this.datas = datas;
	}
	public List<TimeCardUseLogRecordInfo> getDatas( ) {
		return this.datas;
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
