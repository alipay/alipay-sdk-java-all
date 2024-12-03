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
 * @since 1.0, 2021-07-09 11:02:37
 */
public class AlipayMarketingIotBoothQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7487125881373991875L;

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

	/** 
	 * 展位可用性结果，描述当前入参是否存在可用展位
	 */
	@ApiField("usable")
	private Boolean usable;

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

	public void setUsable(Boolean usable) {
		this.usable = usable;
	}
	public Boolean getUsable( ) {
		return this.usable;
	}

}
