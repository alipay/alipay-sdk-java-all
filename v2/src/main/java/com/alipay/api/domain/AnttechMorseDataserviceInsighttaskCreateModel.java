package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点位洞察任务状态创建
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:00:18
 */
public class AnttechMorseDataserviceInsighttaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3142715719155957661L;

	/**
	 * 洞察品牌
	 */
	@ApiListField("brands")
	@ApiField("insight_brand")
	private List<InsightBrand> brands;

	/**
	 * 给客户发放的调用ID
	 */
	@ApiField("consult_id")
	private String consultId;

	/**
	 * 圆的圆心和半径(x,y,r)，半径上下限 0.1~5km，单位为 KM，比如 5000 米，那么输入 r = 5，150 米输入为 r = 0.15
	 */
	@ApiField("type_info")
	private String typeInfo;

	public List<InsightBrand> getBrands() {
		return this.brands;
	}
	public void setBrands(List<InsightBrand> brands) {
		this.brands = brands;
	}

	public String getConsultId() {
		return this.consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}

	public String getTypeInfo() {
		return this.typeInfo;
	}
	public void setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
	}

}
