package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用服务受理初始化
 *
 * @author auto create
 * @since 1.0, 2024-07-17 15:56:50
 */
public class ZhimaCreditEpAcceptanceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4114923956924371949L;

	/**
	 * 平台访问指定的设备类型，不填则前端根据用户实际设备类型自动加载
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 使用蚂蚁企业信用相关服务后，回跳到该商户指定的地址
	 */
	@ApiField("merchant_return_url")
	private String merchantReturnUrl;

	/**
	 * 商户唯一业务流水号，由大小写字母和数字构成。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 受理场景码，由蚂蚁企业信用方分发提供，配置有误会返回参数错误
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getMerchantReturnUrl() {
		return this.merchantReturnUrl;
	}
	public void setMerchantReturnUrl(String merchantReturnUrl) {
		this.merchantReturnUrl = merchantReturnUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
