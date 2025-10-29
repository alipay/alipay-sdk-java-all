package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票订单数据同步-乘机人四要素加密信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 17:35:43
 */
public class TrafficAirTicketPassengerEncryptedInfo extends AlipayObject {

	private static final long serialVersionUID = 6446224889372822165L;

	/**
	 * 乘机人证件号，与证件类型cert_type对应的号码，如示例中的是身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 乘机人证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 乘机人手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 对称加密过的乘机人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否本人，该乘机人是否为订单的下单人 1. true-该乘机人是订单的下单人 2. false-该乘机人不是订单的下单人
	 */
	@ApiField("self")
	private Boolean self;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSelf() {
		return this.self;
	}
	public void setSelf(Boolean self) {
		this.self = self;
	}

}
