package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量统计信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 16:04:08
 */
public class FlowStatsEntry extends AlipayObject {

	private static final long serialVersionUID = 5611573335715975265L;

	/**
	 * 访问量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 来源IP
	 */
	@ApiField("source_ip")
	private String sourceIp;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getSourceIp() {
		return this.sourceIp;
	}
	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

}
