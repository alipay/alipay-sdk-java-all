package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区域信息（包括印模信息）
 *
 * @author auto create
 * @since 1.0, 2024-09-05 15:23:11
 */
public class CaSystemSignAreaRequest extends AlipayObject {

	private static final long serialVersionUID = 7525326342317982541L;

	/**
	 * 骑缝章信息
	 */
	@ApiField("ca_system_cross_page_request")
	private CaSystemCrossPageRequest caSystemCrossPageRequest;

	/**
	 * 正文章信息
	 */
	@ApiField("ca_system_main_body_request")
	private CaSystemMainBodyRequest caSystemMainBodyRequest;

	/**
	 * TOP_LEFT("TOP_LEFT", "左上角对齐"),
    BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"),
    CENTER("CENTER", "xy值是印章的中心"),
    TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"),
    BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角");
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 签署位置类型，1-正文，2-骑缝
	 */
	@ApiField("position_type")
	private String positionType;

	/**
	 * 印章id 联系签署中心获取
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 签署印模信息。osskey或者url
	 */
	@ApiField("seal_pic_addr")
	private String sealPicAddr;

	public CaSystemCrossPageRequest getCaSystemCrossPageRequest() {
		return this.caSystemCrossPageRequest;
	}
	public void setCaSystemCrossPageRequest(CaSystemCrossPageRequest caSystemCrossPageRequest) {
		this.caSystemCrossPageRequest = caSystemCrossPageRequest;
	}

	public CaSystemMainBodyRequest getCaSystemMainBodyRequest() {
		return this.caSystemMainBodyRequest;
	}
	public void setCaSystemMainBodyRequest(CaSystemMainBodyRequest caSystemMainBodyRequest) {
		this.caSystemMainBodyRequest = caSystemMainBodyRequest;
	}

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getPositionType() {
		return this.positionType;
	}
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

	public String getSealPicAddr() {
		return this.sealPicAddr;
	}
	public void setSealPicAddr(String sealPicAddr) {
		this.sealPicAddr = sealPicAddr;
	}

}
