package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商年报信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:26
 */
public class ZmepAnnualReportDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4439186322556371438L;

	/**
	 * 企业工商年报数据
	 */
	@ApiListField("hits")
	@ApiField("zmep_annual_report_info")
	private List<ZmepAnnualReportInfo> hits;

	/**
	 * 记录条数
	 */
	@ApiField("total")
	private Long total;

	public List<ZmepAnnualReportInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmepAnnualReportInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
