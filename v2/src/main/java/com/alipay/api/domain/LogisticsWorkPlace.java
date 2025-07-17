package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流作业平台铺设点模型
 *
 * @author auto create
 * @since 1.0, 2025-04-22 10:30:13
 */
public class LogisticsWorkPlace extends AlipayObject {

	private static final long serialVersionUID = 7662191945156195373L;

	/**
	 * 对于铺设点的进一步描述，该值目前不会在作业小程序上展示，仅用作内部标识
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 铺设完成后，用户碰一下该线圈，实际需要跳转的地址
	 */
	@ApiField("mini_app_redirect_url")
	private String miniAppRedirectUrl;

	/**
	 * 铺设点地址。如果该值为空，铺设点地址会取值上层点位的位置信息
	 */
	@ApiField("work_place_address")
	private BusinessAddress workPlaceAddress;

	/**
	 * 物流行业作业平台线圈作业时的最小铺设单位。
例如：蚂蚁A空间北门的柜组下有3个柜子需要铺设线圈。柜组ID=点位ID，柜子ID=铺设点ID
	 */
	@ApiField("work_place_id")
	private String workPlaceId;

	/**
	 * 物流行业作业平台线圈作业时的最小铺设单位。
例如：蚂蚁A空间北门的柜组下有3个柜子需要铺设线圈。柜组ID=点位ID，柜子ID=铺设点ID
	 */
	@ApiField("work_place_name")
	private String workPlaceName;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMiniAppRedirectUrl() {
		return this.miniAppRedirectUrl;
	}
	public void setMiniAppRedirectUrl(String miniAppRedirectUrl) {
		this.miniAppRedirectUrl = miniAppRedirectUrl;
	}

	public BusinessAddress getWorkPlaceAddress() {
		return this.workPlaceAddress;
	}
	public void setWorkPlaceAddress(BusinessAddress workPlaceAddress) {
		this.workPlaceAddress = workPlaceAddress;
	}

	public String getWorkPlaceId() {
		return this.workPlaceId;
	}
	public void setWorkPlaceId(String workPlaceId) {
		this.workPlaceId = workPlaceId;
	}

	public String getWorkPlaceName() {
		return this.workPlaceName;
	}
	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}

}
