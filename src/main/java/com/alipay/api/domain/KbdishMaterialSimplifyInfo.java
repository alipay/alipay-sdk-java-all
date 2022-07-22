package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品简化接口加料组信息
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishMaterialSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 6852827552747328952L;

	/**
	 * 加料id列表，加料先通过加料创建接口拿到id
	 */
	@ApiListField("material_detail_list")
	@ApiField("string")
	private List<String> materialDetailList;

	/**
	 * 加料组规格，max_count：最大可选数量，min_count：最小可选数量
	 */
	@ApiField("material_rule")
	private String materialRule;

	/**
	 * 加料组名称
	 */
	@ApiField("name")
	private String name;

	public List<String> getMaterialDetailList() {
		return this.materialDetailList;
	}
	public void setMaterialDetailList(List<String> materialDetailList) {
		this.materialDetailList = materialDetailList;
	}

	public String getMaterialRule() {
		return this.materialRule;
	}
	public void setMaterialRule(String materialRule) {
		this.materialRule = materialRule;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
