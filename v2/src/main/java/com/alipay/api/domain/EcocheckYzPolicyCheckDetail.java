package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流驿站小程序激励政策验收结果
 *
 * @author auto create
 * @since 1.0, 2023-06-25 19:03:52
 */
public class EcocheckYzPolicyCheckDetail extends AlipayObject {

	private static final long serialVersionUID = 1225313535429655189L;

	/**
	 * 小程序id
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 小程序是否上线，true代表是，false代表否
	 */
	@ApiField("app_online_check")
	private Boolean appOnlineCheck;

	/**
	 * 小程序月活用户数
	 */
	@ApiField("mau")
	private Long mau;

	/**
	 * 是否接入消息能力，true代表是，false代表否
	 */
	@ApiField("msg_check")
	private Boolean msgCheck;

	/**
	 * 是否完成物料张贴，true代表是，false代表否
	 */
	@ApiField("post_check")
	private Boolean postCheck;

	/**
	 * 是否接入扫码能力，true代表是，false代表否
	 */
	@ApiField("scan_check")
	private Boolean scanCheck;

	/**
	 * 是否配置搜索关键词，true代表是，false代表否
	 */
	@ApiField("searchkeyword_check")
	private Boolean searchkeywordCheck;

	/**
	 * 是否完成服务提报，true代表是，false代表否
	 */
	@ApiField("service_apply_check")
	private Boolean serviceApplyCheck;

	/**
	 * 服务提报校验不通过的原因
	 */
	@ApiField("service_apply_check_fail_reason")
	private String serviceApplyCheckFailReason;

	/**
	 * 是否是三方小程序，true代表是，false代表否
	 */
	@ApiField("thirdparty_app_check")
	private Boolean thirdpartyAppCheck;

	/**
	 * 当月有效交易笔数
	 */
	@ApiField("valid_trans_amount")
	private Long validTransAmount;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public Boolean getAppOnlineCheck() {
		return this.appOnlineCheck;
	}
	public void setAppOnlineCheck(Boolean appOnlineCheck) {
		this.appOnlineCheck = appOnlineCheck;
	}

	public Long getMau() {
		return this.mau;
	}
	public void setMau(Long mau) {
		this.mau = mau;
	}

	public Boolean getMsgCheck() {
		return this.msgCheck;
	}
	public void setMsgCheck(Boolean msgCheck) {
		this.msgCheck = msgCheck;
	}

	public Boolean getPostCheck() {
		return this.postCheck;
	}
	public void setPostCheck(Boolean postCheck) {
		this.postCheck = postCheck;
	}

	public Boolean getScanCheck() {
		return this.scanCheck;
	}
	public void setScanCheck(Boolean scanCheck) {
		this.scanCheck = scanCheck;
	}

	public Boolean getSearchkeywordCheck() {
		return this.searchkeywordCheck;
	}
	public void setSearchkeywordCheck(Boolean searchkeywordCheck) {
		this.searchkeywordCheck = searchkeywordCheck;
	}

	public Boolean getServiceApplyCheck() {
		return this.serviceApplyCheck;
	}
	public void setServiceApplyCheck(Boolean serviceApplyCheck) {
		this.serviceApplyCheck = serviceApplyCheck;
	}

	public String getServiceApplyCheckFailReason() {
		return this.serviceApplyCheckFailReason;
	}
	public void setServiceApplyCheckFailReason(String serviceApplyCheckFailReason) {
		this.serviceApplyCheckFailReason = serviceApplyCheckFailReason;
	}

	public Boolean getThirdpartyAppCheck() {
		return this.thirdpartyAppCheck;
	}
	public void setThirdpartyAppCheck(Boolean thirdpartyAppCheck) {
		this.thirdpartyAppCheck = thirdpartyAppCheck;
	}

	public Long getValidTransAmount() {
		return this.validTransAmount;
	}
	public void setValidTransAmount(Long validTransAmount) {
		this.validTransAmount = validTransAmount;
	}

}
