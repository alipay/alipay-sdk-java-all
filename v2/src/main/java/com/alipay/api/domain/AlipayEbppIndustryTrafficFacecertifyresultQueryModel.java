package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交管app跳端刷脸结果查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 10:32:55
 */
public class AlipayEbppIndustryTrafficFacecertifyresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5889216421574933142L;

	/**
	 * 12123app传入的校验id
	 */
	@ApiField("check_id")
	private String checkId;

	public String getCheckId() {
		return this.checkId;
	}
	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

}
