package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessBillGoodsQueryPageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.businessbill.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-15 14:37:29
 */
public class AlipayMarketingBusinessbillGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3819822454713574432L;

	/** 
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 经营收款单商品查询模型
	 */
	@ApiListField("result_list")
	@ApiField("business_bill_goods_query_page_v_o")
	private List<BusinessBillGoodsQueryPageVO> resultList;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总条目数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setResultList(List<BusinessBillGoodsQueryPageVO> resultList) {
		this.resultList = resultList;
	}
	public List<BusinessBillGoodsQueryPageVO> getResultList( ) {
		return this.resultList;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
