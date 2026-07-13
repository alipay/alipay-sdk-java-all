package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务费信息
 *
 * @author auto create
 * @since 1.0, 2026-06-17 14:10:37
 */
public class AlipayCommerceEcChargeBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6222767413644241784L;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * 企业码服务费单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 被抽佣的支付宝交易号
	 */
	@ApiField("pay_no")
	private String payNo;

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

}
