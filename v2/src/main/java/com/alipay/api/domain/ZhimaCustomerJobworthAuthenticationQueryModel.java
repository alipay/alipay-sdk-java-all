package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得身份认证查询接口
 *
 * @author auto create
 * @since 1.0, 2023-12-25 16:39:15
 */
public class ZhimaCustomerJobworthAuthenticationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3359367565661658562L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * "身份证 : 0"，"护照: 1"，"台湾往来通行证：4","港澳往来通行证：3", "回乡证: 2"；"港澳证件：5"
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 调用第一步创建接口的out_agreement_no，由外部传入
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 04:教师，其它身份类型联系芝麻技术支持确认
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台
	 */
	@ApiField("once_token")
	private String onceToken;

	/**
	 * 蚂蚁统一会员ID
和身份证任选一个传入
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * exact:精确查询,dim:模糊查询
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 信用服务id，商家接入产品功能包时有运营同学分配
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁统一会员ID
和身份证任选一个传入
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getConnKey() {
		return this.connKey;
	}
	public void setConnKey(String connKey) {
		this.connKey = connKey;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOnceToken() {
		return this.onceToken;
	}
	public void setOnceToken(String onceToken) {
		this.onceToken = onceToken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
