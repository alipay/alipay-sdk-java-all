package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品资源项关联信息
 *
 * @author auto create
 * @since 1.0, 2016-09-08 17:33:21
 */
public class ProdRIRelationVO extends AlipayObject {

	private static final long serialVersionUID = 1554383771278926157L;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 资源项应用渠道类型
	 */
	@ApiField("ri_channel_type")
	private String riChannelType;

	/**
	 * 关联资源编码
	 */
	@ApiField("ri_code")
	private String riCode;

	/**
	 * 资源项内容
	 */
	@ApiField("ri_content")
	private String riContent;

	/**
	 * 资源项描述
	 */
	@ApiField("ri_desc")
	private String riDesc;

	/**
	 * 关联资源子类型
	 */
	@ApiField("ri_sub_type")
	private String riSubType;

	/**
	 * 关联资源主类型
	 */
	@ApiField("ri_type")
	private String riType;

	/**
	 * 资源项地址
	 */
	@ApiField("ri_url")
	private String riUrl;

	/**
	 * 资源项值类型
	 */
	@ApiField("ri_value_type")
	private String riValueType;

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getRiChannelType() {
		return this.riChannelType;
	}
	public void setRiChannelType(String riChannelType) {
		this.riChannelType = riChannelType;
	}

	public String getRiCode() {
		return this.riCode;
	}
	public void setRiCode(String riCode) {
		this.riCode = riCode;
	}

	public String getRiContent() {
		return this.riContent;
	}
	public void setRiContent(String riContent) {
		this.riContent = riContent;
	}

	public String getRiDesc() {
		return this.riDesc;
	}
	public void setRiDesc(String riDesc) {
		this.riDesc = riDesc;
	}

	public String getRiSubType() {
		return this.riSubType;
	}
	public void setRiSubType(String riSubType) {
		this.riSubType = riSubType;
	}

	public String getRiType() {
		return this.riType;
	}
	public void setRiType(String riType) {
		this.riType = riType;
	}

	public String getRiUrl() {
		return this.riUrl;
	}
	public void setRiUrl(String riUrl) {
		this.riUrl = riUrl;
	}

	public String getRiValueType() {
		return this.riValueType;
	}
	public void setRiValueType(String riValueType) {
		this.riValueType = riValueType;
	}

}
