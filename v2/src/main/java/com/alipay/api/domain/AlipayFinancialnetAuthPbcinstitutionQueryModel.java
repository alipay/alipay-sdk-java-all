package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联行号关联顶级机构查询
 *
 * @author auto create
 * @since 1.0, 2023-05-31 11:27:14
 */
public class AlipayFinancialnetAuthPbcinstitutionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4162156336819758387L;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
