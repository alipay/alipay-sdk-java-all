package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政企单位准入审核
 *
 * @author auto create
 * @since 1.0, 2025-03-21 17:36:56
 */
public class XingheLendassistSrcfgoventerAccessApproveModel extends AlipayObject {

	private static final long serialVersionUID = 4414724541949355842L;

	/**
	 * 需审核的政企单位统一社会信用代码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 需审核的政企单位名称
	 */
	@ApiField("gov_enter_name")
	private String govEnterName;

	/**
	 * 客户id，平台为接入客户分配
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 唯一标识政企单位准入审核请求
	 */
	@ApiField("out_bsn_no")
	private String outBsnNo;

	/**
	 * 业务所属产品，平台为业务分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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

	public String getOutBsnNo() {
		return this.outBsnNo;
	}
	public void setOutBsnNo(String outBsnNo) {
		this.outBsnNo = outBsnNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
