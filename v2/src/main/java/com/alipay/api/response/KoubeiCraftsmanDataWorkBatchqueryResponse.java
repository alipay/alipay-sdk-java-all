package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CraftsmanWorkOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.work.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:01:03
 */
public class KoubeiCraftsmanDataWorkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5197146532624128271L;

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
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	/** 
	 * 总共手艺人作品数目
	 */
	@ApiField("total_works")
	private Long totalWorks;

	/** 
	 * 作品信息列表
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_open_model")
	private List<CraftsmanWorkOpenModel> works;

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

	public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

	public void setTotalWorks(Long totalWorks) {
		this.totalWorks = totalWorks;
	}
	public Long getTotalWorks( ) {
		return this.totalWorks;
	}

	public void setWorks(List<CraftsmanWorkOpenModel> works) {
		this.works = works;
	}
	public List<CraftsmanWorkOpenModel> getWorks( ) {
		return this.works;
	}

}
