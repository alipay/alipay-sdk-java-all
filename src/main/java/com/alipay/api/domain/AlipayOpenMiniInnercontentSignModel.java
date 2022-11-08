package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文件内容加签
 *
 * @author auto create
 * @since 1.0, 2022-03-07 19:04:10
 */
public class AlipayOpenMiniInnercontentSignModel extends AlipayObject {

	private static final long serialVersionUID = 1346467572499675348L;

	/**
	 * 文本内容
	 */
	@ApiListField("content_list")
	@ApiField("sign_content_body_request")
	private List<SignContentBodyRequest> contentList;

	/**
	 * 租户类型，由应用中心分配
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public List<SignContentBodyRequest> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<SignContentBodyRequest> contentList) {
		this.contentList = contentList;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
