package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险参数
 *
 * @author auto create
 * @since 1.0, 2026-10-22 15:37:58
 */
public class OutAgentRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 5582884465684465818L;

	/**
	 * 被委托方数量
	 */
	@ApiField("busi_pid_count")
	private String busiPidCount;

	/**
	 * null
	 */
	@ApiListField("order_list")
	@ApiField("order_list")
	private List<OrderList> orderList;

	public String getBusiPidCount() {
		return this.busiPidCount;
	}
	public void setBusiPidCount(String busiPidCount) {
		this.busiPidCount = busiPidCount;
	}

	public List<OrderList> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<OrderList> orderList) {
		this.orderList = orderList;
	}

}
