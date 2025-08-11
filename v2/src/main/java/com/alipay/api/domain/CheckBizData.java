package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二次核验业务数据
 *
 * @author auto create
 * @since 1.0, 2023-06-30 10:35:03
 */
public class CheckBizData extends AlipayObject {

	private static final long serialVersionUID = 4765673683249564819L;

	/**
	 * 人脸比对id
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
