package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流信息修改
 *
 * @author auto create
 * @since 1.0, 2025-07-04 14:13:57
 */
public class AlipayOpenMiniOrderLogisticsinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4666852265559177637L;

	/**
	 * 物流信息
	 */
	@ApiListField("logistics_list")
	@ApiField("logistics_order_modify_d_t_o")
	private List<LogisticsOrderModifyDTO> logisticsList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
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
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<LogisticsOrderModifyDTO> getLogisticsList() {
		return this.logisticsList;
	}
	public void setLogisticsList(List<LogisticsOrderModifyDTO> logisticsList) {
		this.logisticsList = logisticsList;
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
