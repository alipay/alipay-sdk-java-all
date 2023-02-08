package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接入蚂蚁签约索引中心
 *
 * @author auto create
 * @since 1.0, 2022-10-28 20:21:15
 */
public class AnttechBlockchainSignIndexCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7694339468271153333L;

	/**
	 * 应用名，必填， 如cif
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 签约业务主体，必填， 如Z50
	 */
	@ApiField("biz_corp")
	private String bizCorp;

	/**
	 * 签约业务来源，必填，如花呗协议签约数据落在CIF，填CIF
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 签约业务场景, 必填, 如花呗业务的话，填产品码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约索引业务唯一键，必填，如协议ID号
	 */
	@ApiField("biz_unique_key")
	private String bizUniqueKey;

	/**
	 * 0xxxca
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签约主体ID， 必填， 请填签约用户的userId
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 签约主体ID类型， 必填， 用户填USER， 客户填CUSTOMER
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 版本号，必填， 如时间戳或者数据库业务表的版本号;应该是version,由于平台限制，使用这个
	 */
	@ApiField("sign_version")
	private Long signVersion;

	/**
	 * 签约租户，必填， 主站请填 MAIN_SITE
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 签约有效结束时间，必填
	 */
	@ApiField("valid_end_date")
	private Date validEndDate;

	/**
	 * 签约有效开始时间，必填
	 */
	@ApiField("valid_start_date")
	private Date validStartDate;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizCorp() {
		return this.bizCorp;
	}
	public void setBizCorp(String bizCorp) {
		this.bizCorp = bizCorp;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizUniqueKey() {
		return this.bizUniqueKey;
	}
	public void setBizUniqueKey(String bizUniqueKey) {
		this.bizUniqueKey = bizUniqueKey;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public Long getSignVersion() {
		return this.signVersion;
	}
	public void setSignVersion(Long signVersion) {
		this.signVersion = signVersion;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public Date getValidEndDate() {
		return this.validEndDate;
	}
	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public Date getValidStartDate() {
		return this.validStartDate;
	}
	public void setValidStartDate(Date validStartDate) {
		this.validStartDate = validStartDate;
	}

}
