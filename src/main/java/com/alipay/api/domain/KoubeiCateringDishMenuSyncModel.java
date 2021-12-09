package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱同步简化接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 20:53:17
 */
public class KoubeiCateringDishMenuSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2293644241173453858L;

	/**
	 * 菜谱背景图片id
	 */
	@ApiField("bg_image")
	private String bgImage;

	/**
	 * "CREATE_MENU"：创建菜单，
"ADD_SHOP"：添加门店，
"DELETE_SHOP"：删除门店，
"ADD_DISH"：添加菜品，
"DELETE_DISH"：删除菜品
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 菜谱类目列表
	 */
	@ApiListField("category_list")
	@ApiField("kbdish_category_simplify_info")
	private List<KbdishCategorySimplifyInfo> categoryList;

	/**
	 * 菜单名称，需要保证pid下唯一，这个接口才生效
	 */
	@ApiField("cook_name")
	private String cookName;

	/**
	 * 时间区间日期结束
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 时间区间截止 闭区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 操作者id或名称
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部门店id列表
	 */
	@ApiListField("out_shop_id")
	@ApiField("string")
	private List<String> outShopId;

	/**
	 * 时间约束类型 forever:永久; week:按周，每周周几 month:按月,每月几号
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 时间控制值,如果选的week, 值 1,2,3,4 ; 如果选择month，值 1,11; 如果选择永久，为空
	 */
	@ApiField("period_value")
	private String periodValue;

	/**
	 * 控制的日期区间开始
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 时间控制 到分 闭区间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * open：启用
stop：停用
	 */
	@ApiField("status")
	private String status;

	public String getBgImage() {
		return this.bgImage;
	}
	public void setBgImage(String bgImage) {
		this.bgImage = bgImage;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<KbdishCategorySimplifyInfo> getCategoryList() {
		return this.categoryList;
	}
	public void setCategoryList(List<KbdishCategorySimplifyInfo> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCookName() {
		return this.cookName;
	}
	public void setCookName(String cookName) {
		this.cookName = cookName;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<String> getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(List<String> outShopId) {
		this.outShopId = outShopId;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getPeriodValue() {
		return this.periodValue;
	}
	public void setPeriodValue(String periodValue) {
		this.periodValue = periodValue;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
