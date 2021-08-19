package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单项预创建接口
 *
 * @author auto create
 * @since 1.0, 2021-04-07 20:39:44
 */
public class AlipayEbppOrderItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3811566731367918984L;

	/**
	 * 预创单失效时间，此时间点后不允许再支付。
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_at")
	private Date expireAt;

	/**
	 * 需要创建的订单子项
	 */
	@ApiField("item_to_create")
	private EbppOrderItemToCreate itemToCreate;

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

	public EbppOrderItemToCreate getItemToCreate() {
		return this.itemToCreate;
	}
	public void setItemToCreate(EbppOrderItemToCreate itemToCreate) {
		this.itemToCreate = itemToCreate;
	}

	public Boolean getQrcodeRequired() {
		return this.qrcodeRequired;
	}
	public void setQrcodeRequired(Boolean qrcodeRequired) {
		this.qrcodeRequired = qrcodeRequired;
	}

}
