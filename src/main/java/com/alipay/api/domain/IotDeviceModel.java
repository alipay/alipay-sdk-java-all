package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Iot设备型号对象
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:34
 */
public class IotDeviceModel extends AlipayObject {

	private static final long serialVersionUID = 7533655161533552693L;

	/**
	 * 该型号所属类目的类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 型号支持的配网链接类型, 取值可为WiFi，BlueTooth
	 */
	@ApiListField("connection_types")
	@ApiField("string")
	private List<String> connectionTypes;

	/**
	 * 配网链接地址
	 */
	@ApiField("connection_url")
	private String connectionUrl;

	/**
	 * 关于型号的描述信息
	 */
	@ApiField("decription")
	private String decription;

	/**
	 * 型号的图标图片地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 制造商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 协议服务商用于唯一标识一个设备型号的型号id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 设备型号的名称
	 */
	@ApiField("model_name")
	private String modelName;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<String> getConnectionTypes() {
		return this.connectionTypes;
	}
	public void setConnectionTypes(List<String> connectionTypes) {
		this.connectionTypes = connectionTypes;
	}

	public String getConnectionUrl() {
		return this.connectionUrl;
	}
	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	public String getDecription() {
		return this.decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
