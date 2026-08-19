package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * App维度短剧合集列表
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:27:50
 */
public class AlipayDataDataserviceAdcampaignSeriesappcompilationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7124482136181311984L;

	/**
	 * 营销目标编码;缺失透传 null(Service 内按默认 status=0 处理)

	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 委托人 ID;非法值→SYSTEM_ERROR
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 小程序id
	 */
	@ApiField("series_app_id")
	private String seriesAppId;

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSeriesAppId() {
		return this.seriesAppId;
	}
	public void setSeriesAppId(String seriesAppId) {
		this.seriesAppId = seriesAppId;
	}

}
