package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园小荷包返回给商户的信息，包含出入金额度是否到达临界值，是否为代签约等信息
 *
 * @author auto create
 * @since 1.0, 2025-09-07 11:01:14
 */
public class JASchoolEntityInfo extends AlipayObject {

	private static final long serialVersionUID = 1495788175314225544L;

	/**
	 * 小荷包ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 校内额度是否将要到达临界值
	 */
	@ApiField("in_school_alert")
	private Boolean inSchoolAlert;

	/**
	 * 校外额度是否将要到达临界值
	 */
	@ApiField("out_school_alert")
	private Boolean outSchoolAlert;

	/**
	 * 是否签约代扣
	 */
	@ApiField("sign_withhold")
	private Boolean signWithhold;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Boolean getInSchoolAlert() {
		return this.inSchoolAlert;
	}
	public void setInSchoolAlert(Boolean inSchoolAlert) {
		this.inSchoolAlert = inSchoolAlert;
	}

	public Boolean getOutSchoolAlert() {
		return this.outSchoolAlert;
	}
	public void setOutSchoolAlert(Boolean outSchoolAlert) {
		this.outSchoolAlert = outSchoolAlert;
	}

	public Boolean getSignWithhold() {
		return this.signWithhold;
	}
	public void setSignWithhold(Boolean signWithhold) {
		this.signWithhold = signWithhold;
	}

}
