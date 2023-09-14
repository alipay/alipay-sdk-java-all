package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ODPS元数据查询
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:34:06
 */
public class AlipayDataDataserviceAntdataassetsOdpscolumnQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6489743615263691545L;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

}
