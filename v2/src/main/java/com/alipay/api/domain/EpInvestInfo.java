package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业对外投资明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:46
 */
public class EpInvestInfo extends AlipayObject {

	private static final long serialVersionUID = 4414212116136212455L;

	/**
	 * 被投资公司的核准日期
	 */
	@ApiField("approval_date")
	private String approvalDate;

	/**
	 * 持股比例
	 */
	@ApiField("holding_rate")
	private String holdingRate;

	/**
	 * 投资数额，单位人名币万元
	 */
	@ApiField("inv_amount")
	private String invAmount;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("legal_representative")
	private String legalRepresentative;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被投资公司的曾用名
	 */
	@ApiListField("old_name")
	@ApiField("string")
	private List<String> oldName;

	/**
	 * 被投资公司的登记机关
	 */
	@ApiField("registe_organ")
	private String registeOrgan;

	/**
	 * 企业注册号
	 */
	@ApiField("registr_id")
	private String registrId;

	/**
	 * 被投资公司的登记状态
	 */
	@ApiField("registration_state")
	private String registrationState;

	/**
	 * 企业注册号或统一社会信用代码，一般为18位
	 */
	@ApiField("tyshxydm")
	private String tyshxydm;

	public String getApprovalDate() {
		return this.approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getHoldingRate() {
		return this.holdingRate;
	}
	public void setHoldingRate(String holdingRate) {
		this.holdingRate = holdingRate;
	}

	public String getInvAmount() {
		return this.invAmount;
	}
	public void setInvAmount(String invAmount) {
		this.invAmount = invAmount;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOldName() {
		return this.oldName;
	}
	public void setOldName(List<String> oldName) {
		this.oldName = oldName;
	}

	public String getRegisteOrgan() {
		return this.registeOrgan;
	}
	public void setRegisteOrgan(String registeOrgan) {
		this.registeOrgan = registeOrgan;
	}

	public String getRegistrId() {
		return this.registrId;
	}
	public void setRegistrId(String registrId) {
		this.registrId = registrId;
	}

	public String getRegistrationState() {
		return this.registrationState;
	}
	public void setRegistrationState(String registrationState) {
		this.registrationState = registrationState;
	}

	public String getTyshxydm() {
		return this.tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

}
