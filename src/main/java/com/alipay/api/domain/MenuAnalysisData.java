package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜单分析数据
 *
 * @author auto create
 * @since 1.0, 2020-09-28 10:41:19
 */
public class MenuAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 2187146497178719172L;

	/**
	 * 人均点击次数
	 */
	@ApiField("avg_click_user_cnt")
	private String avgClickUserCnt;

	/**
	 * 菜单点击次数
	 */
	@ApiField("click_cnt")
	private Long clickCnt;

	/**
	 * 菜单点击人数
	 */
	@ApiField("click_user_cnt")
	private Long clickUserCnt;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 菜单类型 ，iconDefault ：图标菜单、default：文字菜单
	 */
	@ApiField("menu_type")
	private String menuType;

	/**
	 * 菜单名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子菜单名称，文字菜单才有
	 */
	@ApiField("sub_name")
	private String subName;

	public String getAvgClickUserCnt() {
		return this.avgClickUserCnt;
	}
	public void setAvgClickUserCnt(String avgClickUserCnt) {
		this.avgClickUserCnt = avgClickUserCnt;
	}

	public Long getClickCnt() {
		return this.clickCnt;
	}
	public void setClickCnt(Long clickCnt) {
		this.clickCnt = clickCnt;
	}

	public Long getClickUserCnt() {
		return this.clickUserCnt;
	}
	public void setClickUserCnt(Long clickUserCnt) {
		this.clickUserCnt = clickUserCnt;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getMenuType() {
		return this.menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

}
