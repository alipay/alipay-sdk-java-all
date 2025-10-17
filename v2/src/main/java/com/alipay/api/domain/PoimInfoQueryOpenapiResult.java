package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店点位信息查询结果数据
 *
 * @author auto create
 * @since 1.0, 2025-03-04 20:04:42
 */
public class PoimInfoQueryOpenapiResult extends AlipayObject {

	private static final long serialVersionUID = 3356856818783986548L;

	/**
	 * 点位地址查询结果数据
	 */
	@ApiField("area_info")
	private PoimAddressQueryOpenapiResult areaInfo;

	/**
	 * 点位id
	 */
	@ApiField("poim_id")
	private String poimId;

	/**
	 * 点位名称
	 */
	@ApiField("poim_name")
	private String poimName;

	/**
	 * 旅行景区ID
	 */
	@ApiField("scenic_id")
	private String scenicId;

	public PoimAddressQueryOpenapiResult getAreaInfo() {
		return this.areaInfo;
	}
	public void setAreaInfo(PoimAddressQueryOpenapiResult areaInfo) {
		this.areaInfo = areaInfo;
	}

	public String getPoimId() {
		return this.poimId;
	}
	public void setPoimId(String poimId) {
		this.poimId = poimId;
	}

	public String getPoimName() {
		return this.poimName;
	}
	public void setPoimName(String poimName) {
		this.poimName = poimName;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

}
