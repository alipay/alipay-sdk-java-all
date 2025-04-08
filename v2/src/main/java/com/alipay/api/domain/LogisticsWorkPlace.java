package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流作业平台作业位置模型
 *
 * @author auto create
 * @since 1.0, 2025-02-28 14:25:46
 */
public class LogisticsWorkPlace extends AlipayObject {

	private static final long serialVersionUID = 3631313383775128651L;

	/**
	 * 描述铺设位置。对于铺设位置的进一步描述，方便进行作业区分。例如：主柜、副柜、驿站内1号柜。
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 铺设完成后，用户碰一下该线圈，实际需要跳转的地址
	 */
	@ApiField("mini_app_redirect_url")
	private String miniAppRedirectUrl;

	/**
	 * 铺设位置地址。如果该值为空，铺设位置会取值铺设点位的位置信息
	 */
	@ApiField("work_place_address")
	private BusinessAddress workPlaceAddress;

	/**
	 * 表示线圈铺设实际铺设位置。例如：一个柜组下有3个柜子需要铺设线圈，柜组为铺设点位，待铺设的柜子为实际铺设位置。
	 */
	@ApiField("work_place_id")
	private String workPlaceId;

	/**
	 * 表示线圈铺设实际铺设位置。例如：一个柜组下有3个柜子需要铺设线圈，柜组为铺设点位，待铺设的柜子为实际铺设位置。
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
