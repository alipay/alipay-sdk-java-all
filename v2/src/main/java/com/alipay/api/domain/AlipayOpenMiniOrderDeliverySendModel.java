package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单发货
 *
 * @author auto create
 * @since 1.0, 2025-04-28 11:38:56
 */
public class AlipayOpenMiniOrderDeliverySendModel extends AlipayObject {

	private static final long serialVersionUID = 4416119637526438615L;

	/**
	 * 物流信息列表，由商品类型决定，目前电商购物场景最多传5个，虚拟商品不需要传入
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
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 完成发货时间，格式为yyyy-MM-dd  HH:mm:ss
	 */
	@ApiField("ship_done_time")
	private String shipDoneTime;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
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
