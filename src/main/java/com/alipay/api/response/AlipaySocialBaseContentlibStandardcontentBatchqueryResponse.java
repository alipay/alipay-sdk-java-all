package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SourceContentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-22 15:42:48
 */
public class AlipaySocialBaseContentlibStandardcontentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6774552431582584494L;

	/** 
	 * 内容详情列表
	 */
	@ApiListField("content_details")
	@ApiField("source_content_info")
	private List<SourceContentInfo> contentDetails;

	/** 
	 * 内容ID列表
	 */
	@ApiListField("content_ids")
	@ApiField("string")
	private List<String> contentIds;

	/** 
	 * 当前分页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setContentDetails(List<SourceContentInfo> contentDetails) {
		this.contentDetails = contentDetails;
	}
	public List<SourceContentInfo> getContentDetails( ) {
		return this.contentDetails;
	}

	public void setContentIds(List<String> contentIds) {
		this.contentIds = contentIds;
	}
	public List<String> getContentIds( ) {
		return this.contentIds;
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
