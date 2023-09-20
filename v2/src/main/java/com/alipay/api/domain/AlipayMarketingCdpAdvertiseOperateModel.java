package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给ISV、开发者操作广告的接口
 *
 * @author auto create
 * @since 1.0, 2019-03-19 12:04:23
 */
public class AlipayMarketingCdpAdvertiseOperateModel extends AlipayObject {

	private static final long serialVersionUID = 2175848784578582913L;

	/**
	 * 广告ID，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 操作类型，目前包括上线和下线，分别传入：online(ONLINE)和offline(OFFLINE)
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
