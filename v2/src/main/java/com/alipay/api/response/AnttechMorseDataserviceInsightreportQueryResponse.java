package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsightBrandItem;
import com.alipay.api.domain.InsightDistItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.dataservice.insightreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 14:30:44
 */
public class AnttechMorseDataserviceInsightreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6334437694748574841L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于链路问题定位排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 品牌信息
	 */
	@ApiListField("brands")
	@ApiField("insight_brand_item")
	private List<InsightBrandItem> brands;

	/** 
	 * 居住人口洞察年龄
	 */
	@ApiListField("home_base_age_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> homeBaseAgeDist;

	/** 
	 * 居住人口洞察职业
	 */
	@ApiListField("home_base_occupation_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> homeBaseOccupationDist;

	/** 
	 * 居住人口洞察性别
	 */
	@ApiListField("home_base_sex_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> homeBaseSexDist;

	/** 
	 * 居住人口洞察消费水平分布
	 */
	@ApiListField("home_payment_consumption_level_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> homePaymentConsumptionLevelDist;

	/** 
	 * 常驻人口洞察年龄
	 */
	@ApiListField("permanent_base_age_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentBaseAgeDist;

	/** 
	 * 常驻人口洞察职业
	 */
	@ApiListField("permanent_base_occupation_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentBaseOccupationDist;

	/** 
	 * 常驻人口洞察性别
	 */
	@ApiListField("permanent_base_sex_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentBaseSexDist;

	/** 
	 * APP类型偏好
	 */
	@ApiListField("permanent_media_apptype_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentMediaApptypeDist;

	/** 
	 * 常驻人口洞察消费水平分布
	 */
	@ApiListField("permanent_payment_consumption_level_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentPaymentConsumptionLevelDist;

	/** 
	 * 餐饮偏好top50
	 */
	@ApiListField("permanent_payment_food_poitype_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> permanentPaymentFoodPoitypeDist;

	/** 
	 * 居住人口
	 */
	@ApiField("uv_home")
	private String uvHome;

	/** 
	 * 常驻人口
	 */
	@ApiField("uv_permanent")
	private String uvPermanent;

	/** 
	 * 工作日月均天级客流
	 */
	@ApiField("uv_weekday_day")
	private String uvWeekdayDay;

	/** 
	 * 节假日月均天级客流
	 */
	@ApiField("uv_weekend_day")
	private String uvWeekendDay;

	/** 
	 * 工作人口
	 */
	@ApiField("uv_work")
	private String uvWork;

	/** 
	 * 工作人口洞察年龄
	 */
	@ApiListField("work_base_age_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> workBaseAgeDist;

	/** 
	 * 工作人口洞察职业
	 */
	@ApiListField("work_base_occupation_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> workBaseOccupationDist;

	/** 
	 * 工作人口洞察性别
	 */
	@ApiListField("work_base_sex_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> workBaseSexDist;

	/** 
	 * 工作人口洞察消费水平分布
	 */
	@ApiListField("work_payment_consumption_level_dist")
	@ApiField("insight_dist_item")
	private List<InsightDistItem> workPaymentConsumptionLevelDist;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setBrands(List<InsightBrandItem> brands) {
		this.brands = brands;
	}
	public List<InsightBrandItem> getBrands( ) {
		return this.brands;
	}

	public void setHomeBaseAgeDist(List<InsightDistItem> homeBaseAgeDist) {
		this.homeBaseAgeDist = homeBaseAgeDist;
	}
	public List<InsightDistItem> getHomeBaseAgeDist( ) {
		return this.homeBaseAgeDist;
	}

	public void setHomeBaseOccupationDist(List<InsightDistItem> homeBaseOccupationDist) {
		this.homeBaseOccupationDist = homeBaseOccupationDist;
	}
	public List<InsightDistItem> getHomeBaseOccupationDist( ) {
		return this.homeBaseOccupationDist;
	}

	public void setHomeBaseSexDist(List<InsightDistItem> homeBaseSexDist) {
		this.homeBaseSexDist = homeBaseSexDist;
	}
	public List<InsightDistItem> getHomeBaseSexDist( ) {
		return this.homeBaseSexDist;
	}

	public void setHomePaymentConsumptionLevelDist(List<InsightDistItem> homePaymentConsumptionLevelDist) {
		this.homePaymentConsumptionLevelDist = homePaymentConsumptionLevelDist;
	}
	public List<InsightDistItem> getHomePaymentConsumptionLevelDist( ) {
		return this.homePaymentConsumptionLevelDist;
	}

	public void setPermanentBaseAgeDist(List<InsightDistItem> permanentBaseAgeDist) {
		this.permanentBaseAgeDist = permanentBaseAgeDist;
	}
	public List<InsightDistItem> getPermanentBaseAgeDist( ) {
		return this.permanentBaseAgeDist;
	}

	public void setPermanentBaseOccupationDist(List<InsightDistItem> permanentBaseOccupationDist) {
		this.permanentBaseOccupationDist = permanentBaseOccupationDist;
	}
	public List<InsightDistItem> getPermanentBaseOccupationDist( ) {
		return this.permanentBaseOccupationDist;
	}

	public void setPermanentBaseSexDist(List<InsightDistItem> permanentBaseSexDist) {
		this.permanentBaseSexDist = permanentBaseSexDist;
	}
	public List<InsightDistItem> getPermanentBaseSexDist( ) {
		return this.permanentBaseSexDist;
	}

	public void setPermanentMediaApptypeDist(List<InsightDistItem> permanentMediaApptypeDist) {
		this.permanentMediaApptypeDist = permanentMediaApptypeDist;
	}
	public List<InsightDistItem> getPermanentMediaApptypeDist( ) {
		return this.permanentMediaApptypeDist;
	}

	public void setPermanentPaymentConsumptionLevelDist(List<InsightDistItem> permanentPaymentConsumptionLevelDist) {
		this.permanentPaymentConsumptionLevelDist = permanentPaymentConsumptionLevelDist;
	}
	public List<InsightDistItem> getPermanentPaymentConsumptionLevelDist( ) {
		return this.permanentPaymentConsumptionLevelDist;
	}

	public void setPermanentPaymentFoodPoitypeDist(List<InsightDistItem> permanentPaymentFoodPoitypeDist) {
		this.permanentPaymentFoodPoitypeDist = permanentPaymentFoodPoitypeDist;
	}
	public List<InsightDistItem> getPermanentPaymentFoodPoitypeDist( ) {
		return this.permanentPaymentFoodPoitypeDist;
	}

	public void setUvHome(String uvHome) {
		this.uvHome = uvHome;
	}
	public String getUvHome( ) {
		return this.uvHome;
	}

	public void setUvPermanent(String uvPermanent) {
		this.uvPermanent = uvPermanent;
	}
	public String getUvPermanent( ) {
		return this.uvPermanent;
	}

	public void setUvWeekdayDay(String uvWeekdayDay) {
		this.uvWeekdayDay = uvWeekdayDay;
	}
	public String getUvWeekdayDay( ) {
		return this.uvWeekdayDay;
	}

	public void setUvWeekendDay(String uvWeekendDay) {
		this.uvWeekendDay = uvWeekendDay;
	}
	public String getUvWeekendDay( ) {
		return this.uvWeekendDay;
	}

	public void setUvWork(String uvWork) {
		this.uvWork = uvWork;
	}
	public String getUvWork( ) {
		return this.uvWork;
	}

	public void setWorkBaseAgeDist(List<InsightDistItem> workBaseAgeDist) {
		this.workBaseAgeDist = workBaseAgeDist;
	}
	public List<InsightDistItem> getWorkBaseAgeDist( ) {
		return this.workBaseAgeDist;
	}

	public void setWorkBaseOccupationDist(List<InsightDistItem> workBaseOccupationDist) {
		this.workBaseOccupationDist = workBaseOccupationDist;
	}
	public List<InsightDistItem> getWorkBaseOccupationDist( ) {
		return this.workBaseOccupationDist;
	}

	public void setWorkBaseSexDist(List<InsightDistItem> workBaseSexDist) {
		this.workBaseSexDist = workBaseSexDist;
	}
	public List<InsightDistItem> getWorkBaseSexDist( ) {
		return this.workBaseSexDist;
	}

	public void setWorkPaymentConsumptionLevelDist(List<InsightDistItem> workPaymentConsumptionLevelDist) {
		this.workPaymentConsumptionLevelDist = workPaymentConsumptionLevelDist;
	}
	public List<InsightDistItem> getWorkPaymentConsumptionLevelDist( ) {
		return this.workPaymentConsumptionLevelDist;
	}

}
