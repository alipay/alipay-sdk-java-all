package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 调用应用信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:32:54
 */
public class InvokeAppInfo extends AlipayObject {

	private static final long serialVersionUID = 2136138674194359672L;

	/**
	 * 调用应用id
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	/**
	 * 调用应用logo
	 */
	@ApiField("invoke_app_logo")
	private String invokeAppLogo;

	/**
	 * 调用应用名称
	 */
	@ApiField("invoke_app_name")
	private String invokeAppName;

	/**
	 * 设备产品列表信息
	 */
	@ApiListField("related_product_list")
	@ApiField("device_product_info")
	private List<DeviceProductInfo> relatedProductList;

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

	public String getInvokeAppLogo() {
		return this.invokeAppLogo;
	}
	public void setInvokeAppLogo(String invokeAppLogo) {
		this.invokeAppLogo = invokeAppLogo;
	}

	public String getInvokeAppName() {
		return this.invokeAppName;
	}
	public void setInvokeAppName(String invokeAppName) {
		this.invokeAppName = invokeAppName;
	}

	public List<DeviceProductInfo> getRelatedProductList() {
		return this.relatedProductList;
	}
	public void setRelatedProductList(List<DeviceProductInfo> relatedProductList) {
		this.relatedProductList = relatedProductList;
	}

}
