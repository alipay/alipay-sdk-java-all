package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 苹果查询链接接口
 *
 * @author auto create
 * @since 1.0, 2026-10-22 15:20:37
 */
public class AlipayCommerceEducateVerifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7442182773332884722L;

	/**
	 * 重定向链接列表
	 */
	@ApiListField("redirect_urls")
	@ApiField("redirect_urls")
	private List<RedirectUrls> redirectUrls;

	/**
	 * 用于传递此次验证的基本信息
	 */
	@ApiField("verify_info")
	private VerifyOrderInfo verifyInfo;

	/**
	 * 用于标识一个完整请求，一个完整请求：查询链接-验证身份-完成验证
	 */
	@ApiField("verify_request_id")
	private String verifyRequestId;

	public List<RedirectUrls> getRedirectUrls() {
		return this.redirectUrls;
	}
	public void setRedirectUrls(List<RedirectUrls> redirectUrls) {
		this.redirectUrls = redirectUrls;
	}

	public VerifyOrderInfo getVerifyInfo() {
		return this.verifyInfo;
	}
	public void setVerifyInfo(VerifyOrderInfo verifyInfo) {
		this.verifyInfo = verifyInfo;
	}

	public String getVerifyRequestId() {
		return this.verifyRequestId;
	}
	public void setVerifyRequestId(String verifyRequestId) {
		this.verifyRequestId = verifyRequestId;
	}

}
