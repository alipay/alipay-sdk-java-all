package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:44:28
 */
public class VoucherUseGuideModify extends AlipayObject {

	private static final long serialVersionUID = 3744183422365396821L;

	/**
	 * 券可用的小程序 appId，卡包详情页可跳转到该 appId。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到 mini_app_id 时的具体页面路径。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

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

	public List<String> getServiceCodes() {
		return this.serviceCodes;
	}
	public void setServiceCodes(List<String> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

}
