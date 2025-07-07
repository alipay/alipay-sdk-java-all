package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.institution.export.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 20:02:26
 */
public class AlipayCommerceMedicalInstitutionExportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4162322919559587936L;

	/** 
	 * 安诊儿驾驶舱每日明细导出数据字段对应的中文
[
  {
    "name": "机构名称",
    "value": "orgName"
  },
  {
    "name": "交互DAU",
    "value": "interUv"
  },
  {
    "name": "服务曝光DAU",
    "value": "servExpoUv"
  },
  {
    "name": "服务点击DAU",
    "value": "servClkUv"
  },
  {
    "name": "问答DAU",
    "value": "chatUv"
  },
  {
    "name": "服务曝光点击率",
    "value": "servUvCtr"
  }
]
	 */
	@ApiField("daily_export_data")
	private String dailyExportData;

	public void setDailyExportData(String dailyExportData) {
		this.dailyExportData = dailyExportData;
	}
	public String getDailyExportData( ) {
		return this.dailyExportData;
	}

}
