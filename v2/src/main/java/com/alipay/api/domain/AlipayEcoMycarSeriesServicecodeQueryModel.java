package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询车型库车系对应的服务编码
 *
 * @author auto create
 * @since 1.0, 2023-10-26 13:41:24
 */
public class AlipayEcoMycarSeriesServicecodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1152669887381124632L;

	/**
	 * 车系ID
	 */
	@ApiField("series_id")
	private String seriesId;

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

}
