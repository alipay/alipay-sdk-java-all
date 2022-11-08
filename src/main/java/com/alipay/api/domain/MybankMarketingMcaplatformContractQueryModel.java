package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绿色经营授权查询
 *
 * @author auto create
 * @since 1.0, 2021-12-27 11:51:30
 */
public class MybankMarketingMcaplatformContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8269453553458864187L;

	/**
	 * biz_date，不唯一，绿色经营外部传入业务时间，无枚举值，可为空
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * cert_no，不唯一，绿色经营接口传入证件号，无枚举值，目前仅支持传入同一社会信用代码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * cert_type，唯一，绿色经营接口传入证件类型，枚举值UNIFIED_SOCIAL_CREDIT_CODE_CERTIFICATE，目前仅有社会信用代码枚举
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * channel，不唯一，绿色经营调用方系统名，无枚举值
	 */
	@ApiField("channel")
	private String channel;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
