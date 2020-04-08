package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 余额宝资产端数据录入
 *
 * @author auto create
 * @since 1.0, 2019-11-26 17:54:09
 */
public class AlipayDataDataserviceYuebaoassetDetailSendModel extends AlipayObject {

	private static final long serialVersionUID = 3271997267718463618L;

	/**
	 * 资产负债报表数据列表
	 */
	@ApiListField("alm_report_data")
	@ApiField("alm_report_data")
	private List<AlmReportData> almReportData;

	public List<AlmReportData> getAlmReportData() {
		return this.almReportData;
	}
	public void setAlmReportData(List<AlmReportData> almReportData) {
		this.almReportData = almReportData;
	}

}
