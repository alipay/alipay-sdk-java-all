package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ai open search搜索接口
 *
 * @author auto create
 * @since 1.0, 2022-12-13 15:09:49
 */
public class AlipayOpenMiniCloudAositemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3889197443281118494L;

	/**
	 * 需要进行聚合返回的字段，如需要对搜索的结果的发货地字段进行聚合，则将发货地对应的字段名称传给后段既可
	 */
	@ApiField("aggregation_field")
	private String aggregationField;

	/**
	 * 类目列表，搜索结果只会包含该类目的商品，为空时代表返回所有的商品。多个条件是与的关系。
	 */
	@ApiListField("cate")
	@ApiField("string")
	private List<String> cate;

	/**
	 * 用户当前城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 客户端环境
	 */
	@ApiField("client_env")
	private String clientEnv;

	/**
	 * 用户设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 指定要返回的item字段，多个用","分割
	 */
	@ApiField("ext_rep_filed")
	private String extRepFiled;

	/**
	 * "字段名":"字段值"
支持指定多个字段是与的关系
单个字段支持 AND 和 OR 操作符号
如要搜索标签为test或者ce的数据，传值的时候通过OR操作符指定:["tags:test OR ce","brand:iphone"]
如要搜索标签为test和ce的数据，传值的时候通过AND操作符指定:["tags:test AND ce"]
	 */
	@ApiListField("filters")
	@ApiField("string")
	private List<String> filters;

	/**
	 * 待提权候选集itemId列表，用于调用方指定提升特定i名次tem的范围，搜索接口将对传入的item进行打分，可为空。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 排序字段，"+"对应字段名 按字段正序，"-"对应字段名 按字段降序，支持指定多个。
	 */
	@ApiListField("orders")
	@ApiField("string")
	private List<String> orders;

	/**
	 * 当前页码，第一页是1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的大小，取值范围是1~100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 32	商家在蚂蚁搜索引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 搜索的关键词
	 */
	@ApiField("query")
	private String query;

	/**
	 * 可以关联到用户的标识信息，用于关联用户的特征。例如手机号、设备号、邮箱等。格式为：“类型#sha256(值）”，类型枚举有：PHONE（手机号）、DEVICE（设备号）、EMAIL（邮箱）等，具体的值是用sha256进行哈希之后的hex表示，多个标识信息用,分割
	 */
	@ApiField("relevant_id")
	private String relevantId;

	/**
	 * 标签列表，搜索结果只会包含该标签的商品，为空时代表返回所有的商品。多个条件是与的关系。
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id的类型，可选值：ALIPAY（支付宝userid）、CUSTOM（商家自定义的userid）
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getAggregationField() {
		return this.aggregationField;
	}
	public void setAggregationField(String aggregationField) {
		this.aggregationField = aggregationField;
	}

	public List<String> getCate() {
		return this.cate;
	}
	public void setCate(List<String> cate) {
		this.cate = cate;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClientEnv() {
		return this.clientEnv;
	}
	public void setClientEnv(String clientEnv) {
		this.clientEnv = clientEnv;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExtRepFiled() {
		return this.extRepFiled;
	}
	public void setExtRepFiled(String extRepFiled) {
		this.extRepFiled = extRepFiled;
	}

	public List<String> getFilters() {
		return this.filters;
	}
	public void setFilters(List<String> filters) {
		this.filters = filters;
	}

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOrders() {
		return this.orders;
	}
	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRelevantId() {
		return this.relevantId;
	}
	public void setRelevantId(String relevantId) {
		this.relevantId = relevantId;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
