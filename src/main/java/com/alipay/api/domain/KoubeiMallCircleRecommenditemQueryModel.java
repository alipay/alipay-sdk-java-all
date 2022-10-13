package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于LBS查询附近生活圈的推荐商品信息
 *
 * @author auto create
 * @since 1.0, 2020-07-06 10:12:20
 */
public class KoubeiMallCircleRecommenditemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1363248798238375484L;

	/**
	 * 口碑城市编码（示例：杭州市330100）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 身份ID，识别合作方身份（可联系口碑综合体业务获取）
	 */
	@ApiField("data_set_id")
	private String dataSetId;

	/**
	 * 展示渠道：ALIPAY_APP KOUBEI_APP TAOBAO_APP（默认ALIPAY_APP）
	 */
	@ApiField("display_channel")
	private String displayChannel;

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
	 * 每页查询量，默认为10，每页最大查询量不能超过50，最小查询量不能低于1
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询起始值，默认为0
	 */
	@ApiField("start")
	private Long start;

	/**
	 * 终端设备描述(中、英文均可)
	 */
	@ApiField("terminal_type")
	private String terminalType;

	/**
	 * 生活圈ID；参数不为空，表明指定是生活圈
	 */
	@ApiField("tribe_id")
	private String tribeId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDataSetId() {
		return this.dataSetId;
	}
	public void setDataSetId(String dataSetId) {
		this.dataSetId = dataSetId;
	}

	public String getDisplayChannel() {
		return this.displayChannel;
	}
	public void setDisplayChannel(String displayChannel) {
		this.displayChannel = displayChannel;
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

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStart() {
		return this.start;
	}
	public void setStart(Long start) {
		this.start = start;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getTribeId() {
		return this.tribeId;
	}
	public void setTribeId(String tribeId) {
		this.tribeId = tribeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
