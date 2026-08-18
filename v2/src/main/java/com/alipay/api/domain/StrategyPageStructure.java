package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 列表页结构定义
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class StrategyPageStructure extends AlipayObject {

	private static final long serialVersionUID = 4831562199876147136L;

	/**
	 * 批量操作开关
	 */
	@ApiField("batch_switch")
	private String batchSwitch;

	/**
	 * 扩展信息（JSON字符串）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 表单编码
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 页面编码
	 */
	@ApiField("page_code")
	private String pageCode;

	/**
	 * 页面名称
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * null
	 */
	@ApiListField("search_fields")
	@ApiField("strategy_search_field")
	private List<StrategySearchField> searchFields;

	/**
	 * null
	 */
	@ApiListField("show_fields")
	@ApiField("strategy_show_field")
	private List<StrategyShowField> showFields;

	/**
	 * null
	 */
	@ApiListField("sort_fields")
	@ApiField("strategy_sort_field")
	private List<StrategySortField> sortFields;

	/**
	 * 标题字段编码
	 */
	@ApiField("title_field")
	private String titleField;

	public String getBatchSwitch() {
		return this.batchSwitch;
	}
	public void setBatchSwitch(String batchSwitch) {
		this.batchSwitch = batchSwitch;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFormCode() {
		return this.formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getPageCode() {
		return this.pageCode;
	}
	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public List<StrategySearchField> getSearchFields() {
		return this.searchFields;
	}
	public void setSearchFields(List<StrategySearchField> searchFields) {
		this.searchFields = searchFields;
	}

	public List<StrategyShowField> getShowFields() {
		return this.showFields;
	}
	public void setShowFields(List<StrategyShowField> showFields) {
		this.showFields = showFields;
	}

	public List<StrategySortField> getSortFields() {
		return this.sortFields;
	}
	public void setSortFields(List<StrategySortField> sortFields) {
		this.sortFields = sortFields;
	}

	public String getTitleField() {
		return this.titleField;
	}
	public void setTitleField(String titleField) {
		this.titleField = titleField;
	}

}
