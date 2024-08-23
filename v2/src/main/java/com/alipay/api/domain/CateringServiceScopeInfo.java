package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮服务标准化-服务范围
 *
 * @author auto create
 * @since 1.0, 2021-09-14 20:02:25
 */
public class CateringServiceScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 5288471872884831497L;

	/**
	 * 自提范围
	 */
	@ApiField("pick_up_scope_info")
	private ScopeInfo pickUpScopeInfo;

	/**
	 * 排队范围
	 */
	@ApiField("queue_scope_info")
	private ScopeInfo queueScopeInfo;

	/**
	 * 外卖配送范围
	 */
	@ApiListField("take_away_scope_info")
	@ApiField("take_away_scope_info")
	private List<TakeAwayScopeInfo> takeAwayScopeInfo;

	public ScopeInfo getPickUpScopeInfo() {
		return this.pickUpScopeInfo;
	}
	public void setPickUpScopeInfo(ScopeInfo pickUpScopeInfo) {
		this.pickUpScopeInfo = pickUpScopeInfo;
	}

	public ScopeInfo getQueueScopeInfo() {
		return this.queueScopeInfo;
	}
	public void setQueueScopeInfo(ScopeInfo queueScopeInfo) {
		this.queueScopeInfo = queueScopeInfo;
	}

	public List<TakeAwayScopeInfo> getTakeAwayScopeInfo() {
		return this.takeAwayScopeInfo;
	}
	public void setTakeAwayScopeInfo(List<TakeAwayScopeInfo> takeAwayScopeInfo) {
		this.takeAwayScopeInfo = takeAwayScopeInfo;
	}

}
