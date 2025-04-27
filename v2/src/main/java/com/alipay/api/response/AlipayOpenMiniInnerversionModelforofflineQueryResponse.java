package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.modelforoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:02:17
 */
public class AlipayOpenMiniInnerversionModelforofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8386292447112144941L;

	/** 
	 * 线上版本包数据
	 */
	@ApiField("model_json")
	private String modelJson;

	/** 
	 * 同步ID，同步失败时便于去线上追溯
	 */
	@ApiField("sync_id")
	private String syncId;

	public void setModelJson(String modelJson) {
		this.modelJson = modelJson;
	}
	public String getModelJson( ) {
		return this.modelJson;
	}

	public void setSyncId(String syncId) {
		this.syncId = syncId;
	}
	public String getSyncId( ) {
		return this.syncId;
	}

}
