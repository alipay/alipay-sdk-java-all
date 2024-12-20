package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据ouCode查询开票信息参数
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:40:00
 */
public class QueryInvoiceInfoByOuOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2826947236737623965L;

	/**
	 * ouCode列表
	 */
	@ApiListField("ou_code_list")
	@ApiField("string")
	private List<String> ouCodeList;

	public List<String> getOuCodeList() {
		return this.ouCodeList;
	}
	public void setOuCodeList(List<String> ouCodeList) {
		this.ouCodeList = ouCodeList;
	}

}
