package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取门店下商品列表
 *
 * @author auto create
 * @since 1.0, 2026-06-02 11:47:51
 */
public class AlipayOpenAppUnishopItemlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8387336778312988832L;

	/**
	 * 团购门店id
	 */
	@ApiField("a_shop_id")
	private String aShopId;

	/**
	 * 分批查询的页码，必填
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数据量大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getaShopId() {
		return this.aShopId;
	}
	public void setaShopId(String aShopId) {
		this.aShopId = aShopId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
