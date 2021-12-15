package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动结构
 *
 * @author auto create
 * @since 1.0, 2020-04-21 14:23:27
 */
public class BFActivityOpenApiInfo extends AlipayObject {

	private static final long serialVersionUID = 1479218572217935893L;

	/**
	 * 活动收费配置信息
	 */
	@ApiListField("activity_fund_infos")
	@ApiField("b_f_activity_fund_info")
	private List<BFActivityFundInfo> activityFundInfos;

	/**
	 * 活动模板ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * true 有效活动/false 失效活动
	 */
	@ApiField("available")
	private Boolean available;

	/**
	 * 开始期
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 时间类型
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 有效期
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 活动ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 活动码信息
	 */
	@ApiField("pc_id")
	private String pcId;

	/**
	 * 权益产品码
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 活动费率的版本信息
	 */
	@ApiField("rate_version")
	private String rateVersion;

	public List<BFActivityFundInfo> getActivityFundInfos() {
		return this.activityFundInfos;
	}
	public void setActivityFundInfos(List<BFActivityFundInfo> activityFundInfos) {
		this.activityFundInfos = activityFundInfos;
	}

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public Boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPcId() {
		return this.pcId;
	}
	public void setPcId(String pcId) {
		this.pcId = pcId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getRateVersion() {
		return this.rateVersion;
	}
	public void setRateVersion(String rateVersion) {
		this.rateVersion = rateVersion;
	}

}
