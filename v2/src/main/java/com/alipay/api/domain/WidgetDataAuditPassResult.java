package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核通过数据信息
 *
 * @author auto create
 * @since 1.0, 2022-11-21 16:47:37
 */
public class WidgetDataAuditPassResult extends AlipayObject {

	private static final long serialVersionUID = 5142235463161566489L;

	/**
	 * 支付宝内部生成的数据唯一标识
	 */
	@ApiField("alipay_data_id")
	private String alipayDataId;

	/**
	 * 外部数据唯一标识
	 */
	@ApiField("data_id")
	private String dataId;

	public String getAlipayDataId() {
		return this.alipayDataId;
	}
	public void setAlipayDataId(String alipayDataId) {
		this.alipayDataId = alipayDataId;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

}
