package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商企业招投标信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:23
 */
public class ZmepBiddingDataInfo extends AlipayObject {

	private static final long serialVersionUID = 7278258144575915881L;

	/**
	 * 企业工商招投标信息列表
	 */
	@ApiListField("hits")
	@ApiField("zmep_bidding_info")
	private List<ZmepBiddingInfo> hits;

	/**
	 * 结果条数
	 */
	@ApiField("total")
	private Long total;

	public List<ZmepBiddingInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmepBiddingInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
