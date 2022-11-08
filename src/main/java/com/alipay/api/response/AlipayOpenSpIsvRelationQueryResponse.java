package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotionRelationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-31 14:50:11
 */
public class AlipayOpenSpIsvRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4653732417326181242L;

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
	@ApiField("promotion_relation_d_t_o")
	private List<PromotionRelationDTO> promotionRelations;

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

	public void setPromotionRelations(List<PromotionRelationDTO> promotionRelations) {
		this.promotionRelations = promotionRelations;
	}
	public List<PromotionRelationDTO> getPromotionRelations( ) {
		return this.promotionRelations;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
