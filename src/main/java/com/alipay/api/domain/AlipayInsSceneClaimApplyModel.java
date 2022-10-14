package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔受理
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:42
 */
public class AlipayInsSceneClaimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7586449612694985382L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 受益人
	 */
	@ApiField("beneficiary")
	private InsPerson beneficiary;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 理赔因子;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 索赔金额（如果需要外部指定则必填），单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 报案时相关的保单信息
	 */
	@ApiListField("claim_policy_list")
	@ApiField("ins_claim_policy")
	private List<InsClaimPolicy> claimPolicyList;

	/**
	 * 商户生成的外部投保业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的理赔请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public InsPerson getBeneficiary() {
		return this.beneficiary;
	}
	public void setBeneficiary(InsPerson beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBillTitle() {
		return this.billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Long getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	public List<InsClaimPolicy> getClaimPolicyList() {
		return this.claimPolicyList;
	}
	public void setClaimPolicyList(List<InsClaimPolicy> claimPolicyList) {
		this.claimPolicyList = claimPolicyList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public InsPerson getReporter() {
		return this.reporter;
	}
	public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

}
