package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多保单投保申请
 *
 * @author auto create
 * @since 1.0, 2017-09-28 17:22:49
 */
public class AlipayInsSceneApplicationGroupApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6284671181426328366L;

	/**
	 * 收件人
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保申请信息列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application")
	private List<InsApplication> applications;

	/**
	 * 保费支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public InsAddressee getAddressee() {
		return this.addressee;
	}
	public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public List<InsApplication> getApplications() {
		return this.applications;
	}
	public void setApplications(List<InsApplication> applications) {
		this.applications = applications;
	}

	public String getBillTitle() {
		return this.billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
