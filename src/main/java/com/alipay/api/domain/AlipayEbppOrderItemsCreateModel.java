package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业支付通用批量预下单接口
 *
 * @author auto create
 * @since 1.0, 2018-09-08 15:38:54
 */
public class AlipayEbppOrderItemsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2649485427358729524L;

	/**
	 * 预创单失效时间，此时间点后不允许再支付。
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_at")
	private Date expireAt;

	/**
	 * 需要创建的订单子项列表
	 */
	@ApiListField("items_to_create")
	@ApiField("ebpp_order_item_to_create")
	private List<EbppOrderItemToCreate> itemsToCreate;

	/**
	 * 要求创建支付宝二维码，可供用户扫码后直接支付.
默认值为false
	 */
	@ApiField("qrcode_required")
	private Boolean qrcodeRequired;

	public Date getExpireAt() {
		return this.expireAt;
	}
	public void setExpireAt(Date expireAt) {
		this.expireAt = expireAt;
	}

	public List<EbppOrderItemToCreate> getItemsToCreate() {
		return this.itemsToCreate;
	}
	public void setItemsToCreate(List<EbppOrderItemToCreate> itemsToCreate) {
		this.itemsToCreate = itemsToCreate;
	}

	public Boolean getQrcodeRequired() {
		return this.qrcodeRequired;
	}
	public void setQrcodeRequired(Boolean qrcodeRequired) {
		this.qrcodeRequired = qrcodeRequired;
	}

}
