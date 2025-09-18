package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * poi数据回流模型
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:33:16
 */
public class PoiSyncData extends AlipayObject {

	private static final long serialVersionUID = 2675768221374443678L;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * poi的id
	 */
	@ApiListField("poi_codes")
	@ApiField("string")
	private List<String> poiCodes;

	/**
	 * 12
	 */
	@ApiField("type")
	private String type;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<String> getPoiCodes() {
		return this.poiCodes;
	}
	public void setPoiCodes(List<String> poiCodes) {
		this.poiCodes = poiCodes;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
