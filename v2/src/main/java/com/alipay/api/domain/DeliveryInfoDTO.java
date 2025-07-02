package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快递信息
 *
 * @author auto create
 * @since 1.0, 2025-04-28 11:38:56
 */
public class DeliveryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3713724564179395382L;

	/**
	 * 快递公司ID列表请查看：https://opendocs.alipay.com/mini/07hva0?pathHash=5de3c48d，请确认传入的值在此列表内，若发货的快递公司不在此列表内，可以传入值other
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 商品信息
	 */
	@ApiListField("item_info_list")
	@ApiField("goods_item_d_t_o")
	private List<GoodsItemDTO> itemInfoList;

	/**
	 * 发货期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 发货的区域编码
	 */
	@ApiField("send_division_code")
	private String sendDivisionCode;

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

	public List<GoodsItemDTO> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<GoodsItemDTO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSendDivisionCode() {
		return this.sendDivisionCode;
	}
	public void setSendDivisionCode(String sendDivisionCode) {
		this.sendDivisionCode = sendDivisionCode;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
