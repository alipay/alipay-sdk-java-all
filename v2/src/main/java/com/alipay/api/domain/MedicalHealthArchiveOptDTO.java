package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业健康档案信息更新操作结果
 *
 * @author auto create
 * @since 1.0, 2024-11-27 15:20:08
 */
public class MedicalHealthArchiveOptDTO extends AlipayObject {

	private static final long serialVersionUID = 3856183975724264362L;

	/**
	 * 数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

}
