package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗饿了么fun卡用户身份标签查询接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 10:47:47
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardflagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4689637673865767663L;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否查询饿了么额度券信息，默认false
	 */
	@ApiField("funk_edu_quan")
	private Boolean funkEduQuan;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 是否查询花呗签约，默认false
	 */
	@ApiField("query_hb_sign_flag")
	private Boolean queryHbSignFlag;

	/**
	 * 是否查询用户加密后的绑定手机号，默认false
	 */
	@ApiField("query_mobile")
	private Boolean queryMobile;

	/**
	 * 是否查询青春版状态，默认false
	 */
	@ApiField("query_youth")
	private Boolean queryYouth;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getFunkEduQuan() {
		return this.funkEduQuan;
	}
	public void setFunkEduQuan(Boolean funkEduQuan) {
		this.funkEduQuan = funkEduQuan;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getQueryHbSignFlag() {
		return this.queryHbSignFlag;
	}
	public void setQueryHbSignFlag(Boolean queryHbSignFlag) {
		this.queryHbSignFlag = queryHbSignFlag;
	}

	public Boolean getQueryMobile() {
		return this.queryMobile;
	}
	public void setQueryMobile(Boolean queryMobile) {
		this.queryMobile = queryMobile;
	}

	public Boolean getQueryYouth() {
		return this.queryYouth;
	}
	public void setQueryYouth(Boolean queryYouth) {
		this.queryYouth = queryYouth;
	}

}
