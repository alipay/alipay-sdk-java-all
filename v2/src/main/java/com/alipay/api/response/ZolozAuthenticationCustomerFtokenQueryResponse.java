package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZhubUidTelPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.ftoken.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-18 14:12:03
 */
public class ZolozAuthenticationCustomerFtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6729172343651126645L;

	/** 
	 * 年龄是否在指定范围内，未指定范围则返回空，true/false
	 */
	@ApiField("age_check_result")
	private String ageCheckResult;

	/** 
	 * 图片base64 encodeString
	 */
	@ApiField("authimg_base_64")
	private String authimgBase64;

	/** 
	 * 证件姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 由ISV定义的对自然人唯一编码，举例可以是身份证号码和姓名的MD5值，或者是其他编码方式，要求脱敏、随机且在ISV可以唯一说明一个自然人
	 */
	@ApiField("face_id")
	private String faceId;

	/** 
	 * 支付宝用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * 用户名信息返回的列表
	 */
	@ApiListField("uid_tel_pair_list")
	@ApiField("zhub_uid_tel_pair")
	private List<ZhubUidTelPair> uidTelPairList;

	public void setAgeCheckResult(String ageCheckResult) {
		this.ageCheckResult = ageCheckResult;
	}
	public String getAgeCheckResult( ) {
		return this.ageCheckResult;
	}

	public void setAuthimgBase64(String authimgBase64) {
		this.authimgBase64 = authimgBase64;
	}
	public String getAuthimgBase64( ) {
		return this.authimgBase64;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}
	public String getFaceId( ) {
		return this.faceId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUidTelPairList(List<ZhubUidTelPair> uidTelPairList) {
		this.uidTelPairList = uidTelPairList;
	}
	public List<ZhubUidTelPair> getUidTelPairList( ) {
		return this.uidTelPairList;
	}

}
