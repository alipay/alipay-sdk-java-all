package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointInstruction;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.pointinstruction.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 16:52:07
 */
public class AlipayCommerceYuntaskPointinstructionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6642681576313382621L;

	/** 
	 * 积分流水信息
	 */
	@ApiListField("data")
	@ApiField("point_instruction")
	private List<PointInstruction> data;

	/** 
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页面大小，单位个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数，单位个
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setData(List<PointInstruction> data) {
		this.data = data;
	}
	public List<PointInstruction> getData( ) {
		return this.data;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
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
