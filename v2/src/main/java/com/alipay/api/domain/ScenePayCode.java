package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付码
 *
 * @author auto create
 * @since 1.0, 2023-08-09 15:57:42
 */
public class ScenePayCode extends AlipayObject {

	private static final long serialVersionUID = 1433421676511169626L;

	/**
	 * 通过场景支付凭证，交换出的目标码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 通过原始的场景支付码值，交换出的目标码值类型
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 码值有效期结束时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 码值有效期的开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
