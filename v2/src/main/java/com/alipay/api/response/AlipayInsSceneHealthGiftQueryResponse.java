package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.gift.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayInsSceneHealthGiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5392112618638721599L;

	/** 
	 * 赠险是否已开通，true标识已开通，false标识未开通
	 */
	@ApiField("already_open")
	private Boolean alreadyOpen;

	/** 
	 * 返回当前可领取保额的赠险类型。HEALTH_BEAN_SIMPLE_UPGRADE表示免费医疗金
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 可领取的保额
	 */
	@ApiField("delta_sum_insured")
	private String deltaSumInsured;

	/** 
	 * 某渠道已领取保额
	 */
	@ApiField("source_gained_sum_insured")
	private String sourceGainedSumInsured;

	/** 
	 * 当前在保保额
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	public void setAlreadyOpen(Boolean alreadyOpen) {
		this.alreadyOpen = alreadyOpen;
	}
	public Boolean getAlreadyOpen( ) {
		return this.alreadyOpen;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDeltaSumInsured(String deltaSumInsured) {
		this.deltaSumInsured = deltaSumInsured;
	}
	public String getDeltaSumInsured( ) {
		return this.deltaSumInsured;
	}

	public void setSourceGainedSumInsured(String sourceGainedSumInsured) {
		this.sourceGainedSumInsured = sourceGainedSumInsured;
	}
	public String getSourceGainedSumInsured( ) {
		return this.sourceGainedSumInsured;
	}

	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getSumInsured( ) {
		return this.sumInsured;
	}

}
