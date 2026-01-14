package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间结束数据查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:57:56
 */
public class AlipayContentLiveLivedataCurrentliveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4745794591144935554L;

	/**
	 * 支付宝直播间ID(加密后的)
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 支付宝主播生活号id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 是否需要收益单位,默认true
	 */
	@ApiField("need_unit")
	private Boolean needUnit;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public Boolean getNeedUnit() {
		return this.needUnit;
	}
	public void setNeedUnit(Boolean needUnit) {
		this.needUnit = needUnit;
	}

}
