package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸核验照片查询
 *
 * @author auto create
 * @since 1.0, 2025-08-05 20:28:59
 */
public class AlipayOfflineProviderVerifyphotoNpassporterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7442172198658569637L;

	/**
	 * 字符串
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 字符串
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
