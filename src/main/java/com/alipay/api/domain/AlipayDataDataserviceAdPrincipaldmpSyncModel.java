package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户人群同步
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:46:54
 */
public class AlipayDataDataserviceAdPrincipaldmpSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6413125676289381218L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商户人群id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 商户人群名称
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 商户在灯火平台的唯一标签，请联系商户获取
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 人群关联策略：${bizdate}-n : ${bizdate}为固定值，代表当天，n为天数。如果当天为28号，n=1，则表示拉取27号的数；${recent}: ${recent}为固定值，调度时拉取最近一次更新的数据
	 */
	@ApiField("strategy")
	private String strategy;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
