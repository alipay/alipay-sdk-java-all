package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化作业团购解决方案业务开通单
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class AlipayOpenSpInteopGrouppurchaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1572481729739653476L;

	/**
	 * 商家联系方式
	 */
	@ApiField("contact_info")
	private GroupPurchaseContactInfo contactInfo;

	/**
	 * 一体化作业开通主单号，单号为服务商一体化作业主单创建返回值。
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 解决方案店铺信息
	 */
	@ApiField("inteop_shop_info")
	private GroupPurchaseShopInfo inteopShopInfo;

	public GroupPurchaseContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(GroupPurchaseContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public GroupPurchaseShopInfo getInteopShopInfo() {
		return this.inteopShopInfo;
	}
	public void setInteopShopInfo(GroupPurchaseShopInfo inteopShopInfo) {
		this.inteopShopInfo = inteopShopInfo;
	}

}
