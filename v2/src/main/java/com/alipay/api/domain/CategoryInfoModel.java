package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户经营类目信息
 *
 * @author auto create
 * @since 1.0, 2026-06-26 21:16:16
 */
public class CategoryInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3122364435388429214L;

	/**
	 * 主营类目编码信息，代表店铺主类目信息
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 商家主营类目
	 */
	@ApiField("main_name")
	private String mainName;

	/**
	 * 商家经营子类目名称列表 当前字段已废弃(业务调整，该参数不在使用)
	 */
	@ApiListField("name_list")
	@ApiField("string")
	@Deprecated
	private List<String> nameList;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

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
