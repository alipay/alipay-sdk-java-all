package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.funcardflag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 10:52:21
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardflagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8354354981936151633L;

	/** 
	 * 当前是否有饿了么额度券
	 */
	@ApiField("edu_quan_flag")
	private Boolean eduQuanFlag;

	/** 
	 * 是否花呗签约用户
	 */
	@ApiField("hb_sign")
	private Boolean hbSign;

	/** 
	 * 是否信用购用户
	 */
	@ApiField("hua_plus")
	private Boolean huaPlus;

	/** 
	 * 脱敏手机号
	 */
	@ApiField("mobile_info")
	private String mobileInfo;

	/** 
	 * 是否青春版用户
	 */
	@ApiField("youth_flag")
	private Boolean youthFlag;

	public void setEduQuanFlag(Boolean eduQuanFlag) {
		this.eduQuanFlag = eduQuanFlag;
	}
	public Boolean getEduQuanFlag( ) {
		return this.eduQuanFlag;
	}

	public void setHbSign(Boolean hbSign) {
		this.hbSign = hbSign;
	}
	public Boolean getHbSign( ) {
		return this.hbSign;
	}

	public void setHuaPlus(Boolean huaPlus) {
		this.huaPlus = huaPlus;
	}
	public Boolean getHuaPlus( ) {
		return this.huaPlus;
	}

	public void setMobileInfo(String mobileInfo) {
		this.mobileInfo = mobileInfo;
	}
	public String getMobileInfo( ) {
		return this.mobileInfo;
	}

	public void setYouthFlag(Boolean youthFlag) {
		this.youthFlag = youthFlag;
	}
	public Boolean getYouthFlag( ) {
		return this.youthFlag;
	}

}
