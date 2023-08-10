package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EbppOrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.order.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:53:11
 */
public class AlipayEbppOrderItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3472819525882731791L;

	/** 
	 * 已创建的订单子项
	 */
	@ApiField("item")
	private EbppOrderItem item;

	/** 
	 * 用于支付相应订单子项的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码，用户扫码后会拉起收银台支付。
仅当入参qrcode_required为true时才会返回此参数。
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setItem(EbppOrderItem item) {
		this.item = item;
	}
	public EbppOrderItem getItem( ) {
		return this.item;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
