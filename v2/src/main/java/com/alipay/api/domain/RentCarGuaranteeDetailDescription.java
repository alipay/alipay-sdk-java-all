package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车保障服务详细描述
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:04:10
 */
public class RentCarGuaranteeDetailDescription extends AlipayObject {

	private static final long serialVersionUID = 5426998741195435621L;

	/**
	 * 是否包含该服务
	 */
	@ApiField("contains")
	private Boolean contains;

	/**
	 * 内容列表，每项一行
	 */
	@ApiListField("content")
	@ApiField("string")
	private List<String> content;

	/**
	 * 子内容
	 */
	@ApiListField("sub_content")
	@ApiField("rent_car_guarantee_sub_detail_description")
	private List<RentCarGuaranteeSubDetailDescription> subContent;

	/**
	 * 表格信息
	 */
	@ApiListField("table")
	@ApiField("rent_car_table_info")
	private List<RentCarTableInfo> table;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public Boolean getContains() {
		return this.contains;
	}
	public void setContains(Boolean contains) {
		this.contains = contains;
	}

	public List<String> getContent() {
		return this.content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}

	public List<RentCarGuaranteeSubDetailDescription> getSubContent() {
		return this.subContent;
	}
	public void setSubContent(List<RentCarGuaranteeSubDetailDescription> subContent) {
		this.subContent = subContent;
	}

	public List<RentCarTableInfo> getTable() {
		return this.table;
	}
	public void setTable(List<RentCarTableInfo> table) {
		this.table = table;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
