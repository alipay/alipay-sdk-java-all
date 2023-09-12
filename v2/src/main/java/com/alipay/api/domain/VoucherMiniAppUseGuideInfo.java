package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序核销引导
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class VoucherMiniAppUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 4128579436335534776L;

	/**
	 * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
	 */
	@ApiListField("mini_app_service_codes")
	@ApiField("string")
	private List<String> miniAppServiceCodes;

	/**
	 * 小程序核销链接
	 */
	@ApiField("mini_app_url")
	private String miniAppUrl;

	public List<String> getMiniAppServiceCodes() {
		return this.miniAppServiceCodes;
	}
	public void setMiniAppServiceCodes(List<String> miniAppServiceCodes) {
		this.miniAppServiceCodes = miniAppServiceCodes;
	}

	public String getMiniAppUrl() {
		return this.miniAppUrl;
	}
	public void setMiniAppUrl(String miniAppUrl) {
		this.miniAppUrl = miniAppUrl;
	}

}
