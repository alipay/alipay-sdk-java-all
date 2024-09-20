package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务积分排名信息
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:47:52
 */
public class TaskPointRankInfo extends AlipayObject {

	private static final long serialVersionUID = 2889138837684498327L;

	/**
	 * 距离前一名积分差距，单位为名，100代表相差100名
	 */
	@ApiField("difference")
	private Long difference;

	/**
	 * 当前排名，单位为第XX名，1代表第1名
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 总数，单位为个
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 排名类型
	 */
	@ApiField("type")
	private String type;

	public Long getDifference() {
		return this.difference;
	}
	public void setDifference(Long difference) {
		this.difference = difference;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
