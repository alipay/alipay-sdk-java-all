package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishCategorySimplifyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:31
 */
public class KoubeiCateringDishMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5214726721228183176L;

	/** 
	 * 菜谱背景图片id
	 */
	@ApiField("bg_image")
	private String bgImage;

	/** 
	 * 菜谱类目列表
	 */
	@ApiField("category_list")
	private KbdishCategorySimplifyInfo categoryList;

	/** 
	 * 菜谱名称
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
	 * 菜谱状态，open：启用，stop：停用
	 */
	@ApiField("status")
	private String status;

	public void setBgImage(String bgImage) {
		this.bgImage = bgImage;
	}
	public String getBgImage( ) {
		return this.bgImage;
	}

	public void setCategoryList(KbdishCategorySimplifyInfo categoryList) {
		this.categoryList = categoryList;
	}
	public KbdishCategorySimplifyInfo getCategoryList( ) {
		return this.categoryList;
	}

	public void setCookName(String cookName) {
		this.cookName = cookName;
	}
	public String getCookName( ) {
		return this.cookName;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setOutShopId(List<String> outShopId) {
		this.outShopId = outShopId;
	}
	public List<String> getOutShopId( ) {
		return this.outShopId;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	public String getPeriodType( ) {
		return this.periodType;
	}

	public void setPeriodValue(String periodValue) {
		this.periodValue = periodValue;
	}
	public String getPeriodValue( ) {
		return this.periodValue;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
