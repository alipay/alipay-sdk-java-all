package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotContentModuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.iot.booth.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-07 11:15:43
 */
public class AlipayMarketingIotBoothQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543618385165413387L;

	/** 
	 * 用于链路埋点，识别权益触发链路
	 */
	@ApiField("booth_token")
	private String boothToken;

	/** 
	 * 展位结果列表
	 */
	@ApiListField("content_list")
	@ApiField("iot_content_module_info")
	private List<IotContentModuleInfo> contentList;

	/** 
	 * 渲染引擎类型
	 */
	@ApiField("engine_type")
	private String engineType;

	public void setBoothToken(String boothToken) {
		this.boothToken = boothToken;
	}
	public String getBoothToken( ) {
		return this.boothToken;
	}

	public void setContentList(List<IotContentModuleInfo> contentList) {
		this.contentList = contentList;
	}
	public List<IotContentModuleInfo> getContentList( ) {
		return this.contentList;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineType( ) {
		return this.engineType;
	}

}
