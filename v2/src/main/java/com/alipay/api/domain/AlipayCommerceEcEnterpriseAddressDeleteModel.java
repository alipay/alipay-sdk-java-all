package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业地址删除
 *
 * @author auto create
 * @since 1.0, 2026-06-01 10:07:49
 */
public class AlipayCommerceEcEnterpriseAddressDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8144656439744699964L;

	/**
	 * null
	 */
	@ApiListField("address_id_list")
	@ApiField("string")
	private List<String> addressIdList;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public List<String> getAddressIdList() {
		return this.addressIdList;
	}
	public void setAddressIdList(List<String> addressIdList) {
		this.addressIdList = addressIdList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
