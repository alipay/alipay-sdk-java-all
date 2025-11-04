package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件抽取
 *
 * @author auto create
 * @since 1.0, 2024-12-11 16:58:01
 */
public class AlipayCommerceMedicalHdfAttachmentIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 1783723949636311513L;

	/**
	 * 入参数据内容
	 */
	@ApiField("data")
	private String data;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
