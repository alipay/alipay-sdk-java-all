package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政企团购分期授信复审
 *
 * @author auto create
 * @since 1.0, 2025-03-21 17:36:56
 */
public class XingheLendassistSrcfgestagecreditSecondApproveModel extends AlipayObject {

	private static final long serialVersionUID = 5122924986126612842L;

	/**
	 * 政企员工团购分期授信初审的申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 员工政企单位统一社会信用代码，外部复审结果通过时必传
	 */
	@ApiField("gov_enter_cert_no")
	private String govEnterCertNo;

	/**
	 * 员工政企单位名称，外部复审结果通过时必传
	 */
	@ApiField("gov_enter_name")
	private String govEnterName;

	/**
	 * 平台为接入客户分配
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 员工是否为领导标识，NOT_LEADER-不是领导 、LEADER-是领导
	 */
	@ApiField("leader_flag")
	private String leaderFlag;

	/**
	 * 唯一标识政企员工团购分期授信请求
	 */
	@ApiField("out_bsn_no")
	private String outBsnNo;

	/**
	 * 外部复审结果
	 */
	@ApiField("out_review_result")
	private String outReviewResult;

	/**
	 * 业务所属产品，平台为业务分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 政企员工的身份证号
	 */
	@ApiField("user_id_card")
	private String userIdCard;

	/**
	 * 政企员工的姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 政企员工名下手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getGovEnterCertNo() {
		return this.govEnterCertNo;
	}
	public void setGovEnterCertNo(String govEnterCertNo) {
		this.govEnterCertNo = govEnterCertNo;
	}

	public String getGovEnterName() {
		return this.govEnterName;
	}
	public void setGovEnterName(String govEnterName) {
		this.govEnterName = govEnterName;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getLeaderFlag() {
		return this.leaderFlag;
	}
	public void setLeaderFlag(String leaderFlag) {
		this.leaderFlag = leaderFlag;
	}

	public String getOutBsnNo() {
		return this.outBsnNo;
	}
	public void setOutBsnNo(String outBsnNo) {
		this.outBsnNo = outBsnNo;
	}

	public String getOutReviewResult() {
		return this.outReviewResult;
	}
	public void setOutReviewResult(String outReviewResult) {
		this.outReviewResult = outReviewResult;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getUserIdCard() {
		return this.userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
