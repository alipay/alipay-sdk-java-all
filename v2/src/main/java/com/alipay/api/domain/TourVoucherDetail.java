package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文旅凭证信息
 *
 * @author auto create
 * @since 1.0, 2025-08-04 10:58:13
 */
public class TourVoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 3856269579893677333L;

	/**
	 * 游客身份证号。必须与手机号选一必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 码信息。
一码通场景使用，碰一下场景可空。
其中seed代表码种子
	 */
	@ApiField("code_info")
	private String codeInfo;

	/**
	 * 游客姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 已废弃 当前字段已废弃(字段所用场景业务已废弃)
	 */
	@ApiField("out_vercher_id")
	@Deprecated
	private String outVercherId;

	/**
	 * 凭证号
	 */
	@ApiField("out_voucher_id")
	private String outVoucherId;

	/**
	 * 支付宝景点id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * 可核销次数。如果无限次，则填MAX
	 */
	@ApiField("source_num")
	private String sourceNum;

	/**
	 * 凭证状态。
UNUSED-待使用。
USED-已使用（已核销）
REFUNDED-已退款
	 */
	@ApiField("status")
	private String status;

	/**
	 * 游客手机号。必须与身份证号选一必填
	 */
	@ApiField("tele_no")
	private String teleNo;

	/**
	 * 凭证详情信息。
startTime和endTime代表凭证的起止日期，必填。
	 */
	@ApiField("voucher_info")
	private String voucherInfo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCodeInfo() {
		return this.codeInfo;
	}
	public void setCodeInfo(String codeInfo) {
		this.codeInfo = codeInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutVercherId() {
		return this.outVercherId;
	}
	public void setOutVercherId(String outVercherId) {
		this.outVercherId = outVercherId;
	}

	public String getOutVoucherId() {
		return this.outVoucherId;
	}
	public void setOutVoucherId(String outVoucherId) {
		this.outVoucherId = outVoucherId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getSourceNum() {
		return this.sourceNum;
	}
	public void setSourceNum(String sourceNum) {
		this.sourceNum = sourceNum;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

	public String getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(String voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
