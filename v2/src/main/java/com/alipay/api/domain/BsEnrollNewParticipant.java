package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名对象，用于入参
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:12
 */
public class BsEnrollNewParticipant extends AlipayObject {

	private static final long serialVersionUID = 1579382749422443299L;

	/**
	 * 报名拓展信息
	 */
	@ApiField("ext_info")
	private BsEnrollParticipantExtInfo extInfo;

	/**
	 * 外部商户编号
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 参与类型，参与类型，支持PARTNER_ID 、LOGON_ID等
	 */
	@ApiField("type")
	private String type;

	/**
	 * 类型对应值，传入报名对象的返回值
	 */
	@ApiField("value")
	private String value;

	public BsEnrollParticipantExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(BsEnrollParticipantExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
