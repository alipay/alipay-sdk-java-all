package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 此复杂类型用于描述生产资料标准
 *
 * @author auto create
 * @since 1.0, 2023-05-19 15:03:56
 */
public class AssetStandard extends AlipayObject {

	private static final long serialVersionUID = 1174497447773191513L;

	/**
	 * 生产资料标准大字段
	 */
	@ApiField("pm_std")
	private String pmStd;

	public String getPmStd() {
		return this.pmStd;
	}
	public void setPmStd(String pmStd) {
		this.pmStd = pmStd;
	}

}
