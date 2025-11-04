package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.isvhelp.entry.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-29 20:22:39
 */
public class AlipayMerchantIsvhelpEntryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1259697634636245978L;

	/** 
	 * 支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 合作方入驻账号
	 */
	@ApiField("alipay_partner")
	private String alipayPartner;

	/** 
	 * 服务商代入驻申请单状态枚举
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 用户通过访问该链接进行认证
	 */
	@ApiField("certify_link")
	private String certifyLink;

	/** 
	 * 服务商自定义的申请编号，每个申请编号唯一对应一个申请单，需在服务商下唯一。只能用数字、字母或下划线组成
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 入驻申请单申请失败原因，其为字符串数组经序列化后字符串值。
	 */
	@ApiListField("failed_reason")
	@ApiField("string")
	private List<String> failedReason;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setAlipayPartner(String alipayPartner) {
		this.alipayPartner = alipayPartner;
	}
	public String getAlipayPartner( ) {
		return this.alipayPartner;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setCertifyLink(String certifyLink) {
		this.certifyLink = certifyLink;
	}
	public String getCertifyLink( ) {
		return this.certifyLink;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setFailedReason(List<String> failedReason) {
		this.failedReason = failedReason;
	}
	public List<String> getFailedReason( ) {
		return this.failedReason;
	}

}
