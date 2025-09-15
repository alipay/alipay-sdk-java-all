package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业场景运营内容投放
 *
 * @author auto create
 * @since 1.0, 2022-11-16 11:13:50
 */
public class AlipayCommerceOperationContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3847432267341427116L;

	/**
	 * 展台
	 */
	@ApiListField("booth")
	@ApiField("string")
	private List<String> booth;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 内容 ID 加密串
	 */
	@ApiField("content_id_str")
	private String contentIdStr;

	/**
	 * 扩展参数 , json 串
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 蚂蚁统一open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页查询每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 运营场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 运营阵地 : 比如一个页面
	 */
	@ApiField("touch_point")
	private String touchPoint;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBooth() {
		return this.booth;
	}
	public void setBooth(List<String> booth) {
		this.booth = booth;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContentIdStr() {
		return this.contentIdStr;
	}
	public void setContentIdStr(String contentIdStr) {
		this.contentIdStr = contentIdStr;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTouchPoint() {
		return this.touchPoint;
	}
	public void setTouchPoint(String touchPoint) {
		this.touchPoint = touchPoint;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
