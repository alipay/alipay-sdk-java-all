package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用等级数据结果
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class CreditRateResult extends AlipayObject {

	private static final long serialVersionUID = 5399885576438214213L;

	/**
	 * 信用等级范围最大值，范围是1-12，是闭区间
	 */
	@ApiField("cr_rank")
	private Long crRank;

	/**
	 * 信用等级分档名称
	 */
	@ApiField("cr_rank_title")
	private String crRankTitle;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 企业状态
	 */
	@ApiField("ep_status")
	private String epStatus;

	/**
	 * 信用等级数据
	 */
	@ApiField("pass_status")
	private String passStatus;

	public Long getCrRank() {
		return this.crRank;
	}
	public void setCrRank(Long crRank) {
		this.crRank = crRank;
	}

	public String getCrRankTitle() {
		return this.crRankTitle;
	}
	public void setCrRankTitle(String crRankTitle) {
		this.crRankTitle = crRankTitle;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpStatus() {
		return this.epStatus;
	}
	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}

	public String getPassStatus() {
		return this.passStatus;
	}
	public void setPassStatus(String passStatus) {
		this.passStatus = passStatus;
	}

}
