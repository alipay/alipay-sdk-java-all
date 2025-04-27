package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业催缴欠税明细
 *
 * @author auto create
 * @since 1.0, 2025-01-20 15:29:41
 */
public class EpOweTaxDataInfo extends AlipayObject {

	private static final long serialVersionUID = 7538385359763648741L;

	/**
	 * 命中数据结果
	 */
	@ApiListField("hits")
	@ApiField("ep_owe_tax_info")
	private List<EpOweTaxInfo> hits;

	/**
	 * 结果总条数
	 */
	@ApiField("total")
	private Long total;

	public List<EpOweTaxInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpOweTaxInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
