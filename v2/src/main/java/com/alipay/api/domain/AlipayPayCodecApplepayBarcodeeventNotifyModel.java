package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * applePay码上报
 *
 * @author auto create
 * @since 1.0, 2020-08-20 20:12:02
 */
public class AlipayPayCodecApplepayBarcodeeventNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3239838631349375843L;

	/**
	 * 码的id。{Identifier for this credential}
	 */
	@ApiField("barcode_identifier")
	private String barcodeIdentifier;

	/**
	 * 上报事件，Base64 encoded UTF-8 bytes of Event Data JSON object defined below.
	 */
	@ApiField("event")
	private String event;

	/**
	 * 上报时间的签名，Base64 encoded PKCS#7 detached ECDSA signature. Signature data is generated over the SHA- 256 hash of Base64 decoded event bytes。
	 */
	@ApiField("signature")
	private String signature;

	public String getBarcodeIdentifier() {
		return this.barcodeIdentifier;
	}
	public void setBarcodeIdentifier(String barcodeIdentifier) {
		this.barcodeIdentifier = barcodeIdentifier;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
