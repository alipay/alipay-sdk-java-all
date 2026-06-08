package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 四川商通员工福利钱包余额查询
 *
 * @author auto create
 * @since 1.0, 2026-05-25 14:01:58
 */
public class MybankEcnyWelfarewalletOpenPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3558992389484922797L;

	/**
	 * 客户姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 身份证
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 默认身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 固定为STKJ，商通科技简称
	 */
	@ApiField("partner_abbr_name")
	private String partnerAbbrName;

	/**
	 * 合作机构的2088编码，识别商通身份
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 透传给钱包开立/注销的消息通知里，用于外部关联使用
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 用户的2088编码
	 */
	@ApiField("uid")
	private String uid;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerAbbrName() {
		return this.partnerAbbrName;
	}
	public void setPartnerAbbrName(String partnerAbbrName) {
		this.partnerAbbrName = partnerAbbrName;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
