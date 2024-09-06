package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流信息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-30 16:06:18
 */
public class DeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6749815971649866736L;

	/**
	 * 快递公司ID，物流公司ID列表请查看
<href https://opendocs.alipay.com/mini/00au7e />
	 */
	@ApiField("delivery_id")
	private String deliveryId;

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
