package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身初始化
 *
 * @author auto create
 * @since 1.0, 2024-04-17 17:31:24
 */
public class DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2468177517541311513L;

	/**
	 * 人脸核身具体类型目前仅支持：DATA_DIGITAL_BIZ_CODE_FACE_VERIFICATION
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 真实姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，当前枚举支持：
IDENTITY_CARD：身份证
RESIDENCE_HK_MC：港澳居民居住证
RESIDENCE_TAIWAN：台湾居民居住证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 人脸保存策略，非必填。具体取值为：reserve(保存活体人脸)/never(不保存活体人脸)，不传默认为reserve
	 */
	@ApiField("face_reserve_strategy")
	private String faceReserveStrategy;

	/**
	 * 认证类型，固定值为：CERT_INFO
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 国家地区代码，当证件类型为外国人永久居留证时必填。
	 */
	@ApiField("nation")
	private String nation;

	/**
	 * 商户请求的唯一标识，商户要保证其唯一性，值为64位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	/**
	 * 手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getFaceReserveStrategy() {
		return this.faceReserveStrategy;
	}
	public void setFaceReserveStrategy(String faceReserveStrategy) {
		this.faceReserveStrategy = faceReserveStrategy;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getNation() {
		return this.nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
