package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tab3短剧合集查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AlipayDataDataserviceAdcampaignSeriestabcompilationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7225557766658661571L;

	/**
	 * 营销目标编码,缺失透传 null
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 商家标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 生活号 ID,空→INVALID_PARAMETER(publicId 不能为空)
	 */
	@ApiField("public_id")
	private String publicId;

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

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
