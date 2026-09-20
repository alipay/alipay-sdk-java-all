package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三要素加密生成身份Token
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:55:01
 */
public class AlipayInsSceneOpenprodTokenGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 5645816566497826891L;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 端外服务商来源标识
	 */
	@ApiField("outbound_source")
	private String outboundSource;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getOutboundSource() {
		return this.outboundSource;
	}
	public void setOutboundSource(String outboundSource) {
		this.outboundSource = outboundSource;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
