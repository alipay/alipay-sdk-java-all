package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康档案数据撤销保存
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:57:49
 */
public class AlipayCommerceMedicalHealthArchiveReverseModel extends AlipayObject {

	private static final long serialVersionUID = 5393489964497566562L;

	/**
	 * 最外层包裹对象
	 */
	@ApiField("content_data")
	private ReverseContentData contentData;

	public ReverseContentData getContentData() {
		return this.contentData;
	}
	public void setContentData(ReverseContentData contentData) {
		this.contentData = contentData;
	}

}
