package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 留资属性实例数据列表
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:41:40
 */
public class PromotePageData extends AlipayObject {

	private static final long serialVersionUID = 5832417415614112679L;

	/**
	 * 留资流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 加密uid，用于深转数据回传
	 */
	@ApiField("encrypt_uid")
	private String encryptUid;

	/**
	 * 留资属性实例数据列表
	 */
	@ApiListField("property_list")
	@ApiField("promote_page_property_instance")
	private List<PromotePagePropertyInstance> propertyList;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEncryptUid() {
		return this.encryptUid;
	}
	public void setEncryptUid(String encryptUid) {
		this.encryptUid = encryptUid;
	}

	public List<PromotePagePropertyInstance> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<PromotePagePropertyInstance> propertyList) {
		this.propertyList = propertyList;
	}

}
