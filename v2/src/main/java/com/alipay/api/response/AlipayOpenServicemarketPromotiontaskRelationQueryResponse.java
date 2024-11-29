package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotionTaskRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.promotiontask.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 11:42:05
 */
public class AlipayOpenServicemarketPromotiontaskRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6338467424789279676L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 推广服务商信息列表
	 */
	@ApiListField("promotion_relations")
	@ApiField("promotion_task_relation")
	private List<PromotionTaskRelation> promotionRelations;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPromotionRelations(List<PromotionTaskRelation> promotionRelations) {
		this.promotionRelations = promotionRelations;
	}
	public List<PromotionTaskRelation> getPromotionRelations( ) {
		return this.promotionRelations;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
