package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序核销引导
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:09:22
 */
public class VoucherMiniAppUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 1879774111358332597L;

	/**
	 * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes与mini_app_path只能且必须二选一
	 */
	@ApiListField("mini_app_service_codes")
	@ApiField("string")
	private List<String> miniAppServiceCodes;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。 限制： 1、只有mini_app_id有值时该值传入才会有效 2、该小程序路径是相对路径。详情参考小程序scheme链接介绍https://opendocs.alipay.com/support/01rb18。 3.service_codes与mini_app_path只能二选一或者都不填写。
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
