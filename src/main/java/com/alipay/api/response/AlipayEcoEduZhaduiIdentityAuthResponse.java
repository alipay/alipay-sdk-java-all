package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduActiveContentResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.zhadui.identity.auth response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEduZhaduiIdentityAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 3455688436553431587L;

	/** 
	 * 验证的内容列表
	 */
	@ApiListField("active_contents")
	@ApiField("edu_active_content_response")
	private List<EduActiveContentResponse> activeContents;

	/** 
	 * 请求返回时间：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("response_datetime")
	private String responseDatetime;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setActiveContents(List<EduActiveContentResponse> activeContents) {
		this.activeContents = activeContents;
	}
	public List<EduActiveContentResponse> getActiveContents( ) {
		return this.activeContents;
	}

	public void setResponseDatetime(String responseDatetime) {
		this.responseDatetime = responseDatetime;
	}
	public String getResponseDatetime( ) {
		return this.responseDatetime;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
