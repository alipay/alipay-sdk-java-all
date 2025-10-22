package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流信息模型
 *
 * @author auto create
 * @since 1.0, 2025-07-08 10:26:17
 */
public class DeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1149491642915832929L;

	/**
	 * 快递公司ID，物流公司ID列表请查看
<href https://opendocs.alipay.com/mini/00au7e />
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 首次发货时间
	 */
	@ApiField("first_delivery_time")
	private String firstDeliveryTime;

	/**
	 * 商品信息
	 */
	@ApiListField("item_info_list")
	@ApiField("delivery_item_info_v_o")
	private List<DeliveryItemInfoVO> itemInfoList;

	/**
	 * 快递单号
	 */
	@ApiField("waybill_id")
	private String waybillId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getFirstDeliveryTime() {
		return this.firstDeliveryTime;
	}
	public void setFirstDeliveryTime(String firstDeliveryTime) {
		this.firstDeliveryTime = firstDeliveryTime;
	}

	public List<DeliveryItemInfoVO> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<DeliveryItemInfoVO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
