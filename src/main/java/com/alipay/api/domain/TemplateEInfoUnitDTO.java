package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版主体数据单元信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateEInfoUnitDTO extends AlipayObject {

	private static final long serialVersionUID = 7579579443817649165L;

	/**
	 * 显示icon的图片ID，通过接口（alipay.offline.material.image.upload）上传图片
图片说明：1M以内，格式bmp、png、jpeg、jpg，尺寸不小于100*100px。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 字段关键字标识，可作为聚合关键字，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("key")
	private String key;

	/**
	 * 通栏左边显示文案，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("label")
	private String label;

	/**
	 * 更多描述，当字段类型为：url（网站连接地址）时必填，用于存放跳转链接。
	 */
	@ApiField("more")
	private TemplateEInfoMoreDTO more;

	/**
	 * 字段类型，可选类型有：tel（电话）、url（网站连接地址）、map（地图）、text（文本，默认类型)。根据不同的类型，将在该字段前添加相应的icon，并会根据实际情况相应支持电话拨出、启动浏览器跳转连接地址、启动手机应用客户端、地图等功能。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("type")
	private String type;

	/**
	 * 通栏右边显示具体值，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("value")
	private String value;

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public TemplateEInfoMoreDTO getMore() {
		return this.more;
	}
	public void setMore(TemplateEInfoMoreDTO more) {
		this.more = more;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
