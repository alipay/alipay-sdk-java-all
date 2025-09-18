package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台标准批改保期
 *
 * @author auto create
 * @since 1.0, 2024-05-29 11:56:38
 */
public class AlipayInsSceneCommonEndorseperiodApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3294555538571448126L;

	/**
	 * 期望的结束时间
	 */
	@ApiField("expected_effect_end_time")
	private Date expectedEffectEndTime;

	/**
	 * 期望的生效时间
	 */
	@ApiField("expected_effect_start_time")
	private Date expectedEffectStartTime;

	/**
	 * 幂等单号
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public Date getExpectedEffectEndTime() {
		return this.expectedEffectEndTime;
	}
	public void setExpectedEffectEndTime(Date expectedEffectEndTime) {
		this.expectedEffectEndTime = expectedEffectEndTime;
	}

	public Date getExpectedEffectStartTime() {
		return this.expectedEffectStartTime;
	}
	public void setExpectedEffectStartTime(Date expectedEffectStartTime) {
		this.expectedEffectStartTime = expectedEffectStartTime;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
