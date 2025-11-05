package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益中心账户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-08-29 10:29:55
 */
public class AlipayMarketingBenefitaccountLoanaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4248458137153357243L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 检索结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页中末尾订单号
	 */
	@ApiField("last_order_id")
	private String lastOrderId;

	/**
	 * 单页展示数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 支付宝侧uid
	 */
	@ApiField("principal_user_id")
	private String principalUserId;

	/**
	 * 开始检索时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLastOrderId() {
		return this.lastOrderId;
	}
	public void setLastOrderId(String lastOrderId) {
		this.lastOrderId = lastOrderId;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalUserId() {
		return this.principalUserId;
	}
	public void setPrincipalUserId(String principalUserId) {
		this.principalUserId = principalUserId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
