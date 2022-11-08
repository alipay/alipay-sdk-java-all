package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构筛选SMID校验结果
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:14:45
 */
public class MerchantIndirectSmidVerifyResultRecord extends AlipayObject {

	private static final long serialVersionUID = 3832399517629936856L;

	/**
	 * org_id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 商户smid (支付宝进件商户号)
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 校验结果值
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 如果校验失败，返回用户的提示信息(如果校验失败，此参数为必填)
	 */
	@ApiField("verifiy_failed_msg")
	private String verifiyFailedMsg;

	/**
	 * 校验结果(true=允许用户访问小程序，false=禁止用户访问小程序)
	 */
	@ApiField("verifiy_result")
	private Boolean verifiyResult;

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getVerifiyFailedMsg() {
		return this.verifiyFailedMsg;
	}
	public void setVerifiyFailedMsg(String verifiyFailedMsg) {
		this.verifiyFailedMsg = verifiyFailedMsg;
	}

	public Boolean getVerifiyResult() {
		return this.verifiyResult;
	}
	public void setVerifiyResult(Boolean verifiyResult) {
		this.verifiyResult = verifiyResult;
	}

}
