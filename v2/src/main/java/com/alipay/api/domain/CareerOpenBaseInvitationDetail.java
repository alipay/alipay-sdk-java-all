package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-08 09:47:54
 */
public class CareerOpenBaseInvitationDetail extends AlipayObject {

	private static final long serialVersionUID = 1127356611798534287L;

	/**
	 * 使用SM4算法加密后的手机号密文
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 外部业务单号，长度为1至64位，仅支持英文字母和数字；需要保持业务号的唯一性，相同 out_biz_no 重复提交会被拒绝，整批申请不予受理
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部平台的岗位id，与appId联合定位岗位
	 */
	@ApiField("out_job_id")
	private String outJobId;

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

}
