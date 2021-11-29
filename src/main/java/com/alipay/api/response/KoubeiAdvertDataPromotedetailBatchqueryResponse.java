package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoteDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotedetail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDataPromotedetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3495537275143415881L;

	/** 
	 * 业务数据
	 */
	@ApiListField("data")
	@ApiField("promote_detail_model")
	private List<PromoteDetailModel> data;

	/** 
	 * 当前页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setData(List<PromoteDetailModel> data) {
		this.data = data;
	}
	public List<PromoteDetailModel> getData( ) {
		return this.data;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
