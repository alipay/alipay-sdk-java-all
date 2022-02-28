package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CCM开放功能spi定义
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:44:57
 */
public class IsvSpiDefinition extends AlipayObject {

	private static final long serialVersionUID = 3493224298391498676L;

	/**
	 * ISV自定义的标识功能的业务代码，不可重复
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * spi功能描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 功能图标文件url
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * spi接口服务地址
	 */
	@ApiField("spi_endpoint")
	private String spiEndpoint;

	/**
	 * spi接口扩展参数，json格式字符串
	 */
	@ApiField("spi_ext_property")
	private String spiExtProperty;

	/**
	 * CCM预先定义的spi key，与插件位置有关
	 */
	@ApiField("spi_key")
	private String spiKey;

	/**
	 * SPI 名称
	 */
	@ApiField("spi_name")
	private String spiName;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSpiEndpoint() {
		return this.spiEndpoint;
	}
	public void setSpiEndpoint(String spiEndpoint) {
		this.spiEndpoint = spiEndpoint;
	}

	public String getSpiExtProperty() {
		return this.spiExtProperty;
	}
	public void setSpiExtProperty(String spiExtProperty) {
		this.spiExtProperty = spiExtProperty;
	}

	public String getSpiKey() {
		return this.spiKey;
	}
	public void setSpiKey(String spiKey) {
		this.spiKey = spiKey;
	}

	public String getSpiName() {
		return this.spiName;
	}
	public void setSpiName(String spiName) {
		this.spiName = spiName;
	}

}
