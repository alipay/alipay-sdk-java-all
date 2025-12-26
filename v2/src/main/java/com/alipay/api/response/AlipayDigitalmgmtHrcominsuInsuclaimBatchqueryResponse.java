package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsuClaimVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-28 19:37:40
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6383368925482197888L;

	/** 
	 * current_page+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * insu_claim_vos+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("insu_claim_vos")
	@ApiField("insu_claim_vo")
	private List<InsuClaimVo> insuClaimVos;

	/** 
	 * page_size+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * total_count+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setInsuClaimVos(List<InsuClaimVo> insuClaimVos) {
		this.insuClaimVos = insuClaimVos;
	}
	public List<InsuClaimVo> getInsuClaimVos( ) {
		return this.insuClaimVos;
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
