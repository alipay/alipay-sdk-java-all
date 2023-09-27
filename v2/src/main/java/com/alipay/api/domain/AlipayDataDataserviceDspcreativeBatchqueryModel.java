package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告信息状态结果查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-24 14:27:51
 */
public class AlipayDataDataserviceDspcreativeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3517218885481173531L;

	/**
	 * 验证码
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 创意查询请求
	 */
	@ApiListField("creative_query_request")
	@ApiField("dsp_creative_query_request")
	private List<DspCreativeQueryRequest> creativeQueryRequest;

	/**
	 * dsp唯一标识
	 */
	@ApiField("dsp_id")
	private String dspId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<DspCreativeQueryRequest> getCreativeQueryRequest() {
		return this.creativeQueryRequest;
	}
	public void setCreativeQueryRequest(List<DspCreativeQueryRequest> creativeQueryRequest) {
		this.creativeQueryRequest = creativeQueryRequest;
	}

	public String getDspId() {
		return this.dspId;
	}
	public void setDspId(String dspId) {
		this.dspId = dspId;
	}

}
