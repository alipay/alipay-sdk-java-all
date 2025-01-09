package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.dmp.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-07 10:37:02
 */
public class AlipayDataDataserviceAdDmpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7498766126832251589L;

	/** 
	 * 创建或更新人群包成功时返回的人群包编码
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/** 
	 * 创建或更新人群包成功时返回的人群包名称，人群包名称不能重复
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/** 
	 * 调用接口上传设备号数据时返回的创建、更新人群状态。
	 */
	@ApiField("status")
	private String status;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}
	public String getCrowdName( ) {
		return this.crowdName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
