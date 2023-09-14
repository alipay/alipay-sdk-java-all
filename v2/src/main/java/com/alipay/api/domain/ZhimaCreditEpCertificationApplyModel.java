package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用认证页面申请（页面接口）
 *
 * @author auto create
 * @since 1.0, 2022-04-15 12:00:24
 */
public class ZhimaCreditEpCertificationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5319963687761135858L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
