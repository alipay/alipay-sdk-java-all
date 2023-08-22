package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-09 17:34:46
 */
public class DeliveryDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6486965287595676918L;

	/**
	 * 物流信息
	 */
	@ApiListField("delivery_list")
	@ApiField("delivery_info_v_o")
	private List<DeliveryInfoVO> deliveryList;

	/**
	 * 是否发货完成
	 */
	@ApiField("finish_all_delivery")
	private String finishAllDelivery;

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

}
