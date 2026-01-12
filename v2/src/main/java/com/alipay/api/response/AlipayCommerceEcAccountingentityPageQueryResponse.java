package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountingEntityInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.accountingentity.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 09:42:29
 */
public class AlipayCommerceEcAccountingentityPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3364231492973223785L;

	/** 
	 * 核算主体列表
	 */
	@ApiListField("accounting_entity_list")
	@ApiField("accounting_entity_info_d_t_o")
	private List<AccountingEntityInfoDTO> accountingEntityList;

	/** 
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 核算主体总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setAccountingEntityList(List<AccountingEntityInfoDTO> accountingEntityList) {
		this.accountingEntityList = accountingEntityList;
	}
	public List<AccountingEntityInfoDTO> getAccountingEntityList( ) {
		return this.accountingEntityList;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
