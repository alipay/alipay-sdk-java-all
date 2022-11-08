package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣协议迁移
 *
 * @author auto create
 * @since 1.0, 2022-05-07 10:37:06
 */
public class AlipayUserAgreementMigrateModel extends AlipayObject {

	private static final long serialVersionUID = 8822791774827287524L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 需要迁移的目标商户应用id
	 */
	@ApiField("target_app_id")
	private String targetAppId;

	/**
	 * 需要迁移的目标商户调用应用id
	 */
	@ApiField("target_invoke_app_id")
	private String targetInvokeAppId;

	/**
	 * 需要迁移的目标商户id
	 */
	@ApiField("target_partner_id")
	private String targetPartnerId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getTargetAppId() {
		return this.targetAppId;
	}
	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getTargetInvokeAppId() {
		return this.targetInvokeAppId;
	}
	public void setTargetInvokeAppId(String targetInvokeAppId) {
		this.targetInvokeAppId = targetInvokeAppId;
	}

	public String getTargetPartnerId() {
		return this.targetPartnerId;
	}
	public void setTargetPartnerId(String targetPartnerId) {
		this.targetPartnerId = targetPartnerId;
	}

}
