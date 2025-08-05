package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcsignSealOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.seal.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignSealBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6479772264533955415L;

	/** 
	 * 页，默认1，必须要大于0。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页面大小，默认200。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 用印列表
	 */
	@ApiListField("seal_list")
	@ApiField("ecsign_seal_open_v_o")
	private List<EcsignSealOpenVO> sealList;

	/** 
	 * 列表记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSealList(List<EcsignSealOpenVO> sealList) {
		this.sealList = sealList;
	}
	public List<EcsignSealOpenVO> getSealList( ) {
		return this.sealList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
