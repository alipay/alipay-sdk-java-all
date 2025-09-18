package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放数据通用查询
 *
 * @author auto create
 * @since 1.0, 2025-09-09 16:49:47
 */
public class AlipayDataDataserviceAdReportdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6765147868824658983L;

	/**
	 * 数据维度：
ORDER-订单；
PLAN-计划；
GROUP-单元；
CREATIVE-创意；
MARKET_TARGET-营销目标；
PRINCIPAL-商家;
MATERIAL-素材 （仅biz_version=2.0版本且为全域智投场景下支持素材层级数据）
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
	 * 权限token,唯一值,在广告投放平台代理商详情获取。<a href="https://opendocs.alipay.com/xlight/0eu31u?pathHash=79e13a13">获取文档</a>
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 传值为2.0时入参：show_conv_data、conv_time_join_rule、query_type=HOUR，出参：cost_format、cpm、click_rate、cpc、conv_result、cvr、avg_conv_cost生效。
仅2.0版本支持素材维度数据查询
	 */
	@ApiField("biz_version")
	private String bizVersion;

	/**
	 * 转化指标Code数组，
当ad_level= MATERIAL的时候，不传，默认输出9个基础指标数据，且最多查询50个；
其他ad_level层级时，不传默认全部，传入按实际传入指标出数据。
指标信息获取方式：alipay.data.dataservice.ad.reportmetric.query
	 */
	@ApiListField("conv_code_list")
	@ApiField("string")
	private List<String> convCodeList;

	/**
	 * 转化时间归因：将广告带来的转化数据统计到广告转化发生（或广告转化回传）时间；
计费时间归因：将广告带来的转化数据统计到广告计费对应的事件（点击或曝光）发生时间;
【默认转化时间归因】
	 */
	@ApiField("conv_time_join_rule")
	private String convTimeJoinRule;

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
	 * 数据查询结束时间，查询时间不能大于最近7天(query_type为HOUR时最大1天)，时间格式：yyyyMMdd【最大时间-最小时间<=7时间左闭右闭】
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
	 * 素材维度，当ad_level= MATERIAL的时候，必填
	 */
	@ApiField("material_level")
	private String materialLevel;

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
	 * 素材层级时，可以传入
广告投放平台生成的图片ID，此为数据筛选条件不影响数据汇总纬度
	 */
	@ApiListField("photo_id_list")
	@ApiField("string")
	private List<String> photoIdList;

	/**
	 * 广告投放平台生成的计划ID，此为数据筛选条件不影响数据汇总纬度。
	 */
	@ApiListField("plan_id_list")
	@ApiField("string")
	private List<String> planIdList;

	/**
	 * 代理商商家标识,在广告投放平台代理商详情获取。<a href="https://opendocs.alipay.com/xlight/0eucvz?pathHash=dc01fadb">获取文档</a>
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 数据汇总方式：汇总/明细分天/明细分小时。
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
	 * 接口出参是否透出转化指标数据，默认true；
	 */
	@ApiField("show_conv_data")
	private Boolean showConvData;

	/**
	 * 数据查询开始时间，查询时间不能大于最近7天(query_type为HOUR时最大1天)，时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 素材层级时，参数生效
广告投放平台生成的视频ID，此为数据筛选条件不影响数据汇总纬度
	 */
	@ApiListField("video_id_list")
	@ApiField("string")
	private List<String> videoIdList;

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

	public String getBizVersion() {
		return this.bizVersion;
	}
	public void setBizVersion(String bizVersion) {
		this.bizVersion = bizVersion;
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

	public String getMaterialLevel() {
		return this.materialLevel;
	}
	public void setMaterialLevel(String materialLevel) {
		this.materialLevel = materialLevel;
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

	public List<String> getPhotoIdList() {
		return this.photoIdList;
	}
	public void setPhotoIdList(List<String> photoIdList) {
		this.photoIdList = photoIdList;
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

	public List<String> getVideoIdList() {
		return this.videoIdList;
	}
	public void setVideoIdList(List<String> videoIdList) {
		this.videoIdList = videoIdList;
	}

}
