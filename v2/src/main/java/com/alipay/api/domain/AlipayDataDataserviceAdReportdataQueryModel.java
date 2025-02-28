package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放数据通用查询
 *
 * @author auto create
 * @since 1.0, 2024-05-11 18:12:34
 */
public class AlipayDataDataserviceAdReportdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1826439764614128723L;

	/**
	 * 数据维度：
ORDER-订单；
PLAN-计划；
GROUP-单元；
CREATIVE-创意；
MARKET_TARGET-营销目标；
PRINCIPAL-商家;
【不同数据维度决定了出参data_id代表的数据类型不一样分别为plan_id,group_id,order_id,creative_id，营销目标和商家维度时data_id为空且不返回conversion_data_list数据】
	 */
	@ApiField("ad_level")
	private String adLevel;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串。登录校验和可反查出user_id。
【alipay_pid和principal_tag使用方法：若为代理商会获取代理商下指定委托人数据。若是直客会获取自身的合计数据。】
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 权限token,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 广告投放平台生成的创意ID，此为数据筛选条件不影响数据汇总纬度。
	 */
	@ApiListField("creative_id_list")
	@ApiField("string")
	private List<String> creativeIdList;

	/**
	 * 分页查询的页码从1开始
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 投放模式（订单/计划/单元/创意id_list都为空时此参数有效）：
STANDARD_TOUFANG-标准三段式；
TRUST_TOUFANG-托管式；
	 */
	@ApiField("delivery_mode")
	private String deliveryMode;

	/**
	 * 数据查询结束时间，查询时间不能大于最近7天，时间格式：yyyyMMdd【最大时间-最小时间<=7时间左闭右闭】
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 广告投放平台生成的单元ID，此为数据筛选条件不影响数据汇总纬度。
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	/**
	 * 广告投放平台生成的订单ID，此为数据筛选条件不影响数据汇总纬度。
	 */
	@ApiListField("order_id_list")
	@ApiField("string")
	private List<String> orderIdList;

	/**
	 * 分页查询时每页返回条数最大1万，按明细汇总时按日期倒序
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 广告投放平台生成的计划ID，此为数据筛选条件不影响数据汇总纬度。
	 */
	@ApiListField("plan_id_list")
	@ApiField("string")
	private List<String> planIdList;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 数据汇总方式。SUM-汇总；DETAIL-明细分天；
【SUM时：根据ad_level汇总为单条数据。
DETAIL时：汇总成分天x ad_level的多条数据】
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 投放方式：SceneType：
INTELLIGENT-全域智投
SEARCH-搜索
APP-端内展示
BRAND-品牌投放
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 数据查询开始时间，查询时间不能大于最近7天，时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAdLevel() {
		return this.adLevel;
	}
	public void setAdLevel(String adLevel) {
		this.adLevel = adLevel;
	}

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

	public List<String> getCreativeIdList() {
		return this.creativeIdList;
	}
	public void setCreativeIdList(List<String> creativeIdList) {
		this.creativeIdList = creativeIdList;
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

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public List<String> getOrderIdList() {
		return this.orderIdList;
	}
	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPlanIdList() {
		return this.planIdList;
	}
	public void setPlanIdList(List<String> planIdList) {
		this.planIdList = planIdList;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
