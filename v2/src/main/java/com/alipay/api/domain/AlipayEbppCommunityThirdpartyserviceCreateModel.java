package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方小程序服务创建
 *
 * @author auto create
 * @since 1.0, 2023-07-19 17:21:15
 */
public class AlipayEbppCommunityThirdpartyserviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3725284482428679467L;

	/**
	 * 服务验收视频链接
	 */
	@ApiField("check_video_url")
	private String checkVideoUrl;

	/**
	 * 支付宝小区编码，由支付宝分配，可在创建小区接口的返回中获取
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 外部小区id
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 服务编码，由支付宝分配
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务的访问地址，必须是alipays开头，最长1024字符，必填
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getCheckVideoUrl() {
		return this.checkVideoUrl;
	}
	public void setCheckVideoUrl(String checkVideoUrl) {
		this.checkVideoUrl = checkVideoUrl;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
