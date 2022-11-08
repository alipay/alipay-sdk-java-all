package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学校人脸库信息查询
 *
 * @author auto create
 * @since 1.0, 2021-12-24 18:02:53
 */
public class AlipayCommerceEducateSceneFacegroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3568998834841896477L;

	/**
	 * 支付宝学校内标
	 */
	@ApiField("alipay_school_id")
	private String alipaySchoolId;

	public String getAlipaySchoolId() {
		return this.alipaySchoolId;
	}
	public void setAlipaySchoolId(String alipaySchoolId) {
		this.alipaySchoolId = alipaySchoolId;
	}

}
