package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PhysicalShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.mallhome.physicalshop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 17:52:35
 */
public class AlipayCommerceOperationMallhomePhysicalshopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2894111889624544952L;

	/** 
	 * 起始页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 物理门店列表
	 */
	@ApiListField("physical_shop_list")
	@ApiField("physical_shop_info")
	private List<PhysicalShopInfo> physicalShopList;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setPhysicalShopList(List<PhysicalShopInfo> physicalShopList) {
		this.physicalShopList = physicalShopList;
	}
	public List<PhysicalShopInfo> getPhysicalShopList( ) {
		return this.physicalShopList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
