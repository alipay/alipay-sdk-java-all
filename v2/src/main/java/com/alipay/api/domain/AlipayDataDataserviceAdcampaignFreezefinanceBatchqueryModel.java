package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询冻结单
 *
 * @author auto create
 * @since 1.0, 2025-07-14 17:59:17
 */
public class AlipayDataDataserviceAdcampaignFreezefinanceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5331346584746569839L;

	/**
	 * 二级营销目标
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取
	 */
	@ApiField("principal_tag")
	private String principalTag;

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

}
