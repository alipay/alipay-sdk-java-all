package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态客户数据导入服务
 *
 * @author auto create
 * @since 1.0, 2026-01-09 13:57:44
 */
public class AlipayCommerceEdasEcodataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1558657718712941692L;

	/**
	 * 数据场景代码
	 */
	@ApiField("data_scene_code")
	private String dataSceneCode;

	/**
	 * 项目ID
	 */
	@ApiField("industry_id")
	private String industryId;

	/**
	 * 租户id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 景区数据
	 */
	@ApiField("location_data")
	private LocationData locationData;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getDataSceneCode() {
		return this.dataSceneCode;
	}
	public void setDataSceneCode(String dataSceneCode) {
		this.dataSceneCode = dataSceneCode;
	}

	public String getIndustryId() {
		return this.industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public LocationData getLocationData() {
		return this.locationData;
	}
	public void setLocationData(LocationData locationData) {
		this.locationData = locationData;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
