package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送完成反馈详情
 *
 * @author auto create
 * @since 1.0, 2017-09-15 11:25:06
 */
public class AssetDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 6895667179319984324L;

	/**
	 * 配送数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 配送订单ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 物流单信息
	 */
	@ApiListField("logistics_infos")
	@ApiField("logistics_info")
	private List<LogisticsInfo> logisticsInfos;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public List<LogisticsInfo> getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(List<LogisticsInfo> logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

}
