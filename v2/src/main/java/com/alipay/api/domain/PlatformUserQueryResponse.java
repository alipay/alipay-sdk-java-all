package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:05
 */
public class PlatformUserQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3189876596727597712L;

	/**
	 * 客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 云平台
	 */
	@ApiField("cloud_provider")
	private String cloudProvider;

	/**
	 * 客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 官网用户ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 海图用户ID
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 售卖渠道
	 */
	@ApiField("sale_channel")
	private String saleChannel;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCloudProvider() {
		return this.cloudProvider;
	}
	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getSaleChannel() {
		return this.saleChannel;
	}
	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

}
