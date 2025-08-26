package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleProductDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 16:27:34
 */
public class AlipayCommerceRecycleProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6313542321443385255L;

	/** 
	 * 商品数据
	 */
	@ApiListField("content")
	@ApiField("recycle_product_d_t_o")
	private List<RecycleProductDTO> content;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setContent(List<RecycleProductDTO> content) {
		this.content = content;
	}
	public List<RecycleProductDTO> getContent( ) {
		return this.content;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
