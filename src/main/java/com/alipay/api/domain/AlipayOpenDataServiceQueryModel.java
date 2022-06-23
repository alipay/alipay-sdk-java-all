package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索服务信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class AlipayOpenDataServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7342663318848636537L;

	/**
	 * 发起查询的客户端版本号
	 */
	@ApiField("client_info")
	private ClientInfo clientInfo;

	/**
	 * 每页最多显示的搜索结果数量，默认值20
	 */
	@ApiField("limit_size")
	private Long limitSize;

	/**
	 * 用户所处的地理位置信息
	 */
	@ApiField("location_info")
	private LocationInfo locationInfo;

	/**
	 * 用户输入的搜索请求
	 */
	@ApiField("query")
	private String query;

	/**
	 * 场景code，由appxsearch分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户每发起一次请求的唯一ID
	 */
	@ApiField("search_id")
	private String searchId;

	/**
	 * 同一个用户同一个session中发起的搜索请求
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 显示搜索结果的起始位置，默认值0
	 */
	@ApiField("start_num")
	private Long startNum;

	/**
	 * 用户的支付宝ID
	 */
	@ApiField("user_id")
	private String userId;

	public ClientInfo getClientInfo() {
		return this.clientInfo;
	}
	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public Long getLimitSize() {
		return this.limitSize;
	}
	public void setLimitSize(Long limitSize) {
		this.limitSize = limitSize;
	}

	public LocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSearchId() {
		return this.searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Long getStartNum() {
		return this.startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
