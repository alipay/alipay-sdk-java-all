package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户资产出库请求实体类
 *
 * @author auto create
 * @since 1.0, 2025-08-06 21:06:44
 */
public class AssetOutPutRequest extends AlipayObject {

	private static final long serialVersionUID = 4637111582689899182L;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 凭证号
	 */
	@ApiField("out_voucher_id")
	private String outVoucherId;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户手机号
	 */
	@ApiField("tele_no")
	private String teleNo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutVoucherId() {
		return this.outVoucherId;
	}
	public void setOutVoucherId(String outVoucherId) {
		this.outVoucherId = outVoucherId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

}
