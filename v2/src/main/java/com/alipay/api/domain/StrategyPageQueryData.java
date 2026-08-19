package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 策略列表分页结果与页结构
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class StrategyPageQueryData extends AlipayObject {

	private static final long serialVersionUID = 6877685747417695294L;

	/**
	 * 纠错词
	 */
	@ApiField("correct_words")
	private String correctWords;

	/**
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 过滤词
	 */
	@ApiField("filter_words")
	private String filterWords;

	/**
	 * 数据总条数
	 */
	@ApiField("items")
	private Long items;

	/**
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/**
	 * 列表页结构定义
	 */
	@ApiField("page_structure")
	private StrategyPageStructure pageStructure;

	/**
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/**
	 * null
	 */
	@ApiListField("value")
	@ApiField("string")
	private List<String> value;

	public String getCorrectWords() {
		return this.correctWords;
	}
	public void setCorrectWords(String correctWords) {
		this.correctWords = correctWords;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getFilterWords() {
		return this.filterWords;
	}
	public void setFilterWords(String filterWords) {
		this.filterWords = filterWords;
	}

	public Long getItems() {
		return this.items;
	}
	public void setItems(Long items) {
		this.items = items;
	}

	public Long getItemsPerPage() {
		return this.itemsPerPage;
	}
	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public StrategyPageStructure getPageStructure() {
		return this.pageStructure;
	}
	public void setPageStructure(StrategyPageStructure pageStructure) {
		this.pageStructure = pageStructure;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public List<String> getValue() {
		return this.value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}
