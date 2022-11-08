package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppTestInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.isp.test.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-21 19:26:57
 */
public class AlipayOpenOperationIspTestUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4235581146141339312L;

	/** 
	 * 应用信息列表
	 */
	@ApiListField("app_info")
	@ApiField("app_test_info")
	private List<AppTestInfo> appInfo;

	/** 
	 * 测试参数
	 */
	@ApiField("output")
	private Long output;

	public void setAppInfo(List<AppTestInfo> appInfo) {
		this.appInfo = appInfo;
	}
	public List<AppTestInfo> getAppInfo( ) {
		return this.appInfo;
	}

	public void setOutput(Long output) {
		this.output = output;
	}
	public Long getOutput( ) {
		return this.output;
	}

}
