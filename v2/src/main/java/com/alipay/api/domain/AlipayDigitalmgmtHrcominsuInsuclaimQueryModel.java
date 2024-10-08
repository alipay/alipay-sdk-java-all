package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询理赔报案接口
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:47:47
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5735991296722818745L;

	/**
	 * data_key+唯一+分发给供应商的加密 key，用于识别供应商类型+枚举值(无)+业务生成后，分发给供应商+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

}
