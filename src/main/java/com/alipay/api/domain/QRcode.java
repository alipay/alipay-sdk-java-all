package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车超人，QRcode二元组类型
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:31
 */
public class QRcode extends AlipayObject {

	private static final long serialVersionUID = 6429146695138138841L;

	/**
	 * 用户ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * qrcode地址
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
