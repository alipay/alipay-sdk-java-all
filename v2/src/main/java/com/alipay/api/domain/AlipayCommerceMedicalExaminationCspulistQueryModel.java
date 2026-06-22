package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询检查检验标品列表接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class AlipayCommerceMedicalExaminationCspulistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4367125219328948151L;

	/**
	 * null
	 */
	@ApiListField("category_id_list")
	@ApiField("string")
	private List<String> categoryIdList;

	/**
	 * 搜索类目类型
	 */
	@ApiField("category_type")
	private String categoryType;

	/**
	 * 分页码，可以不传，默认是 ：1
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 分页大小,可以不传，不传默认：10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 标品或组合品名称,示例：肝功能 14 项
	 */
	@ApiField("spu_title")
	private String spuTitle;

	public List<String> getCategoryIdList() {
		return this.categoryIdList;
	}
	public void setCategoryIdList(List<String> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}

	public String getCategoryType() {
		return this.categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSpuTitle() {
		return this.spuTitle;
	}
	public void setSpuTitle(String spuTitle) {
		this.spuTitle = spuTitle;
	}

}
