package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融租_查询云资金子户的信息
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:03:28
 */
public class MybankCreditSupplychainCloudfundSubaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4645763384766362166L;

	/**
	 * 云资金账户号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * ISV信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 接口扩展信息
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 开户分配的机构标记
	 */
	@ApiField("isv_org_id")
	private String isvOrgId;

	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getIsvOrgId() {
		return this.isvOrgId;
	}
	public void setIsvOrgId(String isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

}
