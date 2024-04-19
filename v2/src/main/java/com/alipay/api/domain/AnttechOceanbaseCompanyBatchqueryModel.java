package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业合同信息查询
 *
 * @author auto create
 * @since 1.0, 2024-01-15 19:30:45
 */
public class AnttechOceanbaseCompanyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8366243541951446685L;

	/**
	 * 企业id列表
	 */
	@ApiListField("entity_id_list")
	@ApiField("string")
	private List<String> entityIdList;

	public List<String> getEntityIdList() {
		return this.entityIdList;
	}
	public void setEntityIdList(List<String> entityIdList) {
		this.entityIdList = entityIdList;
	}

}
