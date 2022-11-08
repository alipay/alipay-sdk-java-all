package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务积分排名信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:40:08
 */
public class TaskPointRankInfo extends AlipayObject {

	private static final long serialVersionUID = 5745513539753116535L;

	/**
	 * 距离前一名积分差距
	 */
	@ApiField("difference")
	private Long difference;

	/**
	 * 当前排名
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 总数
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
