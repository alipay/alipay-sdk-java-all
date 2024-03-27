package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RuleLimitContentExtDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.rulelimit.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-15 11:56:40
 */
public class AlipayCommerceMallRulelimitBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6813237882788692538L;

	/** 
	 * 商圈商场付多门店业务规则限制对象信息集合
	 */
	@ApiListField("limit_list")
	@ApiField("rule_limit_content_ext_d_t_o")
	private List<RuleLimitContentExtDTO> limitList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setLimitList(List<RuleLimitContentExtDTO> limitList) {
		this.limitList = limitList;
	}
	public List<RuleLimitContentExtDTO> getLimitList( ) {
		return this.limitList;
	}

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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
