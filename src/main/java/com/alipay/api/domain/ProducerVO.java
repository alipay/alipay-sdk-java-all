package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生产厂商信息
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:43:45
 */
public class ProducerVO extends AlipayObject {

	private static final long serialVersionUID = 5755953859674172894L;

	/**
	 * 业务状态，EFFECTIVE:有效、INVALID:无效
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 经营信息
	 */
	@ApiField("business_desc")
	private String businessDesc;

	/**
	 * 证照信息，枚举值如下：
LICENSE_NO:许可证号,
LICENSE_DATE:营业执照有效期,
PAYMENT_DAYS:账期天数,
TAX_NUMBER:税务证号,
BANK:开户银行,
BANK_ACCOUNT:银行账号,
CONTACT:联系人,
PHONE:联系电话,
ACCOUNT_DAY:结账日期
	 */
	@ApiField("certificate_desc")
	private String certificateDesc;

	/**
	 * 生产厂商ID
	 */
	@ApiField("producer_id")
	private String producerId;

	/**
	 * 生产厂商名称
	 */
	@ApiField("producer_name")
	private String producerName;

	/**
	 * 短码
	 */
	@ApiField("short_code")
	private String shortCode;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBusinessDesc() {
		return this.businessDesc;
	}
	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public String getCertificateDesc() {
		return this.certificateDesc;
	}
	public void setCertificateDesc(String certificateDesc) {
		this.certificateDesc = certificateDesc;
	}

	public String getProducerId() {
		return this.producerId;
	}
	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

	public String getProducerName() {
		return this.producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getShortCode() {
		return this.shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

}
