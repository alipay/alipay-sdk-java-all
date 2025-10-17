package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MallGoodsPrice;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.punchout.goodsattr.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 11:46:41
 */
public class AlipayDigitalmgmtPunchoutGoodsattrQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4752732432946446827L;

	/** 
	 * 当前查询的是第几页，如1 则是第1页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页返回数据的大小，数据来自入参
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 商品规格报价价格
	 */
	@ApiField("price_list")
	private MallGoodsPrice priceList;

	/** 
	 * 返回100代表 一共有100条数据
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

	public void setPriceList(MallGoodsPrice priceList) {
		this.priceList = priceList;
	}
	public MallGoodsPrice getPriceList( ) {
		return this.priceList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
