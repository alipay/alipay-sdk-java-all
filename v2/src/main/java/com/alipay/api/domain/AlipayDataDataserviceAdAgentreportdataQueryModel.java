package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告代理商投放数据查询
 *
 * @author auto create
 * @since 1.0, 2025-03-21 11:50:25
 */
public class AlipayDataDataserviceAdAgentreportdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5846421344333722976L;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串,代理商自身PID。
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 权限token,唯一值,在广告投放平台代理商详情获取。
<a href="https://opendocs.alipay.com/xlight/0eu31u?pathHash=79e13a13">获取文档</a>
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 转化指标code数组
	 */
	@ApiListField("conv_code_list")
	@ApiField("string")
	private List<String> convCodeList;

	/**
	 * 转化时间归因：将广告带来的转化数据统计到广告转化发生（或广告转化回传）时间； 计费时间归因：将广告带来的转化数据统计到广告计费对应的事件（点击或曝光）发生时间; 【默认转化时间归因】
	 */
	@ApiField("conv_time_join_rule")
	private String convTimeJoinRule;

	/**
	 * 分页查询的页码从1开始
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 投放模式
	 */
	@ApiField("delivery_mode")
	private String deliveryMode;

	/**
	 * 数据查询结束时间；汇总和分天查询时间范围不能大于7天，分时查询为1天；时间格式：yyyyMMdd【最大时间-最小时间<=7时间左闭右闭】
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 分页查询时每页返回条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 代理商商家标识,在广告投放平台代理商详情获取。<a href="https://opendocs.alipay.com/xlight/0eucvz?pathHash=dc01fadb">获取文档</a>
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 若未输入返回所有商家数据；
若输入了返回对应商家数据，要筛选查询的商家的标识，在广告投放平台商家详情获取。
	 */
	@ApiListField("principal_tag_list")
	@ApiField("string")
	private List<String> principalTagList;

	/**
	 * 数据汇总方式：汇总/明细分天/明细分小时。
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 接口出参是否透出转化指标数据，默认true；
	 */
	@ApiField("show_conv_data")
	private Boolean showConvData;

	/**
	 * 数据查询开始时间；汇总和分天查询时间范围不能大于7天,分时为1天；时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<String> getConvCodeList() {
		return this.convCodeList;
	}
	public void setConvCodeList(List<String> convCodeList) {
		this.convCodeList = convCodeList;
	}

	public String getConvTimeJoinRule() {
		return this.convTimeJoinRule;
	}
	public void setConvTimeJoinRule(String convTimeJoinRule) {
		this.convTimeJoinRule = convTimeJoinRule;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getDeliveryMode() {
		return this.deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public List<String> getPrincipalTagList() {
		return this.principalTagList;
	}
	public void setPrincipalTagList(List<String> principalTagList) {
		this.principalTagList = principalTagList;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public Boolean getShowConvData() {
		return this.showConvData;
	}
	public void setShowConvData(Boolean showConvData) {
		this.showConvData = showConvData;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
