package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertifyPlatformInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.temporaryvisitorstag.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-25 19:31:45
 */
public class AlipayEbppCommunityTemporaryvisitorstagVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4622153874591879522L;

	/** 
	 * 认证平台链接列表
	 */
	@ApiListField("certify_platform_info_list")
	@ApiField("certify_platform_info")
	private List<CertifyPlatformInfo> certifyPlatformInfoList;

	/** 
	 * 核验结果
1 为通过
0 为核验失败
	 */
	@ApiField("result")
	private String result;

	public void setCertifyPlatformInfoList(List<CertifyPlatformInfo> certifyPlatformInfoList) {
		this.certifyPlatformInfoList = certifyPlatformInfoList;
	}
	public List<CertifyPlatformInfo> getCertifyPlatformInfoList( ) {
		return this.certifyPlatformInfoList;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
