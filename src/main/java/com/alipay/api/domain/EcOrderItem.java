package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码订单实体
 *
 * @author auto create
 * @since 1.0, 2022-06-07 19:58:33
 */
public class EcOrderItem extends AlipayObject {

	private static final long serialVersionUID = 7471648574764783786L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 外部业务号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 订单内容，JSON格式。
	 */
	@ApiField("order_content")
	private String orderContent;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型
METRO：地铁
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 关联支付宝交易号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 用户支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizOutNo() {
		return this.bizOutNo;
	}
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOrderContent() {
		return this.orderContent;
	}
	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
