package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐结果
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:40:40
 */
public class RecItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3353417475638946339L;

	/**
	 * 归属地区
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 业务分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展信息,JSONSTRING格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * Item编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 服务ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 推荐Item名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * Item分类
	 */
	@ApiField("type")
	private String type;

	/**
	 * Item地址
	 */
	@ApiField("url")
	private String url;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
