package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CraftsmanOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCraftsmanDataProviderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825413966222445449L;

	/** 
	 * craftsmans:手艺人信息
	 */
	@ApiListField("craftsmans")
	@ApiField("craftsman_open_model")
	private List<CraftsmanOpenModel> craftsmans;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 门店下共手艺人数目
	 */
	@ApiField("total_craftsmans")
	private Long totalCraftsmans;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	public void setCraftsmans(List<CraftsmanOpenModel> craftsmans) {
		this.craftsmans = craftsmans;
	}
	public List<CraftsmanOpenModel> getCraftsmans( ) {
		return this.craftsmans;
	}

	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public Long getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCraftsmans(Long totalCraftsmans) {
		this.totalCraftsmans = totalCraftsmans;
	}
	public Long getTotalCraftsmans( ) {
		return this.totalCraftsmans;
	}

	public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
