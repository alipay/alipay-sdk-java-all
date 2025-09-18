package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序核销引导
 *
 * @author auto create
 * @since 1.0, 2024-09-02 17:23:22
 */
public class VoucherMiniAppUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 8421699898633635481L;

	/**
	 * 小程序服务编码。取值来源：通过<a href="https://opendocs.alipay.com/mini/03cgoq?pathHash=49cde24b&scene=common&highlight_field=service_code" target="_blank">alipay.open.app.service.apply(小程序服务创建)</a>接口创建服务后获取。
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
