package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建证件商户二维码
 *
 * @author auto create
 * @since 1.0, 2020-08-27 15:04:33
 */
public class AlipayUserElectronicidMerchantbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7355581831938379396L;

	/**
	 * 动态码过期时间，单位秒，当type为DYNAMIC时为必填参数
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 生成商家网证二维码的类型，用于区分二维码有效期类型，动态二维码：DYNAMIC，静态二维码：STATIC
	 */
	@ApiField("type")
	private String type;

	/**
	 * 商户提供的唯一标识，不感知大小写等问题，支付宝只做透传，当用户扫商户时，商户会拿到的这个透传值
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
