package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1688订单变更同步
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:49:34
 */
public class AlipayMerchantCbuorderChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7493832849463397736L;

	/**
	 * 当前订单的来源方，例如收钱有奖，批发进货等
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 当前订单的数据变更内容
	 */
	@ApiField("change_data")
	private String changeData;

	/**
	 * 变更的时间戳，毫秒
	 */
	@ApiField("change_time")
	private String changeTime;

	/**
	 * 当前变更消息通知的订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getChangeData() {
		return this.changeData;
	}
	public void setChangeData(String changeData) {
		this.changeData = changeData;
	}

	public String getChangeTime() {
		return this.changeTime;
	}
	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
