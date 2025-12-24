package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息结构
 *
 * @author auto create
 * @since 1.0, 2025-07-04 13:22:37
 */
public class GovOrgServiceDTO extends AlipayObject {

	private static final long serialVersionUID = 6153154159938348467L;

	/**
	 * 服务的展示渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码。多个城市编码用英文逗号隔开。
如330100,330200
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用于描述服务能力范围，详细的服务描述更有利于大模型识别召回
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 用户服务展示时的logo图
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 用于查询公积金余额
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部服务id。需要调用机构保证唯一性
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 语料运行状态
	 */
	@ApiField("run_status")
	private String runStatus;

	/**
	 * 服务提供方
	 */
	@ApiField("supplier")
	private String supplier;

	/**
	 * 服务跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getRunStatus() {
		return this.runStatus;
	}
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getSupplier() {
		return this.supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
