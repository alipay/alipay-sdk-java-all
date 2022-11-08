package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备人脸关系数据
 *
 * @author auto create
 * @since 1.0, 2022-06-08 14:30:04
 */
public class HotelRoomFaceInfoRes extends AlipayObject {

	private static final long serialVersionUID = 3733461564329532567L;

	/**
	 * 账号类型，默认：anonymous 匿名
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 验证名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 用户手机号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 验证类型，默认值：PHONE_NO
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户id，一般是isv的pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 用户手机号信息
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部出入的人脸id
	 */
	@ApiField("out_face_id")
	private String outFaceId;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutFaceId() {
		return this.outFaceId;
	}
	public void setOutFaceId(String outFaceId) {
		this.outFaceId = outFaceId;
	}

}
