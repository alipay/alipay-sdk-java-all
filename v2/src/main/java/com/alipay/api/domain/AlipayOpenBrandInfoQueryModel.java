package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8265222754657391889L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 从第1页开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页数1-10页
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
