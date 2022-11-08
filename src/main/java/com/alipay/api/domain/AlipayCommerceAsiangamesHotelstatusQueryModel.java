package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 美食通排行榜T+1更新价格接口
 *
 * @author auto create
 * @since 1.0, 2022-05-19 20:18:42
 */
public class AlipayCommerceAsiangamesHotelstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2453332377855174552L;

	/**
	 * 当前页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据量，正整数，不传默认为100,最大为200
	 */
	@ApiField("page_size")
	private Long pageSize;

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
