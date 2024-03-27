package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 18:35:15
 */
public class AlipayInsMarketingProductRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 3627612438668555394L;

	/**
	 * 推荐的业务信息字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险标的
	 */
	@ApiField("ins_object")
	private InsObject insObject;

	/**
	 * 场景编码；识别商户在特定场景下需要的保险产品
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 标记推荐请求的业务来源对象
	 */
	@ApiField("source")
	private String source;

	/**
	 * 相关的多个干系人
	 */
	@ApiField("stake_holders")
	private InsPerson stakeHolders;

	/**
	 * 投保人
	 */
	@ApiField("user")
	private InsPerson user;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public InsObject getInsObject() {
		return this.insObject;
	}
	public void setInsObject(InsObject insObject) {
		this.insObject = insObject;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public InsPerson getStakeHolders() {
		return this.stakeHolders;
	}
	public void setStakeHolders(InsPerson stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public InsPerson getUser() {
		return this.user;
	}
	public void setUser(InsPerson user) {
		this.user = user;
	}

}
