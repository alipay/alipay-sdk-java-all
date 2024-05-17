package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工卡主体拓展参数
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:19
 */
public class ParticipantExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8586967334847596692L;

	/**
	 * 证件号，participant_id_typ为alipay_user_id可作为补充参数
	 */
	@ApiField("cert_no")
	private String certNo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
