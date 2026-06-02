package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmUserDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.mapping.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 15:02:49
 */
public class ZhimaCreditPeUserMappingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6122195721619479962L;

	/** 
	 * 芝麻分映射到白鹭分的结果，例如映射后的白鹭分：710
	 */
	@ApiField("mapped_score")
	private String mappedScore;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 经过加密后的用户的身份证号码
	 */
	@ApiField("user_cert_no")
	private ZmUserDetailModel userCertNo;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 经过加密后的用户的真实姓名
	 */
	@ApiField("user_name")
	private ZmUserDetailModel userName;

	/** 
	 * 经过加密后的用户的手机号码
	 */
	@ApiField("user_phone")
	private ZmUserDetailModel userPhone;

	public void setMappedScore(String mappedScore) {
		this.mappedScore = mappedScore;
	}
	public String getMappedScore( ) {
		return this.mappedScore;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserCertNo(ZmUserDetailModel userCertNo) {
		this.userCertNo = userCertNo;
	}
	public ZmUserDetailModel getUserCertNo( ) {
		return this.userCertNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(ZmUserDetailModel userName) {
		this.userName = userName;
	}
	public ZmUserDetailModel getUserName( ) {
		return this.userName;
	}

	public void setUserPhone(ZmUserDetailModel userPhone) {
		this.userPhone = userPhone;
	}
	public ZmUserDetailModel getUserPhone( ) {
		return this.userPhone;
	}

}
