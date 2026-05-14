package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MobileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.mcp.phone.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class AlipayCommerceAcommunicationMcpPhoneCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1747224365136874177L;

	/** 
	 * 支付宝uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 手机号运营商信息
	 */
	@ApiField("mobile_info")
	private MobileInfo mobileInfo;

	/** 
	 * 支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 手机号尾号对应的姓名部分（仅当verfyType为PART_NAME时有值）
	 */
	@ApiField("part_mobile_name")
	private String partMobileName;

	/** 
	 * 风控验证类型
	 */
	@ApiField("verify_type")
	private String verifyType;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setMobileInfo(MobileInfo mobileInfo) {
		this.mobileInfo = mobileInfo;
	}
	public MobileInfo getMobileInfo( ) {
		return this.mobileInfo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPartMobileName(String partMobileName) {
		this.partMobileName = partMobileName;
	}
	public String getPartMobileName( ) {
		return this.partMobileName;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}
	public String getVerifyType( ) {
		return this.verifyType;
	}

}
