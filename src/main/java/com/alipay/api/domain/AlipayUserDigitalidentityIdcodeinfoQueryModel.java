package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户身份码信息
 *
 * @author auto create
 * @since 1.0, 2020-11-03 15:40:12
 */
public class AlipayUserDigitalidentityIdcodeinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2225699875814896367L;

	/**
	 * 扫码用户二维码后解析出的码串值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 场景类型，描述在何等场景下获取用户身份码信息。场景例如：HOTEL（酒店）、CYBERCAFE（网吧）、SENSITIVE_MATERIALS（敏感物资）等，具体可支持的类型可能会有新增，请与技术支持人员确认
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 二级商户ID，标识一级商户下某个具体商家或门店。一级商户就是指接入支付宝开放平台的商家或服务商，支付宝侧可直接获取到相应的appId
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
