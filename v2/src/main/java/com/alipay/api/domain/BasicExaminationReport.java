package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-17 16:32:52
 */
public class BasicExaminationReport extends AlipayObject {

	private static final long serialVersionUID = 1158755149744758738L;

	/**
	 * 项目code
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 项目名称（如"一般检查"）
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * null
	 */
	@ApiListField("item_project_list")
	@ApiField("basic_physical_item")
	private List<BasicPhysicalItem> itemProjectList;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<BasicPhysicalItem> getItemProjectList() {
		return this.itemProjectList;
	}
	public void setItemProjectList(List<BasicPhysicalItem> itemProjectList) {
		this.itemProjectList = itemProjectList;
	}

}
