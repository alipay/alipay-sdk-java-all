package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学分银行学生档案数据更新接口
 *
 * @author auto create
 * @since 1.0, 2023-06-19 20:51:54
 */
public class AlipayCommerceEducateCreditbankStudyprofileModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6168716874752141912L;

	/**
	 * 学分银行用户ID
	 */
	@ApiField("cb_id")
	private String cbId;

	/**
	 * 获得证书信息
	 */
	@ApiListField("certificate_experience")
	@ApiField("credit_bank_certificate_experience")
	private List<CreditBankCertificateExperience> certificateExperience;

	/**
	 * 职业培训成果数量
	 */
	@ApiField("certificate_num")
	private Long certificateNum;

	/**
	 * 渠道，默认值：shcreditbank(上海学分银行)
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 成绩档案信息
	 */
	@ApiListField("credit")
	@ApiField("credit_bank_credit")
	private List<CreditBankCredit> credit;

	/**
	 * 学历教育成果数量
	 */
	@ApiField("credit_num")
	private Long creditNum;

	/**
	 * 培训经历
	 */
	@ApiListField("training")
	@ApiField("credit_bank_training")
	private List<CreditBankTraining> training;

	/**
	 * 培训经历成果数量
	 */
	@ApiField("training_num")
	private Long trainingNum;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCbId() {
		return this.cbId;
	}
	public void setCbId(String cbId) {
		this.cbId = cbId;
	}

	public List<CreditBankCertificateExperience> getCertificateExperience() {
		return this.certificateExperience;
	}
	public void setCertificateExperience(List<CreditBankCertificateExperience> certificateExperience) {
		this.certificateExperience = certificateExperience;
	}

	public Long getCertificateNum() {
		return this.certificateNum;
	}
	public void setCertificateNum(Long certificateNum) {
		this.certificateNum = certificateNum;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<CreditBankCredit> getCredit() {
		return this.credit;
	}
	public void setCredit(List<CreditBankCredit> credit) {
		this.credit = credit;
	}

	public Long getCreditNum() {
		return this.creditNum;
	}
	public void setCreditNum(Long creditNum) {
		this.creditNum = creditNum;
	}

	public List<CreditBankTraining> getTraining() {
		return this.training;
	}
	public void setTraining(List<CreditBankTraining> training) {
		this.training = training;
	}

	public Long getTrainingNum() {
		return this.trainingNum;
	}
	public void setTrainingNum(Long trainingNum) {
		this.trainingNum = trainingNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
