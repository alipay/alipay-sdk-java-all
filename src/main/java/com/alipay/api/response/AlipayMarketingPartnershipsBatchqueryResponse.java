package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketingPartnerShip;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.partnerships.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-25 15:50:39
 */
public class AlipayMarketingPartnershipsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7678498263362419712L;

	/** 
	 * 合作关系列表
	 */
	@ApiListField("data")
	@ApiField("marketing_partner_ship")
	private List<MarketingPartnerShip> data;

	/** 
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询单页数据条数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 合作关系总数量。
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setData(List<MarketingPartnerShip> data) {
		this.data = data;
	}
	public List<MarketingPartnerShip> getData( ) {
		return this.data;
	}

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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
