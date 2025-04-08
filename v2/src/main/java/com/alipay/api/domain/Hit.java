package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索命中的结果
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class Hit extends AlipayObject {

	private static final long serialVersionUID = 8392717432252431767L;

	/**
	 * action跳转参数信息
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 内容类型:
alipay:小程序
link:h5页面
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 命中的结果的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 扩展信息,json字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 显示的图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 命中的结果显示名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 搜索结果的来源方
	 */
	@ApiField("provider")
	private String provider;

	public String getActionParam() {
		return this.actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return this.provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

}
