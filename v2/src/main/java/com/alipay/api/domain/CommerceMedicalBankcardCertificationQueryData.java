package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人社用户银行卡实名标识接口的出参
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:45:37
 */
public class CommerceMedicalBankcardCertificationQueryData extends AlipayObject {

	private static final long serialVersionUID = 3783716836271728731L;

	/**
	 * 响应时间戳。 格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_response")
	private Date gmtResponse;

	/**
	 * 用户是否已经绑定银行卡,Y或者N
	 */
	@ApiField("is_bankcard_certified")
	private String isBankcardCertified;

	public Date getGmtResponse() {
		return this.gmtResponse;
	}
	public void setGmtResponse(Date gmtResponse) {
		this.gmtResponse = gmtResponse;
	}

	public String getIsBankcardCertified() {
		return this.isBankcardCertified;
	}
	public void setIsBankcardCertified(String isBankcardCertified) {
		this.isBankcardCertified = isBankcardCertified;
	}

}
