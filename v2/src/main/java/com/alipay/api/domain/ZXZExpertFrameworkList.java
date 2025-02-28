package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支小助专家框架列表
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:34:38
 */
public class ZXZExpertFrameworkList extends AlipayObject {

	private static final long serialVersionUID = 6253239122569545296L;

	/**
	 * 专家框架列表
	 */
	@ApiListField("framework_list")
	@ApiField("fin_framework_detail")
	private List<FinFrameworkDetail> frameworkList;

	/**
	 * 专家框架所属的大类列表,这里返回的是名称。请直接使用名称展示即可，。无须code
	 */
	@ApiField("type_name")
	private String typeName;

	public List<FinFrameworkDetail> getFrameworkList() {
		return this.frameworkList;
	}
	public void setFrameworkList(List<FinFrameworkDetail> frameworkList) {
		this.frameworkList = frameworkList;
	}

	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
