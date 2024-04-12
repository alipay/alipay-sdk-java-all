package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单确认收货
 *
 * @author auto create
 * @since 1.0, 2024-01-04 11:22:51
 */
public class AlipayOpenMiniOrderDeliveryReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 6813366545543333148L;

	/**
	 * 确认收货的物流单列表，当有多个物流单时，可以指定物流单确认收货，不传入时，默认进行全部确认收货。
	 */
	@ApiListField("delivery_receive_list")
	@ApiField("delivery_receive_d_t_o")
	private List<DeliveryReceiveDTO> deliveryReceiveList;

	/**
	 * 买家open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

	public List<DeliveryReceiveDTO> getDeliveryReceiveList() {
		return this.deliveryReceiveList;
	}
	public void setDeliveryReceiveList(List<DeliveryReceiveDTO> deliveryReceiveList) {
		this.deliveryReceiveList = deliveryReceiveList;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
