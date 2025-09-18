package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送信息模型
 *
 * @author auto create
 * @since 1.0, 2025-02-19 16:52:55
 */
public class DeliveryDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1489926433183676864L;

	/**
	 * 物流信息
	 */
	@ApiListField("delivery_list")
	@ApiField("delivery_info_v_o")
	private List<DeliveryInfoVO> deliveryList;

	/**
	 * 发货完成标志位，false:未发完  ，
true:已发完
	 */
	@ApiField("finish_all_delivery")
	private String finishAllDelivery;

	/**
	 * 履约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 履约方式
	 */
	@ApiField("type")
	private String type;

	public List<DeliveryInfoVO> getDeliveryList() {
		return this.deliveryList;
	}
	public void setDeliveryList(List<DeliveryInfoVO> deliveryList) {
		this.deliveryList = deliveryList;
	}

	public String getFinishAllDelivery() {
		return this.finishAllDelivery;
	}
	public void setFinishAllDelivery(String finishAllDelivery) {
		this.finishAllDelivery = finishAllDelivery;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
