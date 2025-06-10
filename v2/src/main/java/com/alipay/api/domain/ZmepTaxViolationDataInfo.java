package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商重大税收违法信息列表
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:18
 */
public class ZmepTaxViolationDataInfo extends AlipayObject {

	private static final long serialVersionUID = 6223373678614293981L;

	/**
	 * 命中数据结果
	 */
	@ApiListField("hits")
	@ApiField("zmep_tax_violation_info")
	private List<ZmepTaxViolationInfo> hits;

	/**
	 * 结果集总记录数
	 */
	@ApiField("total")
	private String total;

	public List<ZmepTaxViolationInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmepTaxViolationInfo> hits) {
		this.hits = hits;
	}

	public String getTotal() {
		return this.total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

}
