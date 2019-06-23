package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取签约页面
 *
 * @author auto create
 * @since 1.0, 2018-07-27 18:11:44
 */
public class ZhimaCreditPeContractSignpageInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7643217337256289364L;

	/**
	 * 活动标识码
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 签约结束商户回调url, "{}"会替换成平台参数列表
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 场景类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 签约来源应用标识
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户支付宝的ID
	 */
	@ApiField("uid")
	private String uid;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
