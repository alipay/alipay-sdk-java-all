package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员电子身份证生成外部商户码
 *
 * @author auto create
 * @since 1.0, 2020-08-27 15:47:57
 */
public class AlipayUserElectronicidOutermerchantbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7634921784379454232L;

	/**
	 * 码类型，可选值：动态二维码：DYNAMIC，静态二维码：STATIC
	 */
	@ApiField("barcode_type")
	private String barcodeType;

	/**
	 * 过期时间，单位秒。仅当为动态码时，此属性有效。动态码最长有效期为2个小时，即7200秒。
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 商户类型。可选址为：网吧:CYBERCAFE,酒店宾馆:HOTEL,政务办事大厅:PUBLIC_SERVICE,机场:AIRPORT,长途客运:BUS,铁路:RAILWAY,景区:SCENIC_AREA,场馆:HALL,赛事/集会:GAME,快递邮寄:POST
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 扫描商户码后的回跳链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getBarcodeType() {
		return this.barcodeType;
	}
	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
