package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息查询
 *
 * @author auto create
 * @since 1.0, 2024-07-22 14:21:42
 */
public class DatadigitalAnttechAppcoreUserbizinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4787433862914621257L;

	/**
	 * 公司统一社会信用证代码，如所属供热公司统一社会信用证代码
	 */
	@ApiField("company_uscc")
	private String companyUscc;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 查询类型，按手机号还是卡来查询
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 供热住户的id,来自供热公司的的定义，是由热力公司返回的自定义id
	 */
	@ApiField("resident_id")
	private String residentId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyUscc() {
		return this.companyUscc;
	}
	public void setCompanyUscc(String companyUscc) {
		this.companyUscc = companyUscc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getResidentId() {
		return this.residentId;
	}
	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
