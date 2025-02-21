package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:52
 */
public class KbdishCookInfo extends AlipayObject {

	private static final long serialVersionUID = 4163484497676874625L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 渠道    eatin堂食，takeout外卖,paipai 扫码,kbb2c 口碑点餐
	 */
	@ApiField("cook_channel")
	private String cookChannel;

	/**
	 * 扩展字典,json串
	 */
	@ApiField("cook_ext_content")
	private String cookExtContent;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱名称
	 */
	@ApiField("cook_name")
	private String cookName;

	/**
	 * 版本号
	 */
	@ApiField("cook_version")
	private String cookVersion;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

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
	 * 数据的创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 数据的修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 口碑菜谱明细
	 */
	@ApiListField("kb_cook_detail_list")
	@ApiField("kbdish_cook_detail_info")
	private List<KbdishCookDetailInfo> kbCookDetailList;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 时间约束类型 forever:永久;  week:按周，每周周几 month:按月,每月几号.
如果操作的是菜谱，非空必传。如果是操作门店或者挂明细，可为空
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 时间控制值,如果选的week, 值 1,2,3,4 ; 如果选择month 1,11,31 ; 如果选择永久，为空
	 */
	@ApiField("period_value")
	private String periodValue;

	/**
	 * 菜谱描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店列表
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/**
	 * yazuo,meituan,ele获取，新增的时候必输。
	 */
	@ApiField("source_from")
	private String sourceFrom;

	/**
	 * 控制的日期区间开始
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 时间控制 到分  闭区间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作员
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCookChannel() {
		return this.cookChannel;
	}
	public void setCookChannel(String cookChannel) {
		this.cookChannel = cookChannel;
	}

	public String getCookExtContent() {
		return this.cookExtContent;
	}
	public void setCookExtContent(String cookExtContent) {
		this.cookExtContent = cookExtContent;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCookName() {
		return this.cookName;
	}
	public void setCookName(String cookName) {
		this.cookName = cookName;
	}

	public String getCookVersion() {
		return this.cookVersion;
	}
	public void setCookVersion(String cookVersion) {
		this.cookVersion = cookVersion;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
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

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<KbdishCookDetailInfo> getKbCookDetailList() {
		return this.kbCookDetailList;
	}
	public void setKbCookDetailList(List<KbdishCookDetailInfo> kbCookDetailList) {
		this.kbCookDetailList = kbCookDetailList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<String> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

	public String getSourceFrom() {
		return this.sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
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

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
