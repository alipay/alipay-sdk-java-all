package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 鹰眼项目获取平台数据接口
 *
 * @author auto create
 * @since 1.0, 2022-05-12 12:12:09
 */
public class AlipayDataRiskRtopobtsregQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5882742859424884889L;

	/**
	 * rowkeys+不需要唯一+鹰眼项目，通过open api接口查询舆情
	 */
	@ApiField("rowkeys")
	private String rowkeys;

	public String getRowkeys() {
		return this.rowkeys;
	}
	public void setRowkeys(String rowkeys) {
		this.rowkeys = rowkeys;
	}

}
