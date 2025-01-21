package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通用户合约信息同步
 *
 * @author auto create
 * @since 1.0, 2023-07-04 13:49:16
 */
public class AlipayEbppIndustryOnecodepassAgreementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5228181368779678536L;

	/**
	 * 合约号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 合约类型
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 码类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 支付宝用户openid，和uid不能同时为空
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 合约不可用状态码，action=UPDATE status=OFF进行禁码时必填
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 合约异常下的提示
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/**
	 * 同步操作
	 */
	@ApiField("sync_action")
	private String syncAction;

	/**
	 * 支付宝用户uid，和open_id不能同时为空
	 */
	@ApiField("uid")
	private String uid;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMsg() {
		return this.statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getSyncAction() {
		return this.syncAction;
	}
	public void setSyncAction(String syncAction) {
		this.syncAction = syncAction;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
