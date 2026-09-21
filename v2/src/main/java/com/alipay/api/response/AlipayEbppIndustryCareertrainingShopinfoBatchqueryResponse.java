package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopInfoItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.shopinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-16 14:37:54
 */
public class AlipayEbppIndustryCareertrainingShopinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1535667275713947353L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("shop_info_item_v_o")
	private List<ShopInfoItemVO> list;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<ShopInfoItemVO> list) {
		this.list = list;
	}
	public List<ShopInfoItemVO> getList( ) {
		return this.list;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
