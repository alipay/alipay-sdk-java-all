package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车型库车系列表查询
 *
 * @author auto create
 * @since 1.0, 2026-07-06 16:22:55
 */
public class AlipayEcoMycarVehlibSeriesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6176372325218298548L;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，1~100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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
