package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡次序号信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 19:11:53
 */
public class CertificateSerialInfo extends AlipayObject {

	private static final long serialVersionUID = 5636279436778292541L;

	/**
	 * 次序号的金额信息
	 */
	@ApiField("amount_info")
	private CertificateInstanceAmountInfo amountInfo;

	/**
	 * 次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 次序号核销的门店id，次序号已核销后才会返回该值
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 次序号状态
	 */
	@ApiField("status")
	private String status;

	public CertificateInstanceAmountInfo getAmountInfo() {
		return this.amountInfo;
	}
	public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
		this.amountInfo = amountInfo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
