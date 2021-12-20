package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 留资属性实例数据列表
 *
 * @author auto create
 * @since 1.0, 2020-12-28 15:33:49
 */
public class PromotePageData extends AlipayObject {

	private static final long serialVersionUID = 5437671814414434133L;

	/**
	 * 留资流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

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

	public List<PromotePagePropertyInstance> getPropertyList() {
		return this.propertyList;
	}
	public void setPropertyList(List<PromotePagePropertyInstance> propertyList) {
		this.propertyList = propertyList;
	}

}
