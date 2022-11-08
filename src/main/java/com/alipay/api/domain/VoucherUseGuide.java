package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:43:36
 */
public class VoucherUseGuide extends AlipayObject {

	private static final long serialVersionUID = 6528836498233375172L;

	/**
	 * 券可用的小程序appId，卡包详情页可跳转到该appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 小程序核销。
	 */
	@ApiField("mini_app_use_guide")
	private Boolean miniAppUseGuide;

	/**
	 * 线下扫码核销。
	 */
	@ApiField("offline_code_use_guide")
	private Boolean offlineCodeUseGuide;

	/**
	 * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
	 */
	@ApiListField("service_codes")
	@ApiField("string")
	private List<String> serviceCodes;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppPath() {
		return this.miniAppPath;
	}
	public void setMiniAppPath(String miniAppPath) {
		this.miniAppPath = miniAppPath;
	}

	public Boolean getMiniAppUseGuide() {
		return this.miniAppUseGuide;
	}
	public void setMiniAppUseGuide(Boolean miniAppUseGuide) {
		this.miniAppUseGuide = miniAppUseGuide;
	}

	public Boolean getOfflineCodeUseGuide() {
		return this.offlineCodeUseGuide;
	}
	public void setOfflineCodeUseGuide(Boolean offlineCodeUseGuide) {
		this.offlineCodeUseGuide = offlineCodeUseGuide;
	}

	public List<String> getServiceCodes() {
		return this.serviceCodes;
	}
	public void setServiceCodes(List<String> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

}
