package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家确认收货
 *
 * @author auto create
 * @since 1.0, 2017-09-15 19:43:15
 */
public class MybankCreditSupplychainDeliveryConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1349882435411265871L;

	/**
	 * 确认收货时间,精确到秒
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 交易到期日(账款到期日)
	 */
	@ApiField("exp_date")
	private Date expDate;

	/**
	 * 买家网商银行的IpId
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 买家的网商银行角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 请求流水号，用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 买家会员站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 买家站点UserId
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public Date getConfirmDate() {
		return this.confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public Date getExpDate() {
		return this.expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
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

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
