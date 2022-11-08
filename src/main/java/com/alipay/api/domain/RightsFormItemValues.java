package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 立信权益表单模型
 *
 * @author auto create
 * @since 1.0, 2022-10-09 14:52:50
 */
public class RightsFormItemValues extends AlipayObject {

	private static final long serialVersionUID = 6571869284395192438L;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 联系人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 用户姓名
	 */
	@ApiField("legal_person")
	private String legalPerson;

	/**
	 * 用户的支付宝用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 表单中的其他字段
	 */
	@ApiListField("other_fields")
	@ApiField("label_value")
	private List<LabelValue> otherFields;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 表单提交时间
	 */
	@ApiField("submit_time")
	private Date submitTime;

	/**
	 * 用户的支付宝id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getLegalPerson() {
		return this.legalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<LabelValue> getOtherFields() {
		return this.otherFields;
	}
	public void setOtherFields(List<LabelValue> otherFields) {
		this.otherFields = otherFields;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
