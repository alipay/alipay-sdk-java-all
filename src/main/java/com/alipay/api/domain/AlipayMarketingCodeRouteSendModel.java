package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝扫码web_openapi
 *
 * @author auto create
 * @since 1.0, 2017-05-16 15:09:13
 */
public class AlipayMarketingCodeRouteSendModel extends AlipayObject {

	private static final long serialVersionUID = 1838523394555478712L;

	/**
	 * 输入的是和码值相关的信息。其中"code"是必填值
	 */
	@ApiField("decode_data")
	private AlipayMarketingDecodeData decodeData;

	/**
	 * JSON格式的扩展信息。其中out_user_id为接入平台的userID. ibs_info为lbs信息，格式为:{"accuracy":"25.0", "altitude":"0.0", "latitude":"32.811824", "longitude":"118.684671", "time":1490009982876} 含义是:{精度，海拔,维度，经度，时间 ms},另外还可以传递其他额外的信息。
	 */
	@ApiField("ext_data")
	private AlipayMarketingExtData extData;

	/**
	 * 表示扫码的类型，qrCode是二维码，barCode是条码，目前仅支持qrCode
	 */
	@ApiField("pai_type")
	private String paiType;

	/**
	 * JSON串,描述接入码平台APP的信息。其中product,product_version必填。product需要接入的时候和支付宝码平台约定,目前仅支持建行app使用ccb_wallet
	 */
	@ApiField("product_context")
	private AlipayMarketingProductContext productContext;

	public AlipayMarketingDecodeData getDecodeData() {
		return this.decodeData;
	}
	public void setDecodeData(AlipayMarketingDecodeData decodeData) {
		this.decodeData = decodeData;
	}

	public AlipayMarketingExtData getExtData() {
		return this.extData;
	}
	public void setExtData(AlipayMarketingExtData extData) {
		this.extData = extData;
	}

	public String getPaiType() {
		return this.paiType;
	}
	public void setPaiType(String paiType) {
		this.paiType = paiType;
	}

	public AlipayMarketingProductContext getProductContext() {
		return this.productContext;
	}
	public void setProductContext(AlipayMarketingProductContext productContext) {
		this.productContext = productContext;
	}

}
