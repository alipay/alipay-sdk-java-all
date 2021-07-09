package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字身份电子凭证同步接口
 *
 * @author auto create
 * @since 1.0, 2021-06-17 19:11:51
 */
public class AlipayUserDigitalidentityCertificateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5219924195727277146L;

	/**
	 * 用户申领信息核验模式，该字段值与传入的用户姓名及证件号相关联。例如PLAIN模式下原文对比传入的用户申领信息与支付宝侧信息是否一致。
	 */
	@ApiField("apply_info_verify_mode")
	private String applyInfoVerifyMode;

	/**
	 * 用户领取的凭证唯一ID（由机构生成表达唯一性的标识，同一自然人多次申领时要求该ID唯一且幂等相同）
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 凭证实例标识（标识某个具体的凭证类型，比如上海身份码，该字段值由支付宝分配）
	 */
	@ApiField("certificate_instance_code")
	private String certificateInstanceCode;

	/**
	 * 拓展字段，JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 凭证状态（表达新增/修改/删除状态）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户申领时证件号，当前仅支持身份证号（用于已领取卡面脱敏展示）。在PLAIN模式下需传入证件号明文；MD5模式下需传入证件号MD5摘要
	 */
	@ApiField("user_apply_cert_no")
	private String userApplyCertNo;

	/**
	 * 用户申领时证件类型，当前仅支持身份证类型（IDENTITY_CARD）
	 */
	@ApiField("user_apply_cert_type")
	private String userApplyCertType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名（用于已领取卡面脱敏展示）。在PLAIN模式下需传入姓名明文；MD5模式下需传入姓名MD5摘要
	 */
	@ApiField("user_name")
	private String userName;

	public String getApplyInfoVerifyMode() {
		return this.applyInfoVerifyMode;
	}
	public void setApplyInfoVerifyMode(String applyInfoVerifyMode) {
		this.applyInfoVerifyMode = applyInfoVerifyMode;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateInstanceCode() {
		return this.certificateInstanceCode;
	}
	public void setCertificateInstanceCode(String certificateInstanceCode) {
		this.certificateInstanceCode = certificateInstanceCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserApplyCertNo() {
		return this.userApplyCertNo;
	}
	public void setUserApplyCertNo(String userApplyCertNo) {
		this.userApplyCertNo = userApplyCertNo;
	}

	public String getUserApplyCertType() {
		return this.userApplyCertType;
	}
	public void setUserApplyCertType(String userApplyCertType) {
		this.userApplyCertType = userApplyCertType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
