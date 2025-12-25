package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户经营类目信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:26:52
 */
public class CategoryInfoModel extends AlipayObject {

	private static final long serialVersionUID = 1115437574914539171L;

	/**
	 * 商家主营类目
	 */
	@ApiField("main_name")
	private String mainName;

	/**
	 * 商家经营子类目名称列表
	 */
	@ApiListField("name_list")
	@ApiField("string")
	private List<String> nameList;

	public String getMainName() {
		return this.mainName;
	}
	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public List<String> getNameList() {
		return this.nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

}
