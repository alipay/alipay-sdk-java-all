package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信用实力标牌信息查询
 *
 * @author auto create
 * @since 1.0, 2024-01-08 10:17:38
 */
public class ZhimaCreditEpLabelPlateinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3294664849628148669L;

	/**
	 * 实力标牌内部单号+唯一+查询实力标牌高清图片+小程序跳转时带出
	 */
	@ApiField("plate_biz_no")
	private String plateBizNo;

	public String getPlateBizNo() {
		return this.plateBizNo;
	}
	public void setPlateBizNo(String plateBizNo) {
		this.plateBizNo = plateBizNo;
	}

}
