package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账单关联的发票
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:25:37
 */
public class AlipayBossFncGfsettleprodBillinvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3413489747417521754L;

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
