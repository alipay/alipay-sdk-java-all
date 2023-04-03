package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单发货
 *
 * @author auto create
 * @since 1.0, 2023-03-28 19:20:51
 */
public class AlipayOpenMiniOrderDeliverySendModel extends AlipayObject {

	private static final long serialVersionUID = 2181255561729544573L;

	/**
	 * 快递信息，delivery_type=1时必填，订单中心限制5条
	 */
	@ApiListField("delivery_list")
	@ApiField("delivery_info_d_t_o")
	private List<DeliveryInfoDTO> deliveryList;

	/**
	 * 发货完成标志位, 0: 未发完, 1:已发完
	 */
	@ApiField("finish_all_delivery")
	private Long finishAllDelivery;

	/**
	 * 商户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss。 注：finish_all_delivery = 1的时候 必传
	 */
	@ApiField("ship_done_time")
	private String shipDoneTime;

	/**
	 * 商户UID（与openId二选一）
	 */
	@ApiField("user_id")
	private String userId;

	public List<DeliveryInfoDTO> getDeliveryList() {
		return this.deliveryList;
	}
	public void setDeliveryList(List<DeliveryInfoDTO> deliveryList) {
		this.deliveryList = deliveryList;
	}

	public Long getFinishAllDelivery() {
		return this.finishAllDelivery;
	}
	public void setFinishAllDelivery(Long finishAllDelivery) {
		this.finishAllDelivery = finishAllDelivery;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getShipDoneTime() {
		return this.shipDoneTime;
	}
	public void setShipDoneTime(String shipDoneTime) {
		this.shipDoneTime = shipDoneTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
