package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推广的小程序内容信息
 *
 * @author auto create
 * @since 1.0, 2022-08-08 13:14:25
 */
public class DeliveryMiniAppContentInfo extends AlipayObject {

	private static final long serialVersionUID = 5341749947611811554L;

	/**
	 * 仅小程序推广可用。枚举值：服务直达
	 */
	@ApiField("mini_app_delivery_type")
	private String miniAppDeliveryType;

	/**
	 * 小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序服务编码/home_page，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。 限制: 1.只有mini_app_id有值时该值传入才会有效 2.当前只支持一个服务code 3.service_codes必须是已传入的mini_app_id下的小程序
	 */
	@ApiListField("service_code_list")
	@ApiField("string")
	private List<String> serviceCodeList;

	public String getMiniAppDeliveryType() {
		return this.miniAppDeliveryType;
	}
	public void setMiniAppDeliveryType(String miniAppDeliveryType) {
		this.miniAppDeliveryType = miniAppDeliveryType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<String> getServiceCodeList() {
		return this.serviceCodeList;
	}
	public void setServiceCodeList(List<String> serviceCodeList) {
		this.serviceCodeList = serviceCodeList;
	}

}
