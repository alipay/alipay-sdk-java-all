package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动生效
 *
 * @author auto create
 * @since 1.0, 2021-12-20 10:48:53
 */
public class AlipayOfflineProviderIndirectisvActivityEffectModel extends AlipayObject {

	private static final long serialVersionUID = 8368792712827499935L;

	/**
	 * 活动生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * 备注信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户收单账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
