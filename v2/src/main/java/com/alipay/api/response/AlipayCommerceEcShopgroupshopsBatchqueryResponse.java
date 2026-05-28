package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SelfShopGroupShopDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shopgroupshops.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 15:47:48
 */
public class AlipayCommerceEcShopgroupshopsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1297142885392711213L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("shop_list")
	@ApiField("self_shop_group_shop_detail")
	private List<SelfShopGroupShopDetail> shopList;

	/** 
	 * 总数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

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

	public void setShopList(List<SelfShopGroupShopDetail> shopList) {
		this.shopList = shopList;
	}
	public List<SelfShopGroupShopDetail> getShopList( ) {
		return this.shopList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
