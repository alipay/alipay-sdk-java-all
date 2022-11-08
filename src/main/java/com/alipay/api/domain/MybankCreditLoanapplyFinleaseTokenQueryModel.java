package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 3C租赁网商受托代扣URL地址获取
 *
 * @author auto create
 * @since 1.0, 2022-09-29 13:44:02
 */
public class MybankCreditLoanapplyFinleaseTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7579713246323891762L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 业务内容
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务场景(MY_BANK_WITH_HOLD:网商受托代扣)
	 */
	@ApiField("biz_sence")
	private String bizSence;

	/**
	 * 商户ipid
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户ipRoleId
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 操作类型
	 */
	@ApiField("option_type")
	private String optionType;

	/**
	 * 请求时间
	 */
	@ApiField("request_date")
	private String requestDate;

	/**
	 * 幂等号，不能重复
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizSence() {
		return this.bizSence;
	}
	public void setBizSence(String bizSence) {
		this.bizSence = bizSence;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOptionType() {
		return this.optionType;
	}
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getRequestDate() {
		return this.requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
