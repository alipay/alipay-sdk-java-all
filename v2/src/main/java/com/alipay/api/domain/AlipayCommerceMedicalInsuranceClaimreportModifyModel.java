package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新理赔单状态
 *
 * @author auto create
 * @since 1.0, 2025-06-24 19:18:35
 */
public class AlipayCommerceMedicalInsuranceClaimreportModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8813112783593161855L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * ?户证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * ?付宝?成的业务流?号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 结算信息列表
	 */
	@ApiListField("selt_info_list")
	@ApiField("selt_info_list")
	private List<SeltInfoList> seltInfoList;

	/**
	 * 交易来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 理赔总金额
	 */
	@ApiField("total_claim_amount")
	private String totalClaimAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public List<SeltInfoList> getSeltInfoList() {
		return this.seltInfoList;
	}
	public void setSeltInfoList(List<SeltInfoList> seltInfoList) {
		this.seltInfoList = seltInfoList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTotalClaimAmount() {
		return this.totalClaimAmount;
	}
	public void setTotalClaimAmount(String totalClaimAmount) {
		this.totalClaimAmount = totalClaimAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
