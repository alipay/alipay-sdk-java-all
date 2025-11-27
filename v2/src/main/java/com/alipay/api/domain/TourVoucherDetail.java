package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文旅凭证信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 14:41:37
 */
public class TourVoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 5294949134672325133L;

	/**
	 * 游客身份证号。必须与手机号选一必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 码信息。
一码通场景使用，碰一下场景可空。
其中seed代表商户码种子；codeToken可从扫码的码协议中获取
	 */
	@ApiField("code_info")
	private String codeInfo;

	/**
	 * 用于自定义门票适用人群的标识名称，如“学生票”“老人票”“优待票”等，可根据实际需求自由填写，便于用户快速识别适用对象。
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 特殊人群。即凭证所适用的人群类型，比如：学生票，教师票，老人票等等。当该凭证为特殊人群凭证时必须填写，不填写时默认该凭证为普通成人票，枚举值详见对接文档。
	 */
	@ApiListField("identity_type")
	@ApiField("string")
	private List<String> identityType;

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
	 * 支付宝景点id。如果是多个景区，则以逗号形式分隔id
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
	 * 凭证核销用户的openId，当凭证为核销状态时必传
	 */
	@ApiField("verify_open_id")
	private String verifyOpenId;

	/**
	 * 核销用户的支付宝账户ID。凭证为核销状态时，此字段必须填写
	 */
	@ApiField("verify_user_id")
	private String verifyUserId;

	/**
	 * 凭证详情信息。
startTime和endTime代表凭证的起止日期，必填。
verifyTime：核销时间。当凭证为核销状态时必须填写该字段。
voucherName：凭证名称/票名称，必填
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

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public List<String> getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(List<String> identityType) {
		this.identityType = identityType;
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

	public String getVerifyOpenId() {
		return this.verifyOpenId;
	}
	public void setVerifyOpenId(String verifyOpenId) {
		this.verifyOpenId = verifyOpenId;
	}

	public String getVerifyUserId() {
		return this.verifyUserId;
	}
	public void setVerifyUserId(String verifyUserId) {
		this.verifyUserId = verifyUserId;
	}

	public String getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(String voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
