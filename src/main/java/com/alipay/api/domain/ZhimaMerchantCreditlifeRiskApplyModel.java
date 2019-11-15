package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用生活行业用户风险评估
 *
 * @author auto create
 * @since 1.0, 2017-11-20 13:40:40
 */
public class ZhimaMerchantCreditlifeRiskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3256583355129763272L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 证件号，一般为身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 接入信用套餐所分配的产品码
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机联系方式
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业务流水号，每一笔业务使用一个新的业务流水号，不能重复
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
