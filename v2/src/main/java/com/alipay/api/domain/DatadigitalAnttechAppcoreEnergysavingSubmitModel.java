package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 节能申请接口
 *
 * @author auto create
 * @since 1.0, 2024-07-22 14:19:00
 */
public class DatadigitalAnttechAppcoreEnergysavingSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6646528862942633393L;

	/**
	 * 申请时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 企业社会统一信用代码
	 */
	@ApiField("company_uscc")
	private String companyUscc;

	/**
	 * 供热卡号
	 */
	@ApiField("heating_card_number")
	private String heatingCardNumber;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 住户ID，数据是热力公司自定义的id，数据来源于热力公司
	 */
	@ApiField("resident_id")
	private String residentId;

	/**
	 * 提交类型
	 */
	@ApiField("submit_type")
	private String submitType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getCompanyUscc() {
		return this.companyUscc;
	}
	public void setCompanyUscc(String companyUscc) {
		this.companyUscc = companyUscc;
	}

	public String getHeatingCardNumber() {
		return this.heatingCardNumber;
	}
	public void setHeatingCardNumber(String heatingCardNumber) {
		this.heatingCardNumber = heatingCardNumber;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getResidentId() {
		return this.residentId;
	}
	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getSubmitType() {
		return this.submitType;
	}
	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
