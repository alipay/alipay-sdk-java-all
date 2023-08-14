package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账单关联的发票
 *
 * @author auto create
 * @since 1.0, 2021-10-18 16:24:37
 */
public class AlipayBossFncGfsettleprodBillinvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7187977815192838654L;

	/**
	 * 申请单聚合id
	 */
	@ApiField("apply_relative_id")
	private String applyRelativeId;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 销方角色id
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	public String getApplyRelativeId() {
		return this.applyRelativeId;
	}
	public void setApplyRelativeId(String applyRelativeId) {
		this.applyRelativeId = applyRelativeId;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getSellerIpRoleId() {
		return this.sellerIpRoleId;
	}
	public void setSellerIpRoleId(String sellerIpRoleId) {
		this.sellerIpRoleId = sellerIpRoleId;
	}

}
