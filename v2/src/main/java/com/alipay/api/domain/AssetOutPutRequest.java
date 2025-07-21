package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户资产出库请求实体类
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:38:05
 */
public class AssetOutPutRequest extends AlipayObject {

	private static final long serialVersionUID = 4576121825568794173L;

	/**
	 * MD5加密或明文,落库会MD5加密
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 权益号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 景区id
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
