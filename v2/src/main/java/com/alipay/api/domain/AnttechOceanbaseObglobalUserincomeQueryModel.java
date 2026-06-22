package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * salesforce查询海图用户收入数据
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:27:45
 */
public class AnttechOceanbaseObglobalUserincomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8835535886162429797L;

	/**
	 * 云平台
	 */
	@ApiField("cloud_provider")
	private String cloudProvider;

	/**
	 * 官网用户id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 海图用户id
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * null
	 */
	@ApiListField("platform_ids")
	@ApiField("string")
	private List<String> platformIds;

	/**
	 * 销售渠道
	 */
	@ApiField("sale_channel")
	private String saleChannel;

	/**
	 * 年份
	 */
	@ApiField("year")
	private String year;

	public String getCloudProvider() {
		return this.cloudProvider;
	}
	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
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

	public List<String> getPlatformIds() {
		return this.platformIds;
	}
	public void setPlatformIds(List<String> platformIds) {
		this.platformIds = platformIds;
	}

	public String getSaleChannel() {
		return this.saleChannel;
	}
	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}
