package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证的使用信息
 *
 * @author auto create
 * @since 1.0, 2023-07-31 15:54:03
 */
public class CommercializationCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 1724628924744945712L;

	/**
	 * 商家侧凭证的唯一标识
	 */
	@ApiField("code")
	private String code;

	/**
	 * 在某个业务单下的锁定次数，不填默认1
	 */
	@ApiField("total_times")
	private Long totalTimes;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(Long totalTimes) {
		this.totalTimes = totalTimes;
	}

}
