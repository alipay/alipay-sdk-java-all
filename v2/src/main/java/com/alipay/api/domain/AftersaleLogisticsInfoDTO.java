package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2025-03-20 11:01:29
 */
public class AftersaleLogisticsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3771857588959377724L;

	/**
	 * 快递公司ID,
<a href="https://opendocs.alipay.com/mini/07hva0?pathHash=5de3c48d">快递公司ID列表请查看</a>请确认传入的值在此列表内，若发货的快递公司不在此列表内，可以传入值other
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 商家退回时选择闪送方式需提供取件码
	 */
	@ApiField("pick_up_code")
	private String pickUpCode;

	/**
	 * 派单联系人信息
	 */
	@ApiField("send_order_contact_info")
	private SendOrderContactInfoDTO sendOrderContactInfo;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private ShopInfoDTO shopInfo;

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

	public String getPickUpCode() {
		return this.pickUpCode;
	}
	public void setPickUpCode(String pickUpCode) {
		this.pickUpCode = pickUpCode;
	}

	public SendOrderContactInfoDTO getSendOrderContactInfo() {
		return this.sendOrderContactInfo;
	}
	public void setSendOrderContactInfo(SendOrderContactInfoDTO sendOrderContactInfo) {
		this.sendOrderContactInfo = sendOrderContactInfo;
	}

	public ShopInfoDTO getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(ShopInfoDTO shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
