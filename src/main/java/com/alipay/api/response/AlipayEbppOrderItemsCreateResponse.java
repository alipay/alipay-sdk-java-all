package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppOrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.order.items.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppOrderItemsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7192276172333334571L;

	/** 
	 * 已创建的订单子项列表
	 */
	@ApiListField("items")
	@ApiField("ebpp_order_item")
	private List<EbppOrderItem> items;

	/** 
	 * 用于支付相应订单子项的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码，用户扫码后会拉起收银台支付。
仅当入参qrcode_required为true时才会返回此参数。
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setItems(List<EbppOrderItem> items) {
		this.items = items;
	}
	public List<EbppOrderItem> getItems( ) {
		return this.items;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
