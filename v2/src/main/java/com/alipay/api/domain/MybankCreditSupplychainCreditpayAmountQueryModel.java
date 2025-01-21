package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商-1688和赊呗融合-额度查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:37:21
 */
public class MybankCreditSupplychainCreditpayAmountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6885762911941928177L;

	/**
	 * 品牌额度查询条件
	 */
	@ApiField("brand_quota_query_condition")
	private BrandQuotaQueryCondition brandQuotaQueryCondition;

	/**
	 * 买方信息，这里是ISV的信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 平台类型
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * 授权场景码
	 */
	@ApiField("mybk_auth_scene_code")
	private String mybkAuthSceneCode;

	/**
	 * 授权令牌
	 */
	@ApiField("mybk_auth_token")
	private String mybkAuthToken;

	/**
	 * Trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	public BrandQuotaQueryCondition getBrandQuotaQueryCondition() {
		return this.brandQuotaQueryCondition;
	}
	public void setBrandQuotaQueryCondition(BrandQuotaQueryCondition brandQuotaQueryCondition) {
		this.brandQuotaQueryCondition = brandQuotaQueryCondition;
	}

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getMybkAuthSceneCode() {
		return this.mybkAuthSceneCode;
	}
	public void setMybkAuthSceneCode(String mybkAuthSceneCode) {
		this.mybkAuthSceneCode = mybkAuthSceneCode;
	}

	public String getMybkAuthToken() {
		return this.mybkAuthToken;
	}
	public void setMybkAuthToken(String mybkAuthToken) {
		this.mybkAuthToken = mybkAuthToken;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
