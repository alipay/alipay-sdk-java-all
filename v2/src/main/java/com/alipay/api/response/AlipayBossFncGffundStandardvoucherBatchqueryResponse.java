package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StandardVoucherOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gffund.standardvoucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:29:53
 */
public class AlipayBossFncGffundStandardvoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7455997523956467642L;

	/** 
	 * 当前页码
	 */
	@ApiField("cur_page")
	private Long curPage;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 资金流水凭证list
	 */
	@ApiListField("standard_voucher_list")
	@ApiField("standard_voucher_open_api_v_o")
	private List<StandardVoucherOpenApiVO> standardVoucherList;

	/** 
	 * 服务处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 查询到的结果总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurPage(Long curPage) {
		this.curPage = curPage;
	}
	public Long getCurPage( ) {
		return this.curPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setStandardVoucherList(List<StandardVoucherOpenApiVO> standardVoucherList) {
		this.standardVoucherList = standardVoucherList;
	}
	public List<StandardVoucherOpenApiVO> getStandardVoucherList( ) {
		return this.standardVoucherList;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
