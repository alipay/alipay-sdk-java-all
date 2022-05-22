package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导信息
 *
 * @author auto create
 * @since 1.0, 2022-04-08 19:32:17
 */
public class VoucherUseGuide extends AlipayObject {

	private static final long serialVersionUID = 4611177675458854263L;

	/**
	 * 券可用的小程序appId，卡包详情页可跳转到该appId 限制： 该appId归属的pid必须和当前商户存在同mid关系或跨mid的授权关系。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。 限制： 1、只有mini_app_id有值时该值传入才会有效 2、该小程序路径是相对路径。详情参考小程序scheme链接介绍https://opendocs.alipay.com/support/01rb18。
3.service_codes与mini_app_path只能二选一或者都不填写。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 小程序核销。 说明： 1、该字段为true。则卡包会展示小程序核销按钮跳转至小程序。 2、offline_code_use_guide 与 mini_app_use_guide至少2选1。3、该字段为true，则下面的mini_app_id字段必须填写。
	 */
	@ApiField("mini_app_use_guide")
	private Boolean miniAppUseGuide;

	/**
	 * 线下扫码核销。
说明：
1、该字段为true。则卡包会展示相应券码信息。
2、offline_code_use_guide 与 mini_app_use_guide至少2选1
	 */
	@ApiField("offline_code_use_guide")
	private Boolean offlineCodeUseGuide;

	/**
	 * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes与mini_app_path只能二选一或者都不填写。
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
