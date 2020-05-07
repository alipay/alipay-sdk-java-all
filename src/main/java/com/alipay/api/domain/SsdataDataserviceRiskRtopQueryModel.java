package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险大脑监管开放平台数据查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-09 13:18:50
 */
public class SsdataDataserviceRiskRtopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2355199479235165624L;

	/**
	 * rowkeys+不需要唯一+蚁盾风险大脑项目，监管科技平台需要通过open api接口查询后端的反洗钱数据+非枚举+由用户检索的数据组成的参数+无特殊说明
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
