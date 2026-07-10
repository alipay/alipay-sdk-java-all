package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车型库车型列表查询
 *
 * @author auto create
 * @since 1.0, 2026-07-06 16:17:56
 */
public class AlipayEcoMycarVehlibModelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2446381911519778877L;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 车系ID可从车型库车系查询接口返回的series_id获取
	 */
	@ApiField("series_id")
	private String seriesId;

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

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

}
