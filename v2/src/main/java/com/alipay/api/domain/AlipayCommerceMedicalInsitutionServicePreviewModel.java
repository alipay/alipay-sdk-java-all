package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构服务数据预览
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class AlipayCommerceMedicalInsitutionServicePreviewModel extends AlipayObject {

	private static final long serialVersionUID = 7577339425714249472L;

	/**
	 * 数据日期
	 */
	@ApiField("data_dt")
	private String dataDt;

	/**
	 * 指标类型
	 */
	@ApiField("indicator_type")
	private String indicatorType;

	public String getDataDt() {
		return this.dataDt;
	}
	public void setDataDt(String dataDt) {
		this.dataDt = dataDt;
	}

	public String getIndicatorType() {
		return this.indicatorType;
	}
	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}

}
