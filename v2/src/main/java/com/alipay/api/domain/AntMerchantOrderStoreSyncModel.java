package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店插件服务订单状态同步
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:22:38
 */
public class AntMerchantOrderStoreSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6713812491714332926L;

	/**
	 * 状态相关的描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 状态类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 订单的ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 插件业务场景code，预约为ShopService
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 线上店的ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
