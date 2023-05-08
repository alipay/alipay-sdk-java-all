package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TimeCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.instance.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:32:00
 */
public class AlipayCommerceOperationTimescardInstanceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7416749994581869311L;

	/** 
	 * 卡实例列表
	 */
	@ApiListField("datas")
	@ApiField("time_card_info")
	private List<TimeCardInfo> datas;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页size
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDatas(List<TimeCardInfo> datas) {
		this.datas = datas;
	}
	public List<TimeCardInfo> getDatas( ) {
		return this.datas;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
