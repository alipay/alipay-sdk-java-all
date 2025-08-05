package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游泳场馆水质数据回流接口
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:55:51
 */
public class KoubeiServindustryNatatoriumWaterqualityUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4216532588913547814L;

	/**
	 * ISV的插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 游泳馆当前时间人数
	 */
	@ApiField("current_num")
	private Long currentNum;

	/**
	 * 当前场馆内人数更新时间
	 */
	@ApiField("currentnum_update_time")
	private Date currentnumUpdateTime;

	/**
	 * 外部ID,水质信息在ISV的系统中的主键,方便关联数据,非必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 浸脚消毒池游离性余氯是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过浸脚消毒池游离性余氯和浸脚消毒池游离性余氯标准算出
	 */
	@ApiField("footpool_cl_qualified")
	private String footpoolClQualified;

	/**
	 * 浸脚消毒池游离性余氯,(单位:mg/L)
精确到小数点后两位,取值大于等于0
	 */
	@ApiField("footpool_cl_remain")
	private String footpoolClRemain;

	/**
	 * 浸脚消毒池游离性余氯标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,数字取值大于等于0,且下限小于等于上限
	 */
	@ApiField("footpool_cl_remain_standard")
	private String footpoolClRemainStandard;

	/**
	 * 游泳馆可容纳最大人数，为正整数
	 */
	@ApiField("limit_num")
	private Long limitNum;

	/**
	 * 泳池游离性余氯是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过泳池游离性余氯和泳池游离性余氯标准算出
	 */
	@ApiField("mainpool_cl_qualified")
	private String mainpoolClQualified;

	/**
	 * 泳池游离性余氯,(单位:mg/L)
精确到小数点后两位,取值大于等于0
	 */
	@ApiField("mainpool_cl_remain")
	private String mainpoolClRemain;

	/**
	 * 泳池游离性余氯标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,数字取值大于等于0,且下限小于等于上限
	 */
	@ApiField("mainpool_cl_remain_standard")
	private String mainpoolClRemainStandard;

	/**
	 * 游泳池容积(单位:吨), 精确到小数点后两位,大于0
	 */
	@ApiField("pool_volume")
	private String poolVolume;

	/**
	 * 游泳池水质数据备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求ID,唯一的请求ID,用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 游泳池换水量(单位:吨), 精确到小数点后两位,大于0
	 */
	@ApiField("water_change")
	private String waterChange;

	/**
	 * 7日平均换水率(单位:%), 精确到小数点后两位,取值大于等于0,小于等于100
	 */
	@ApiField("water_change_percent")
	private String waterChangePercent;

	/**
	 * 7日平均换水率是否合格,枚举(unqualified=不合格,qualified=合格)
ISV根据7天换水率和7天换水率标准计算得出
	 */
	@ApiField("water_change_qualified")
	private String waterChangeQualified;

	/**
	 * 7日平均换水率标准,方括号表示闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,两个数字用英文逗号分隔,数字精确到小数点后两位,取值大于等于0小于等于100,且下限小于等于上限
	 */
	@ApiField("water_change_standard")
	private String waterChangeStandard;

	/**
	 * 水质监测时间
	 */
	@ApiField("water_check_time")
	private Date waterCheckTime;

	/**
	 * 游泳池水的PH值,精确到小数点后两位
	 */
	@ApiField("water_ph")
	private String waterPh;

	/**
	 * 游泳池水PH值是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过游泳池水PH值和PH值标准算出
	 */
	@ApiField("water_ph_qualified")
	private String waterPhQualified;

	/**
	 * 游泳池水PH值标准,方括号表示闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示上限,数字精确到小数点后两位,且下限小于等于上限
	 */
	@ApiField("water_ph_standard")
	private String waterPhStandard;

	/**
	 * 水质是否合格,枚举(unqualified=不合格,qualified=合格)
ISV通过所有水质标准计算得出，全部合格才能合格
	 */
	@ApiField("water_qualified")
	private String waterQualified;

	/**
	 * 当前水温(单位:℃),精确到小数点后两位
	 */
	@ApiField("water_temperature")
	private String waterTemperature;

	/**
	 * 水温是否合格,枚举(unqualified=不合格,qualified=合格)
ISV根据当前水温和水温标准计算得出
	 */
	@ApiField("water_temperature_qualified")
	private String waterTemperatureQualified;

	/**
	 * 水温标准,方括号标识闭区间,圆括号表示开区间,第一个数字表示下限,第二个数字表示下限,数字精确到小数点后两位,且下限小于等于上限,单位:℃
	 */
	@ApiField("water_temperature_standard")
	private String waterTemperatureStandard;

	/**
	 * 水质更新时间,会根据这个时间给游泳馆店铺打标
	 */
	@ApiField("water_update_time")
	private Date waterUpdateTime;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Long getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(Long currentNum) {
		this.currentNum = currentNum;
	}

	public Date getCurrentnumUpdateTime() {
		return this.currentnumUpdateTime;
	}
	public void setCurrentnumUpdateTime(Date currentnumUpdateTime) {
		this.currentnumUpdateTime = currentnumUpdateTime;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFootpoolClQualified() {
		return this.footpoolClQualified;
	}
	public void setFootpoolClQualified(String footpoolClQualified) {
		this.footpoolClQualified = footpoolClQualified;
	}

	public String getFootpoolClRemain() {
		return this.footpoolClRemain;
	}
	public void setFootpoolClRemain(String footpoolClRemain) {
		this.footpoolClRemain = footpoolClRemain;
	}

	public String getFootpoolClRemainStandard() {
		return this.footpoolClRemainStandard;
	}
	public void setFootpoolClRemainStandard(String footpoolClRemainStandard) {
		this.footpoolClRemainStandard = footpoolClRemainStandard;
	}

	public Long getLimitNum() {
		return this.limitNum;
	}
	public void setLimitNum(Long limitNum) {
		this.limitNum = limitNum;
	}

	public String getMainpoolClQualified() {
		return this.mainpoolClQualified;
	}
	public void setMainpoolClQualified(String mainpoolClQualified) {
		this.mainpoolClQualified = mainpoolClQualified;
	}

	public String getMainpoolClRemain() {
		return this.mainpoolClRemain;
	}
	public void setMainpoolClRemain(String mainpoolClRemain) {
		this.mainpoolClRemain = mainpoolClRemain;
	}

	public String getMainpoolClRemainStandard() {
		return this.mainpoolClRemainStandard;
	}
	public void setMainpoolClRemainStandard(String mainpoolClRemainStandard) {
		this.mainpoolClRemainStandard = mainpoolClRemainStandard;
	}

	public String getPoolVolume() {
		return this.poolVolume;
	}
	public void setPoolVolume(String poolVolume) {
		this.poolVolume = poolVolume;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getWaterChange() {
		return this.waterChange;
	}
	public void setWaterChange(String waterChange) {
		this.waterChange = waterChange;
	}

	public String getWaterChangePercent() {
		return this.waterChangePercent;
	}
	public void setWaterChangePercent(String waterChangePercent) {
		this.waterChangePercent = waterChangePercent;
	}

	public String getWaterChangeQualified() {
		return this.waterChangeQualified;
	}
	public void setWaterChangeQualified(String waterChangeQualified) {
		this.waterChangeQualified = waterChangeQualified;
	}

	public String getWaterChangeStandard() {
		return this.waterChangeStandard;
	}
	public void setWaterChangeStandard(String waterChangeStandard) {
		this.waterChangeStandard = waterChangeStandard;
	}

	public Date getWaterCheckTime() {
		return this.waterCheckTime;
	}
	public void setWaterCheckTime(Date waterCheckTime) {
		this.waterCheckTime = waterCheckTime;
	}

	public String getWaterPh() {
		return this.waterPh;
	}
	public void setWaterPh(String waterPh) {
		this.waterPh = waterPh;
	}

	public String getWaterPhQualified() {
		return this.waterPhQualified;
	}
	public void setWaterPhQualified(String waterPhQualified) {
		this.waterPhQualified = waterPhQualified;
	}

	public String getWaterPhStandard() {
		return this.waterPhStandard;
	}
	public void setWaterPhStandard(String waterPhStandard) {
		this.waterPhStandard = waterPhStandard;
	}

	public String getWaterQualified() {
		return this.waterQualified;
	}
	public void setWaterQualified(String waterQualified) {
		this.waterQualified = waterQualified;
	}

	public String getWaterTemperature() {
		return this.waterTemperature;
	}
	public void setWaterTemperature(String waterTemperature) {
		this.waterTemperature = waterTemperature;
	}

	public String getWaterTemperatureQualified() {
		return this.waterTemperatureQualified;
	}
	public void setWaterTemperatureQualified(String waterTemperatureQualified) {
		this.waterTemperatureQualified = waterTemperatureQualified;
	}

	public String getWaterTemperatureStandard() {
		return this.waterTemperatureStandard;
	}
	public void setWaterTemperatureStandard(String waterTemperatureStandard) {
		this.waterTemperatureStandard = waterTemperatureStandard;
	}

	public Date getWaterUpdateTime() {
		return this.waterUpdateTime;
	}
	public void setWaterUpdateTime(Date waterUpdateTime) {
		this.waterUpdateTime = waterUpdateTime;
	}

}
